package org.Controlador;

import org.Enums.Adoptado;
import org.Enums.Sexo;
import org.Enums.Tipo_via;
import org.Modelo.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogpuccinoUtils {

    private List<List<Perro>> poolPerros = new ArrayList<>();
    private List<Perro> perrosRestantes = obtenerPerros();
    private List<Cliente> clientes = obtenerClientes();
    private List<Protectora> protectoras = obtenerProtectoras();
    private List<Usuario> usuarios = obtenerUsuarios();
    private List<Notificacion> notificaciones = obtenerNotificaciones();

    public DogpuccinoUtils() throws SQLException {}

    public List<Perro> getActualPerros() {
        if (poolPerros.isEmpty()) {
            return Collections.emptyList();
        }
        return poolPerros.get(poolPerros.size() - 1);
    }

    public void ejecutarCRUD(String sql) {
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conn.createStatement()) {

            int filas = stmt.executeUpdate(sql);
            System.out.println("Filas afectadas: " + filas);

        } catch (SQLException e) {
            System.err.println("Error al ejecutar SQL: " + e.getMessage());
        }
    }

    public ResultSet ejecutarConsulta(String sql) {
        ResultSet rs = null;
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conn.createStatement()) {

            rs = stmt.executeQuery(sql);

        } catch (SQLException e) {
            System.err.println("Error al ejecutar SQL: " + e.getMessage());
        }
        return rs;
    }

    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("""
                 SELECT 
                     id,
                     nombre,
                     apellido1,
                     apellido2,
                     tipo_via,
                     via,
                     codigo_postal,
                     ciudad,
                     provincia,
                     correo_electronico,
                     fecha_nacimiento,
                     telefono,
                     fecha_nacimiento
                 FROM C##DOGPUCCINO.CLIENTES
             """)) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido1(rs.getString("apellido1"));
                cliente.setApellido2(rs.getString("apellido2"));
                cliente.setTipo_via(Tipo_via.valueOf(rs.getString("tipo_via")));
                cliente.setNombre_via(rs.getString("via"));
                cliente.setCodigo_postal(rs.getString("codigo_postal"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setProvincia(rs.getString("provincia"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo_electronico(rs.getString("correo_electronico"));
                cliente.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Protectora> obtenerProtectoras() {
        List<Protectora> protectoras = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("""
             SELECT
                 cif,
                 nombre,
                 tipo_via,
                 via,
                 codigo_postal,
                 ciudad,
                 provincia,
                 tiktok,
                 instagram,
                 twitter,
                 telefono
             FROM C##DOGPUCCINO.PROTECTORA_ANIMALES
         """)) {

            while (rs.next()) {
                Protectora protectora = new Protectora();
                protectora.setCif(rs.getString("cif"));
                protectora.setNombre(rs.getString("nombre"));
                protectora.setTipo_via(Tipo_via.valueOf(rs.getString("tipo_via")));
                protectora.setNombre_via(rs.getString("via"));
                protectora.setCodigo_postal(rs.getString("codigo_postal"));
                protectora.setCiudad(rs.getString("ciudad"));
                protectora.setProvincia(rs.getString("provincia"));
                protectora.setTiktok(rs.getString("tiktok"));
                protectora.setInstagram(rs.getString("instagram"));
                protectora.setTwitter(rs.getString("twitter"));
                protectora.setTelefono(rs.getString("telefono"));
                protectoras.add(protectora);
            }
            return protectoras;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Protectora> getProtectoras() {
        return protectoras;
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("""
             SELECT
                 id,
                 nombre,
                 contrasenya,
                 id_cliente,
                 id_protectora
             FROM C##DOGPUCCINO.USUARIOS
         """)) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContrasenya(rs.getString("contrasenya"));
                usuario.setCliente(rs.getObject("id_cliente") != null ? clientes.stream().filter(c -> {
                    try {
                        return c.getId() == rs.getInt("id_cliente");
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }).findFirst().orElse(null) : null);
                usuario.setProtectora(rs.getObject("id_protectora") != null ? protectoras.stream().filter(p -> {
                    try {
                        return p.getCif().equals(rs.getString("id_protectora"));
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }).findFirst().orElse(null) : null);
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Notificacion> obtenerNotificaciones() {
        List<Notificacion> notificaciones = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("""
             SELECT
                 id,
                 descripcion
             FROM C##DOGPUCCINO.NOTIFICACION
         """)) {

            while (rs.next()) {
                Notificacion notificacion = new Notificacion();
                notificacion.setId(rs.getInt("id"));
                notificacion.setDescripcion(rs.getString("descripcion"));
                notificaciones.add(notificacion);
            }
            return notificaciones;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Perro> obtenerPerros() throws SQLException {
        List<Perro> perros = new ArrayList<>();
        try (Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##DOGPUCCINO", "123456");
             Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery("""
                 SELECT 
                     id,
                     nombre,
                     sexo,
                     foto,
                     adoptado,
                     fecha_nacimiento,
                     fecha_alta,
                     fecha_modificacion,
                     id_protectora,
                     id_raza
                 FROM C##DOGPUCCINO.PERROS
             """)) {

            while (rs.next()) {
                Perro perro = new Perro();
                perro.setId(rs.getInt("id"));
                perro.setNombre(rs.getString("nombre"));
                perro.setSexo(Sexo.valueOf(rs.getString("sexo")));
                perro.setFoto(rs.getString("foto"));
                perro.setAdoptado(Adoptado.valueOf(rs.getString("adoptado")));
                perro.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                perro.setFechaAlta(rs.getDate("fecha_alta").toLocalDate());
                perro.setFechaModificacion(rs.getDate("fecha_modificacion").toLocalDate());
                perro.setProtectora();
                perro.setRaza(rs.getString("raza_nombre"));
                perros.add(perro);
            }
            return perros;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Perro> elegirPerros() {
        if (perrosRestantes.size() < 3) {
            throw new IllegalArgumentException("No hay más perros disponibles para seleccionar.");
        }
        List<Perro> seleccionados = new ArrayList<>(perrosRestantes.subList(0, 3));
        for (int i = 0; i < 3; i++) {
            perrosRestantes.remove(0);
        }
        poolPerros.add(seleccionados);
        return seleccionados;
    }
}
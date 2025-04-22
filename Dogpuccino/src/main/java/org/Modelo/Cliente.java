package org.Modelo;
import org.Enums.Tipo_via;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nombre_via;
    private Tipo_via tipo_via;
    private String codigo_postal;
    private String ciudad;
    private String provincia;
    private String correo_electronico;
    private String telefono;
    private LocalDate fecha_nacimiento;
    private LocalDate fecha_alta;
    private LocalDate fecha_modificacion;

    public Cliente(int id, String nombre, String apellido1, String apellido2, String nombre_via, Tipo_via tipo_via, String codigo_postal, String ciudad, String provincia, String correo_electronico, String telefono, LocalDate fecha_nacimiento, LocalDate fecha_alta, LocalDate fecha_modificacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre_via = nombre_via;
        this.tipo_via = tipo_via;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_alta = fecha_alta;
        this.fecha_modificacion = fecha_modificacion;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre_via() {
        return nombre_via;
    }

    public void setNombre_via(String nombre_via) {
        this.nombre_via = nombre_via;
    }

    public Tipo_via getTipo_via() {
        return tipo_via;
    }

    public void setTipo_via(Tipo_via tipo_via) {
        this.tipo_via = tipo_via;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDate fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public LocalDate getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(LocalDate fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido1, cliente.apellido1) && Objects.equals(apellido2, cliente.apellido2) && Objects.equals(nombre_via, cliente.nombre_via) && tipo_via == cliente.tipo_via && Objects.equals(codigo_postal, cliente.codigo_postal) && Objects.equals(ciudad, cliente.ciudad) && Objects.equals(provincia, cliente.provincia) && Objects.equals(correo_electronico, cliente.correo_electronico) && Objects.equals(telefono, cliente.telefono) && Objects.equals(fecha_nacimiento, cliente.fecha_nacimiento) && Objects.equals(fecha_alta, cliente.fecha_alta) && Objects.equals(fecha_modificacion, cliente.fecha_modificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido1, apellido2, nombre_via, tipo_via, codigo_postal, ciudad, provincia, correo_electronico, telefono, fecha_nacimiento, fecha_alta, fecha_modificacion);
    }
}

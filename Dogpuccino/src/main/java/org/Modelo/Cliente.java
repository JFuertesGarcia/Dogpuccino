package org.Modelo;
import org.Enums.Tipo_via;

import java.time.LocalDate;

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

    public Cliente(LocalDate fecha_nacimiento, String telefono, String correo_electronico, String provincia, String ciudad, String codigo_postal, Tipo_via tipo_via, String nombre_via, String apellido2, String apellido1, String nombre, int id) {
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
        this.tipo_via = tipo_via;
        this.nombre_via = nombre_via;
        this.apellido2 = apellido2;
        this.apellido1 = apellido1;
        this.nombre = nombre;
        this.id = id;
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
}

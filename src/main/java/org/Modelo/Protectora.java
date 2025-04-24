package org.Modelo;

import org.Enums.Tipo_via;

import java.time.LocalDate;
import java.util.Objects;

public class Protectora {
    private String cif;
    private String nombre;
    private String nombre_via;
    private Tipo_via tipo_via;
    private String codigo_postal;
    private String ciudad;
    private String provincia;
    private String tiktok;
    private String twitter;
    private String instagram;
    private String telefono;
    private LocalDate fecha_alta;
    private LocalDate fecha_modificacion;

    public Protectora(String cif, String nombre, String nombre_via, Tipo_via tipo_via, String codigo_postal, String ciudad, String provincia, String tiktok, String twitter, String instagram, String telefono, LocalDate fecha_alta, LocalDate fecha_modificacion) {
        this.cif = cif;
        this.nombre = nombre;
        this.nombre_via = nombre_via;
        this.tipo_via = tipo_via;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.tiktok = tiktok;
        this.twitter = twitter;
        this.instagram = instagram;
        this.telefono = telefono;
        this.fecha_alta = fecha_alta;
        this.fecha_modificacion = fecha_modificacion;
    }

    public Protectora() {
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTiktok() {
        return tiktok;
    }

    public void setTiktok(String tiktok) {
        this.tiktok = tiktok;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        Protectora that = (Protectora) o;
        return Objects.equals(cif, that.cif) && Objects.equals(nombre, that.nombre) && Objects.equals(nombre_via, that.nombre_via) && tipo_via == that.tipo_via && Objects.equals(codigo_postal, that.codigo_postal) && Objects.equals(ciudad, that.ciudad) && Objects.equals(provincia, that.provincia) && Objects.equals(tiktok, that.tiktok) && Objects.equals(twitter, that.twitter) && Objects.equals(instagram, that.instagram) && Objects.equals(telefono, that.telefono) && Objects.equals(fecha_alta, that.fecha_alta) && Objects.equals(fecha_modificacion, that.fecha_modificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cif, nombre, nombre_via, tipo_via, codigo_postal, ciudad, provincia, tiktok, twitter, instagram, telefono, fecha_alta, fecha_modificacion);
    }
}

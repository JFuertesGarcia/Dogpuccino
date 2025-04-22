package org.Modelo;
import org.Enums.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Perro {
    private int id;
    private String nombre;
    private Sexo sexo;
    private Adoptado adoptado;
    private LocalDate fecha_nacimiento;
    private LocalDate fechaAlta;
    private LocalDate fechaModificacion;
    private Protectora protectora;
    private Raza raza;
    private List<PerrosPatologia> patologias;
    private String foto;

    public Perro(int id, String nombre, Sexo sexo, Adoptado adoptado, LocalDate fecha_nacimiento, LocalDate fechaAlta, LocalDate fechaModificacion, Protectora protectora, Raza raza, List<PerrosPatologia> patologias, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.adoptado = adoptado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fechaAlta = fechaAlta;
        this.fechaModificacion = fechaModificacion;
        this.protectora = protectora;
        this.raza = raza;
        this.patologias = patologias;
        this.foto = foto;
    }

    public Perro() {
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Adoptado getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(Adoptado adoptado) {
        this.adoptado = adoptado;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Protectora getProtectora() {
        return protectora;
    }

    public void setProtectora(Protectora protectora) {
        this.protectora = protectora;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public List<PerrosPatologia> getPatologias() {
        return patologias;
    }

    public void setPatologias(List<PerrosPatologia> patologias) {
        this.patologias = patologias;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return id == perro.id && Objects.equals(nombre, perro.nombre) && sexo == perro.sexo && adoptado == perro.adoptado && Objects.equals(fecha_nacimiento, perro.fecha_nacimiento) && Objects.equals(fechaAlta, perro.fechaAlta) && Objects.equals(fechaModificacion, perro.fechaModificacion) && Objects.equals(protectora, perro.protectora) && Objects.equals(raza, perro.raza) && Objects.equals(patologias, perro.patologias) && Objects.equals(foto, perro.foto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, sexo, adoptado, fecha_nacimiento, fechaAlta, fechaModificacion, protectora, raza, patologias, foto);
    }
}

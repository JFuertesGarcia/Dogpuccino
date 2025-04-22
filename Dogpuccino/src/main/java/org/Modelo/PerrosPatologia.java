package org.Modelo;

import java.util.Objects;

public class PerrosPatologia {
    private Perro perro;
    private Patologia patologia;
    private String descripcion;

    public PerrosPatologia(Perro perro, Patologia patologia, String descripcion) {
        this.perro = perro;
        this.patologia = patologia;
        this.descripcion = descripcion;
    }

    public PerrosPatologia() {
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Patologia getPatologia() {
        return patologia;
    }

    public void setPatologia(Patologia patologia) {
        this.patologia = patologia;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PerrosPatologia that = (PerrosPatologia) o;
        return Objects.equals(perro, that.perro) && Objects.equals(patologia, that.patologia) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perro, patologia, descripcion);
    }
}

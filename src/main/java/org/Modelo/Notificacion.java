package org.Modelo;

import java.util.Objects;

public class Notificacion {
    private int id;
    private String descripcion;

    public Notificacion() {
    }

    public Notificacion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notificacion notificacion = (Notificacion) o;
        return id == notificacion.id && Objects.equals(descripcion, notificacion.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }

}

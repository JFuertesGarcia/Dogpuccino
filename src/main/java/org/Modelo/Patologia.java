package org.Modelo;

import java.util.Objects;

public class Patologia {
    private int id;
    private String nombre;

    public Patologia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Patologia() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patologia patologia = (Patologia) o;
        return id == patologia.id && Objects.equals(nombre, patologia.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}

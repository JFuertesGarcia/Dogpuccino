package org.Modelo;

import java.util.Objects;

public class Raza {
    private int id;
    private String nombre;

    public Raza(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Raza() {
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
        Raza raza = (Raza) o;
        return id == raza.id && Objects.equals(nombre, raza.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }
}

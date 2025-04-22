package org.Modelo;

import java.util.Objects;

public class PerrosClientes {
    private Perro perro;
    private Cliente cliente;

    public PerrosClientes(Perro perro, Cliente cliente) {
        this.perro = perro;
        this.cliente = cliente;
    }

    public PerrosClientes() {
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PerrosClientes that = (PerrosClientes) o;
        return Objects.equals(perro, that.perro) && Objects.equals(cliente, that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perro, cliente);
    }
}

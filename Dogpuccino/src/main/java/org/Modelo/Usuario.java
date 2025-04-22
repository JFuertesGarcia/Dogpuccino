package org.Modelo;

import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String contrasenya;
    private Cliente cliente;
    private Protectora protectora;

    public Usuario(int id, String nombre, String contrasenya, Cliente cliente, Protectora protectora) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenya = contrasenya;
        this.cliente = cliente;
        this.protectora = protectora;
    }

    public Usuario() {
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

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Protectora getProtectora() {
        return protectora;
    }

    public void setProtectora(Protectora protectora) {
        this.protectora = protectora;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nombre, usuario.nombre) && Objects.equals(contrasenya, usuario.contrasenya) && Objects.equals(cliente, usuario.cliente) && Objects.equals(protectora, usuario.protectora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, contrasenya, cliente, protectora);
    }
}

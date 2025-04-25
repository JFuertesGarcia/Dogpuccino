package org.Modelo;

import java.util.Objects;

public class UsuariosNotificacion {
    private String id_usuario;
    private String id_notificacion;

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(String id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof UsuariosNotificacion that)) return false;
        return Objects.equals(getId_usuario(), that.getId_usuario()) && Objects.equals(getId_notificacion(), that.getId_notificacion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_usuario(), getId_notificacion());
    }
}

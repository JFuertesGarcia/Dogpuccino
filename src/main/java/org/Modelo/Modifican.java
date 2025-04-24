package org.Modelo;

import java.util.Objects;

public class Modifican {
    private Protectora protectora;
    private Cita cita;

    public Modifican(Protectora protectora, Cita cita) {
        this.protectora = protectora;
        this.cita = cita;
    }

    public Modifican() {
    }

    public Protectora getProtectora() {
        return protectora;
    }

    public void setProtectora(Protectora protectora) {
        this.protectora = protectora;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Modifican modifican = (Modifican) o;
        return Objects.equals(protectora, modifican.protectora) && Objects.equals(cita, modifican.cita);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectora, cita);
    }
}

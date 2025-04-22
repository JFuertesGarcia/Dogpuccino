package org.Enums;

public enum EstadoCita {
    Pendiente, Confirmada, Cancelada, Realizada;

    public static EstadoCita fromString(String estado) {
        for (EstadoCita e : EstadoCita.values()) {
            if (e.name().equalsIgnoreCase(estado)) {
                return e;
            }
        }
        throw new IllegalArgumentException("No existe el estado: " + estado);
    }
}

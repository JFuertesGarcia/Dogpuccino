package org.Modelo;

import org.Enums.EstadoCita;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cita {
    private int id;
    private LocalDateTime fecha;
    private EstadoCita estado;
    private Perro perro;
    private Cliente cliente;

    public Cita(int id, LocalDateTime fecha, EstadoCita estado, Perro perro, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.perro = perro;
        this.cliente = cliente;
    }

    public Cita() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return id == cita.id && Objects.equals(fecha, cita.fecha) && estado == cita.estado && Objects.equals(perro, cita.perro) && Objects.equals(cliente, cita.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, estado, perro, cliente);
    }
}

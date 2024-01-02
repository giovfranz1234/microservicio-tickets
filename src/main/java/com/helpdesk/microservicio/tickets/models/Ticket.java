package com.helpdesk.microservicio.tickets.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String estado;
    private String prioridad;

    private Usuario CreadoPor;

}

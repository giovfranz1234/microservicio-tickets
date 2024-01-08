package com.helpdesk.microservicio.tickets.controllers;

import com.helpdesk.microservicio.tickets.models.Ticket;
import com.helpdesk.microservicio.tickets.models.Usuario;
import com.helpdesk.microservicio.tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class TicketController {
  @Autowired
    private TicketService ticketService;

  @GetMapping
  public ResponseEntity<?> obtTickets(){
    return ResponseEntity.ok().body(ticketService.findAll());
  }
  @GetMapping("/{id}")
  public ResponseEntity<?> obtTicket(@PathVariable Long id){
    Optional<Ticket> o = ticketService.findById(id);
    if (o.isEmpty()){
      return  ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(o.get());
  }
  @PostMapping
  public ResponseEntity<?> crear(@RequestBody Ticket ticket){
    return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.save(ticket));

  }
  @PutMapping("/{id}")
  public ResponseEntity<?> actualizar(@RequestBody Ticket ticket, @PathVariable Long id){
    Optional<Ticket> ticketMod= ticketService.findById(id);
    if (ticketMod.isEmpty()){
      return ResponseEntity.notFound().build();
    }
    Ticket TicketDB = ticketMod.get();
    ticket.setDescripcion (TicketDB.getDescripcion());
    ticket.setDispositivo(TicketDB.getDispositivo());
    ticket.setAsignadoa(TicketDB.getAsignadoa());
    ticket.setEstado(TicketDB.getEstado());
    ticket.setPrioridad(TicketDB.getPrioridad());
    ticket.setCreadoPor(TicketDB.getCreadoPor());
    ticket.setFechaRegistro(TicketDB.getFechaRegistro());
    ticket.setFechaInicio(TicketDB.getFechaInicio());
    ticket.setFechaFin(TicketDB.getFechaFin());
    ticket.setHistorial(TicketDB.getHistorial());


     return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.save(TicketDB));

  }
  @DeleteMapping("/{id}")
  public ResponseEntity<?> eliminar(@PathVariable Long id){
    ticketService.deleteById(id);
    return ResponseEntity.noContent().build();

  }

  @GetMapping
    public List <Usuario>usuariosdtick(){
      return ticketService.obtUsuarios();
  }

}

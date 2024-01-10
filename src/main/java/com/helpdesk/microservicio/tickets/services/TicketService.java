package com.helpdesk.microservicio.tickets.services;

import com.helpdesk.microservicio.tickets.clients.UsuarioFeingClient;
import com.helpdesk.microservicio.tickets.models.Ticket;
import com.helpdesk.microservicio.tickets.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    public List<Ticket> findAll();

    public Optional<Ticket> findById(Long id);

    public Ticket save(Ticket ticket);
    public void deleteById(Long id);
   public List<Usuario> obtUsuarios();
}

package com.helpdesk.microservicio.tickets.services.impl;

import com.helpdesk.microservicio.tickets.clients.UsuarioFeingClient;
import com.helpdesk.microservicio.tickets.models.Ticket;
import com.helpdesk.microservicio.tickets.models.Usuario;
import com.helpdesk.microservicio.tickets.repositories.ticketRepository;
import com.helpdesk.microservicio.tickets.services.TicketService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
   @Autowired
    private ticketRepository ticketRepository;
    @Autowired
    private UsuarioFeingClient usuarioFeingClient;

    @Override
    @Transactional
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteById(Long id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Usuario> obtUsuarios() {
        return usuarioFeingClient.obtUsuarios();
    }


}



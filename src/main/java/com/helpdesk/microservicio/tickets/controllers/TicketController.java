package com.helpdesk.microservicio.tickets.controllers;

import com.helpdesk.microservicio.tickets.models.Usuario;
import com.helpdesk.microservicio.tickets.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TicketController {
  @Autowired
    private TicketService ticketService;

  @GetMapping
    public List <Usuario>usuariosdtick(){
      return ticketService.obtUsuarios();
  }

}

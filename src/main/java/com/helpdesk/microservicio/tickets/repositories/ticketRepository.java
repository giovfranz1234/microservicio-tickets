package com.helpdesk.microservicio.tickets.repositories;

import com.helpdesk.microservicio.tickets.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ticketRepository extends JpaRepository<Ticket, Long> {





}

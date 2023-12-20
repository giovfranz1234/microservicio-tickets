package com.helpdesk.microservicio.tickets.clients;

import com.helpdesk.microservicio.tickets.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name ="microservicio-usuario")
public interface UsuarioFeingClient {
  @GetMapping
    public List<Usuario> obtUsuarios();

}

package com.helpdesk.microservicio.tickets.models;

import java.io.Serializable;
public class Usuario implements Serializable {

     private Long id;
     private String nombres;
     private String paterno;
     private String materno;
     private String docIdentidad;
     private String correoElectronico;
     private String telefono;
     private String rol;
     private String estado;
/*
    @OneToMany(mappedBy = "creadoPor", cascade = CascadeType.ALL)
    private List<Ticket> creaTickets;

    @OneToMany(mappedBy = "creadoPorUsuario", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

*/

    public Usuario() {
    }

    public Usuario(Long id, String nombres, String paterno, String materno, String docIdentidad, String correoElectronico, String telefono, String rol, String estado) {
        this.id = id;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.docIdentidad = docIdentidad;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.rol = rol;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", paterno='" + paterno + '\'' +
                ", materno='" + materno + '\'' +
                ", docIdentidad='" + docIdentidad + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", rol='" + rol + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getDocIdentidad() {
        return docIdentidad;
    }
    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
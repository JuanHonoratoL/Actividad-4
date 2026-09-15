package com.upiiz.actividad_4.alumnos.entities;
 // Capa Base de Datos

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name = "alumnos")
public class AlumnoEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long boleta;
    private String nombre;
    private String correo;
    private int edad;

    public AlumnoEntity(){

    }

    public AlumnoEntity(Long id, Long boleta, String nombre, String correo, int edad) {
        this.id = id;
        this.boleta = boleta;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public AlumnoEntity(Long boleta, String nombre, String correo, int edad) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoleta() {
        return boleta;
    }

    public void setBoleta(Long boleta) {
        this.boleta = boleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

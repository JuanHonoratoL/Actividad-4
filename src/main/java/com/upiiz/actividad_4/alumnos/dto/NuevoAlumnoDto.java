package com.upiiz.actividad_4.alumnos.dto;

// Recibir datos del cliente

public class NuevoAlumnoDto {
    private Long boleta;
    private String nombre;
    private String correo;
    private int edad;

    public NuevoAlumnoDto(Long boleta, String nombre, String correo, int edad) {
        this.boleta = boleta;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
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

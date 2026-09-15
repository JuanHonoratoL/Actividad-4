package com.upiiz.actividad_4.alumnos.dto;

public class ListadoEdadesDto {
    private int edad;
    private Long cantidad;

    public ListadoEdadesDto(int edad, Long cantidad) {
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    
    
}

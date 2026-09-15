package com.upiiz.actividad_4.alumnos;

import java.util.List;

import com.upiiz.actividad_4.alumnos.dto.AlumnoDto;
import com.upiiz.actividad_4.alumnos.dto.ListadoEdadesDto;
import com.upiiz.actividad_4.alumnos.dto.NuevoAlumnoDto;

// Capa de servicio

public interface AlumnoService {

    // Guardar a un alumno
    AlumnoDto save(NuevoAlumnoDto nuevoAlumnoDto);

    // Muestre todos los alumnos
    List<AlumnoDto> findAll();

    // Que actualice un alumno
    AlumnoDto update(Long id, NuevoAlumnoDto updateAlumnoDto);

    // Borrar a un alumno
    void delete(Long id);

    List<ListadoEdadesDto> obtenerConteoPorEdades();


    
}

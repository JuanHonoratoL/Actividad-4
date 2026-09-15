package com.upiiz.actividad_4.alumnos;

import java.util.List;

import org.springframework.stereotype.Service;

import com.upiiz.actividad_4.alumnos.dto.AlumnoDto;
import com.upiiz.actividad_4.alumnos.dto.ListadoEdadesDto;
import com.upiiz.actividad_4.alumnos.dto.NuevoAlumnoDto;
import com.upiiz.actividad_4.alumnos.entities.AlumnoEntity;

@Service 
public class AlumnoServiceImpl implements AlumnoService {
    private AlumnoRepository alumnoRepository;

    // 2. Constructor para la inyección de dependencias
    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
    }

    @Override
    public List<AlumnoDto> findAll() {
        return List.of();
    }

    @Override
    public AlumnoDto save(NuevoAlumnoDto nuevoAlumnoDto) {
        alumnoRepository.findByBoleta(nuevoAlumnoDto.getBoleta()).ifPresent(e -> {
            // Manda un error
            // Termina el método
            throw new IllegalArgumentException("Ya existe un alumno con este número de boleta");
        });

        alumnoRepository.findByCorreo(nuevoAlumnoDto.getCorreo()).ifPresent(e -> {
            throw new IllegalArgumentException("Ya existe un alumno con este correo");
        });

        AlumnoEntity nuevoAlumno = new AlumnoEntity(nuevoAlumnoDto.getBoleta(), nuevoAlumnoDto.getNombre(),
                nuevoAlumnoDto.getCorreo(),
                nuevoAlumnoDto.getEdad());
        AlumnoEntity alumnoGuardado = alumnoRepository.save(nuevoAlumno);
        return new AlumnoDto(alumnoGuardado.getId(), alumnoGuardado.getBoleta(), alumnoGuardado.getNombre(), alumnoGuardado.getCorreo(), alumnoGuardado.getEdad());
        
    }

    @Override
    public AlumnoDto update(Long id, NuevoAlumnoDto updateAlumnoDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ListadoEdadesDto> obtenerConteoPorEdades() {
        return alumnoRepository.contarPersonasPorEdad();
    }

    

}

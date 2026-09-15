package com.upiiz.actividad_4.alumnos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.actividad_4.alumnos.dto.NuevoAlumnoDto;
import com.upiiz.actividad_4.alumnos.dto.AlumnoDto;
import com.upiiz.actividad_4.alumnos.dto.ListadoEdadesDto;
import java.util.List;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    private AlumnoServiceImpl alumnoService;

    AlumnoController(AlumnoServiceImpl alumnoService){
        this.alumnoService = alumnoService;
    }

    @PostMapping("/guardarAlumno")
    public AlumnoDto save(@RequestBody NuevoAlumnoDto nuevoAlumnoDto) {
        return alumnoService.save(nuevoAlumnoDto);
    }

    @GetMapping("/listadoEdades")
    public List<ListadoEdadesDto> getMethodName() {
        return alumnoService.obtenerConteoPorEdades();
    }
    
    
}

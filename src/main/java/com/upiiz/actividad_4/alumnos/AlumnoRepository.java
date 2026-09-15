package com.upiiz.actividad_4.alumnos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.upiiz.actividad_4.alumnos.dto.ListadoEdadesDto;
import com.upiiz.actividad_4.alumnos.entities.AlumnoEntity;
import java.util.List;


@Repository 
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long>{
    Optional<AlumnoEntity> findByBoleta(Long boleta);

    @Query 
    ("SELECT new com.upiiz.actividad_4.alumnos.dto.ListadoEdadesDto(p.edad, COUNT(p)) " +
           "FROM AlumnoEntity p " +
           "GROUP BY p.edad " +
           "ORDER BY p.edad ASC")
    List<ListadoEdadesDto> contarPersonasPorEdad();
}

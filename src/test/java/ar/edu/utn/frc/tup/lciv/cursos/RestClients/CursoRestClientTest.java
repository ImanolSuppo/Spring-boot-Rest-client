package ar.edu.utn.frc.tup.lciv.cursos.RestClients;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CursoRestClientTest {

    @Test
    void getPosts() {

        CursoRestClient client = new CursoRestClient();
        ResponseEntity<Curso[]> responseEntity = client.getPosts();
        Curso[] cursos = responseEntity.getBody();

        assertNotNull(cursos, "La respuesta de la API no debe ser nula");

        Long cantAlumnos = 0L;
        for (Curso curso : cursos) {
            if (curso.q_alumnos() != null) {
                cantAlumnos += curso.q_alumnos();
            }
        }

        assertEquals(96L, cantAlumnos);
    }
}
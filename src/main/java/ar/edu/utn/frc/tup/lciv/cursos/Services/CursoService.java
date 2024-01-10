package ar.edu.utn.frc.tup.lciv.cursos.Services;

import ar.edu.utn.frc.tup.lciv.cursos.RestClients.Curso;
import ar.edu.utn.frc.tup.lciv.cursos.RestClients.CursoRestClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    private CursoRestClient client = new CursoRestClient();
    public Long getCantidadAlumnos() throws Exception {

        ResponseEntity<Curso[]> responseEntity = client.getPosts();

        Long cantAlumnos = 0L;

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            Curso[] cursos = responseEntity.getBody();
            if (cursos != null) {
                for (Curso curso : cursos) {
                    cantAlumnos += curso.q_alumnos();
                }
            }
            return cantAlumnos;
        } else {
            throw new Exception("La solicitud no fue exitosa. Código: " + responseEntity.getStatusCodeValue());
        }
    }
}

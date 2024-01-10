package ar.edu.utn.frc.tup.lciv.cursos.RestClients;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CursoRestClient {

    RestTemplate restTemplate = new RestTemplate();

    String baseResourceUrl = "https://my-json-server.typicode.com/113898-KUMIEC/api-curso/cursos"; //Estoy usando la API de un compañero

    public ResponseEntity<Curso[]> getPosts() {
        return restTemplate.getForEntity(baseResourceUrl, Curso[].class);
    }
}

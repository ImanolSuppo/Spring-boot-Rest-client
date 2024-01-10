package ar.edu.utn.frc.tup.lciv.cursos.Controllers;

import ar.edu.utn.frc.tup.lciv.cursos.Services.CursoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService = new CursoService();
    @GetMapping("/alumnos")
    public Long cantidadAlumnos() throws Exception {
        return cursoService.getCantidadAlumnos();
    }
}

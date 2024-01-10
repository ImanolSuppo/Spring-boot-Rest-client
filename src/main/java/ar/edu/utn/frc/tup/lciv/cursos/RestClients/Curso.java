package ar.edu.utn.frc.tup.lciv.cursos.RestClients;

public record Curso(String id, String title, Long q_alumnos) {
    //No encontre la forma de no usar SnakeCase en qAlumnos debido a que me daba NullPointerExeption
}

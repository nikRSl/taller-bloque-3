package sistema.modelo;

import sistema.modelo.Estudiante;
import sistema.modelo.Curso;

public class Calificacion {

    private Estudiante estudiante;
    private Curso curso;
    private double nota;

    public Calificacion(Estudiante estudiante, Curso curso, double nota) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}


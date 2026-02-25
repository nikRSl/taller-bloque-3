package sistema.modelo;

import sistema.modelo.Profesor;

public class Curso {
    private String nombre;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombreCurso() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}


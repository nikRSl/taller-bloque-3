package sistema.modelo;

import sistema.modelo.Estudiante;
import sistema.modelo.Curso;

public class Pago {

    private Estudiante estudiante;
    private Curso curso;
    private double monto;

    public Pago(Estudiante estudiante, Curso curso, double monto) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}


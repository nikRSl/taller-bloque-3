package sistema.modelo;

import sistema.modelo.Usuario;

public class Estudiante extends Usuario {

    private String codigoEstudiante;

    public Estudiante(String nombre, String correo, String password, String codigoEstudiante) {
        super(nombre, correo, password);
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }
}


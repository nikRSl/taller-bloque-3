package sistema.modelo;

import sistema.modelo.Usuario;

public class Profesor extends Usuario {

    private String especialidad;

    public Profesor(String nombre, String correo, String password, String especialidad) {
        super(nombre, correo, password);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}


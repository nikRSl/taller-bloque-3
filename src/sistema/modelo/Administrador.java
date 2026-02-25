package sistema.modelo;

import sistema.modelo.Usuario;

public class Administrador extends Usuario {

    public Administrador(String nombre, String correo, String password) {
        super(nombre, correo, password);
    }

    public void gestionarCursos() {
        System.out.println("Cursos gestionados");
    }

    public void gestionarUsuarios() {
        System.out.println("Usuarios gestionados");
    }
}


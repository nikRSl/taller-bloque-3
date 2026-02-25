package sistema.servicio;

public class SistemaAutenticacion {

    public boolean validarUsuario(String correo, String password) {
        return correo.equals("admin@gmail.com") && password.equals("1234");
    }
}


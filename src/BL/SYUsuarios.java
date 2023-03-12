package BL;

public class SYUsuarios {
    int syidUsuario;
    String syUsuario;
    String syContrasenia;

    public SYUsuarios(String syUsuario, String syContrasenia) {
        this.syUsuario = syUsuario;
        this.syContrasenia = syContrasenia;
    }

    public SYUsuarios(int syidUsuario, String syUsuario, String syContrasenia) {
        this.syidUsuario = syidUsuario;
        this.syUsuario = syUsuario;
        this.syContrasenia = syContrasenia;
    }
    
    public SYUsuarios() {
    }

    public int getSyidUsuario() {
        return syidUsuario;
    }

    public void setSyidUsuario(int syidUsuario) {
        this.syidUsuario = syidUsuario;
    }

    public String getSyUsuario() {
        return syUsuario;
    }

    public void setSyUsuario(String syUsuario) {
        this.syUsuario = syUsuario;
    }

    public String getSyContrasenia() {
        return syContrasenia;
    }

    public void setSyContrasenia(String syContrasenia) {
        this.syContrasenia = syContrasenia;
    }


}

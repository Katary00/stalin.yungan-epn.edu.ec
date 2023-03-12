package BL;

public class Coordenadas {
    int syCapacidadBelica;
    String syGeoPosicionamiento;
    String syArsenal;

    public Coordenadas(int syCapacidadBelica, String syGeoPosicionamiento, String syArsenal) {
        this.syCapacidadBelica = syCapacidadBelica;
        this.syGeoPosicionamiento = syGeoPosicionamiento;
        this.syArsenal = syArsenal;
    }

    
    public Coordenadas() {
    }


    public int getSyCapacidadBelica() {
        return syCapacidadBelica;
    }


    public void setSyCapacidadBelica(int syCapacidadBelica) {
        this.syCapacidadBelica = syCapacidadBelica;
    }


    public String getSyGeoPosicionamiento() {
        return syGeoPosicionamiento;
    }


    public void setSyGeoPosicionamiento(String syGeoPosicionamiento) {
        this.syGeoPosicionamiento = syGeoPosicionamiento;
    }


    public String getSyArsenal() {
        return syArsenal;
    }


    public void setSyArsenal(String syArsenal) {
        this.syArsenal = syArsenal;
    }
    
}

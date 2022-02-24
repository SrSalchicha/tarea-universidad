package SegundoCuatrimestre.Multimedios;


public class Multimedia {
    private String titulo;
    private String autor;
    private String formato;
    private double duracion;
    private int año;
    private String actor;

    public Multimedia(String titulo, String autor, String actor ,String formato, double duracion, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        this.año = año;
        this.actor = actor;
    }

    public String getactor(){
        return actor;
    }

    public String toString() {
        return "Título: " + titulo + " De " + autor + "\n" +
                "Formato " + formato + " Duración " + (int) duracion + " minutos " + "Producido en " + año;
    }
}
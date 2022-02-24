package SegundoCuatrimestre.Multimedios;

public class Pelicula extends Multimedia {
    private String actorOActrizPrincipal;


    public Pelicula(String titulo, String autor, String formato, double duracion, int año, String actor) {
        super(titulo, autor, actor, formato, duracion, año);
        if (actor == null) {
            throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
        }
        actorOActrizPrincipal = actor;


    }


    public String getActor() {
        return actorOActrizPrincipal;
    }



    public String toString() {
        String s = "Protagonizado por " + actorOActrizPrincipal;
        return super.toString() + "\n" + s;
    }
}
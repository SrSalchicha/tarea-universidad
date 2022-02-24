package SegundoCuatrimestre.Multimedios;

public class Musica extends Multimedia {
    private String productor;


    public Musica(String titulo,String autor, String actor , String formato,int duracion , int año) {
        super(titulo, autor, actor, formato, duracion, año);


    }
    public String toString(){
        String cancion = "Interpretado por ";
        cancion += this.getactor();
        return super.toString() + "\n" + cancion;
    }

}
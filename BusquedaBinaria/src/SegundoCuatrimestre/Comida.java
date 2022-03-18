package SegundoCuatrimestre;



public class Comida implements Comparable<Comida>{
    private String nombre;
    private int precio;
    private int puntuacion;


    public Comida(String nombre, int puntuacion, int precio){
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    @Override
    public int compareTo(Comida c){
        int result = getNombre().compareTo(c.getNombre());
        if (result == 0){
            result = Integer.compare(getPuntuacion(), c.getPuntuacion());
            if (result == 0){
                return Integer.compare(getPrecio(), c.getPrecio());
            }
        }
        return result;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", puntuacion=" + puntuacion +
                '}';
    }
}

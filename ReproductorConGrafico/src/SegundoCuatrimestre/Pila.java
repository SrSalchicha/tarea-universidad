package SegundoCuatrimestre;

public abstract class Pila {
    public static PilaMultimedia lista[];
    private static int tope; // top
    public static boolean control = true;


    public static void Capacidad(int capacidad){
        lista = new PilaMultimedia[capacidad];
        tope = -1;
    }
    public static void push(PilaMultimedia c){
        if (tope+1 < lista.length ) {
            lista[++tope] = c;
        }
    }
    public static PilaMultimedia pop(){
        if (tope == -1){
            return null;
        } else {
            return lista[tope--];
        }
    }
    public static boolean isEmpty(){
        return tope == -1;
    }
}
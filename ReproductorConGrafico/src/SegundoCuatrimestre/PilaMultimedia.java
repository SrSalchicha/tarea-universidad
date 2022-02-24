package SegundoCuatrimestre;


import SegundoCuatrimestre.Multimedios.Multimedia;

public class PilaMultimedia {
    private Multimedia pila[];
    private int tope; // top

    public PilaMultimedia(int capacidad){
        pila = new Multimedia[capacidad];
        tope = -1;
    }
    public void push(Multimedia c){
        if (tope+1 < pila.length ) {
            pila[++tope] = c;
        }
    }
    public Multimedia pop(){
        if (tope == -1){
            return null;
        } else {
            return pila[tope--];
        }
    }
    public boolean isEmpty(){
        return tope == -1;
    }
    public String toString() {
        String s = "";
        for (int i = tope; i > -1; i--) {
            s += pila[i].toString() + "\n\n";
        }
        return s;
    }

}
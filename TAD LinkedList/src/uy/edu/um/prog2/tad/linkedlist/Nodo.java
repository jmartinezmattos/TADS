package uy.edu.um.prog2.tad.linkedlist;

public class Nodo{

    private Nodo siguiente;
    private Object value;


    public Nodo(Object valor){
        this.value = valor;
    }

    public void setSiguiente(Object siguiente) {
        Nodo nodoSiguiente = new Nodo(siguiente);
        this.siguiente = nodoSiguiente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Object getValue() {
        return value;
    }

}

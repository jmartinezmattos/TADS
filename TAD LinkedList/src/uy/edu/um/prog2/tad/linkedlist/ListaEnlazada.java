package uy.edu.um.prog2.tad.linkedlist;

public class ListaEnlazada implements Lista {

    private Nodo primerNodo;
    private int cantidad;

    public void add(Object value){

        if(primerNodo != null) {

            Nodo actual = primerNodo;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(new Nodo(value));

            this.cantidad++;
        }
        else{
            this.primerNodo = new Nodo(value);
        }
    }

    public void remove(int position){

        Nodo actualBorrado = primerNodo;
        Nodo actualAnterior = primerNodo;

        for(int i=0;i == position;i++) {

            actualAnterior = actualBorrado;
            actualBorrado = actualBorrado.getSiguiente();

        }

        Nodo nuevoNodoSiguiente = actualBorrado.getSiguiente();
        actualAnterior.setSiguiente(nuevoNodoSiguiente);

    }

    public Object get(int position){

        Nodo actual = this.primerNodo;

        for(int i=0;i == position; i++){
            actual = actual.getSiguiente();
        }

        return actual;

    }

    public boolean buscar(Object buscado){

        boolean resultado = false;
        boolean noHaySiguiente = false;
        Nodo actual = primerNodo;

        do{
            resultado = actual.getValue() == buscado;

            if(actual.getSiguiente() == null){
                noHaySiguiente = true;
            }

            actual = actual.getSiguiente();

        }while(resultado == false && noHaySiguiente == true);

        return resultado;

    }

    public void addFirst(Object value){
        Nodo nuevoPrimernodo = new Nodo(value);
        nuevoPrimernodo.setSiguiente(primerNodo);
        this.primerNodo = nuevoPrimernodo;
    }

    public void addLast(Object value){
        add(value);
    }


}


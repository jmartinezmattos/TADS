import Exceptions.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @org.junit.jupiter.api.Test



    void push() {

        Stack pila = new Stack();

        pila.push(0);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        System.out.println("Size: " +pila.getSize());
        System.out.println("Esta vacio: " +pila.isEmpty());

        while(0<pila.getSize()) {
            try {
                System.out.println(pila.top());
                pila.pop();
            }
            catch (EmptyStackException e){
                System.out.println("invalido");
            }
        }

        System.out.println("Size: " +pila.getSize());
        System.out.println("Esta vacio: " +pila.isEmpty());

        pila.push(0);
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        System.out.println("\nSize: " +pila.getSize());
        System.out.println("Esta vacio: " +pila.isEmpty());

        pila.makeEmpty();

        System.out.println("\nEjecutado makeEmpty");
        System.out.println("\nSize: " +pila.getSize());
        System.out.println("Esta vacio: " +pila.isEmpty());


    }



}
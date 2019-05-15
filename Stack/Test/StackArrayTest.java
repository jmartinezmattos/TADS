import Exceptions.EmptyStackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayTest {

    @Test
    void name() {

        StackArray pila = new StackArray();

        pila.push(0);
        pila.push(53);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push("Hola soy pepe el grillo");

        try {
            System.out.println("Top: " +pila.top());
        }
        catch (EmptyStackException e){

        }

        System.out.println("Size: " +pila.getSize());
        System.out.println("Array Size: " +pila.getArraySize());

        while(0<pila.getSize()) {
            try {
                System.out.println(pila.top());
                pila.pop();
            }
            catch (EmptyStackException e){
                System.out.println("invalido");
            }
        }



    }
}
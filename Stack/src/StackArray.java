import Exceptions.EmptyStackException;

import java.util.ArrayList;

import static java.util.Arrays.copyOf;

public class StackArray<T> implements MyStack<T> {


    private T[] array =(T[]) new Object[10];
    private int size = 0;
    private int arraySize = 10;
    private int max = 10;

    @Override
    public void pop() throws EmptyStackException {

        try{

            if(size == 0){
               throw new EmptyStackException();
            }
            size--;

            if(size < arraySize/2){
                array = copyOf(array,arraySize/2);
                arraySize = arraySize/2;
            }

        }
        catch (EmptyStackException e){
            System.out.println("Ta vacia");
        }



    }

    @Override
    public T top() throws EmptyStackException {

        T result;

        try {

            if(size == 0){
                throw new EmptyStackException();
            }

             result = array[size - 1];
        }
        catch(EmptyStackException e){

            System.out.println("Ta vacia");
            result = null;
        }

        return result;
    }

    @Override
    public void push(T element) {

        try {
            array[size] = element;
        }
        catch(ArrayIndexOutOfBoundsException e){

            array = copyOf(array,size*2);

            arraySize = size*2;
        }

        size++;

    }

    @Override
    public boolean isEmpty() {

        boolean result = false;

        if(size==0){
            result = true;
        }

        return result;
    }

    @Override
    public void makeEmpty() {

        this.array =(T[]) new Object[10];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getArraySize() {
        return arraySize;
    }
}

import Exceptions.EmptyStackException;

public class Stack<T> implements MyStack<T> {

    private Nodo<T> oTop;
    private int size = 0;


    public T top() throws EmptyStackException{

        try {
            if (size>0) {
                return this.oTop.getValue();
            } else {
                throw new EmptyStackException();
            }
        }
        catch(EmptyStackException e){
            System.out.println("EmptyStackException");
            return null;
        }
    }

    @Override
    public void pop() throws EmptyStackException {
        try {
            if (size>0) {
                this.oTop = this.oTop.getPrevious();
                size--;
            } else {
                throw new EmptyStackException();
            }
        }
        catch(EmptyStackException e){
            System.out.println("EmptyStackException");
        }
        //size--;
    }

    @Override
    public void push(T element) {

        Nodo<T> nuevo = new Nodo<>(element);

        if(size > 0){
            nuevo.setPrevious(this.oTop);
            this.oTop = nuevo;
        }

        else{
            this.oTop = nuevo;
        }

        size++;

    }

    @Override
    public boolean isEmpty() {

        boolean result = true;

        if(size > 0){
            result = false;
        }

        return result;
    }

    @Override
    public void makeEmpty() {
        this.size = 0;
        this.oTop = null;
    }

    public int getSize() {
        return size;
    }
}

public class Nodo<N> {

    private N value;

    private Nodo<N> previous;

    public Nodo(N value){
        this.value = value;
    }

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}
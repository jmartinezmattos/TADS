public class Node<K, T> {

    K key;
    T data;
    Node<K, T> leftChild;
    Node<K, T> rightChild;

    public Node(K key,T data){
        this.key = key;
        this.data = data;
    }

    public Node<K, T> getLeftChild() {
        return leftChild;
    }

    public K getKey() {
        return key;
    }

    public T getData() {
        return data;
    }

    public Node<K, T> getRightChild() {
        return rightChild;
    }
}

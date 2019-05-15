
import Interfaces.MyTree;

public class Tree<K,T> implements MyTree<K,T> {

    Node root;
    int size;

    public void insert(K key, T data, K parentKey) {
        Node newNode = new Node(key,data);

        if(root == null){
            root = newNode;
        }
        else{

        }

        size++;
    }


    public T find(K key) {

        Node actual = root;



        if(actual.getKey() == key){
            return actual;
        }
        else{
            if(actual.getLeftChild()=! null) {
                actual = actual.getLeftChild();
            }
            else{

            }
        }
    }


    public void delete(K key) {

    }
}

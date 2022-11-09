import java.util.*;

public class LL<T> {

    Node<T> root;

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);

        if(Objects.isNull(root)){
            root = newNode;
            return;
        }

        Node<T> searchNode = root;
        while(searchNode.next != null){
            searchNode = searchNode.next;
        }

        searchNode.next = newNode;

    }

    public T get(int index){
        int counter = 0;
        Node<T> searchedNode = root;

        while(counter != index){
            searchedNode = searchedNode.next;
            counter++;
        }

        return searchedNode.value;
    }

    public void delete(int index){
        int counter = 0;
        Node<T> previousNode = root;
        Node<T> searchedNode = root;

        while(counter != index){
            previousNode = searchedNode;
            searchedNode = searchedNode.next;
            counter++;
        }

        previousNode.next = searchedNode.next;
    }

    public void add(int index, T value){

        if(Objects.isNull(root) || Objects.isNull(root.next)){
            add(value);
            return;
        }

        int counter = 0;
        Node<T> previousNode = root;
        Node<T> searchedNode = root;

        while(counter != index){
            previousNode = searchedNode;
            searchedNode = searchedNode.next;
            counter++;
        }

        previousNode.next = new Node<>(value);
        previousNode.next.next = searchedNode;
    }
}

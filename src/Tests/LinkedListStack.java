package Tests;

import java.util.EmptyStackException;

interface StackInteface{
    boolean isEmpty();
    String push(String data);
    String peek();
    String pop();
}

public class LinkedListStack implements StackInteface{
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    private class Node{
        private String data;
        public Node nextNode;

        public Node(){
            this.data = null;
            this.nextNode = null;
        }
        public Node(String data){
            this.data = data;
            this.nextNode = null;
        }
        public Node(String data, Node nextNode){
            this.data = data;
            this.nextNode = nextNode;
        }
        public String getData(){
            return data;
        }
    }

    @Override
    public String push(String data){
        Node node = new Node(data);
        node.nextNode = top;

        top = node;

        return data;
    }

    @Override
    public String pop(){
        String data = peek();
        top = top.nextNode;
        return data;
    }

    @Override
    public String peek(){
        if(top == null)
            throw new EmptyStackException();

        return top.data;
    }

    @Override
    public boolean isEmpty(){
        return top == null;
    }


    public static void main(String[] args) {
        LinkedListStack listStack = new LinkedListStack();

        if(listStack.isEmpty())  {
            listStack.push("1");
            listStack.push("2");
            listStack.push("3");
            System.out.println(listStack.peek());
            listStack.pop();
            System.out.println(listStack.peek());
        }

    }
}

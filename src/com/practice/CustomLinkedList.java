package com.practice;

public class CustomLinkedList {

    private Node head;

    public Node insert(int data){
        Node node = new Node(data);
        if(head==null){
            head = node;
        }else{
            Node curr = head;

            while(curr.getNext()!=null){
                curr= curr.next;
            }
            curr.next = node;

        }

        return node;
    }

    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.print();
        System.out.println("Hello this is feature111");
    }


    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}

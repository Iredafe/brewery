package com.dafe.brewery.web;


    class LinkedList1 {

        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }


        void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            planeUtil();
        }

        //Use this if you want to implement via looping
        Node reverse(Node node) {
            return null;
        }


        public static void planeUtil() {
            LinkedList1 list = new LinkedList1();
            list.head = new Node(85);
            list.head.next = new Node(15);
            list.head.next.next = new Node(4);
            list.head.next.next.next = new Node(20);

            System.out.println("Given Linked list");
            list.printList(head);
            head = list.reverse(head);
            System.out.println("");
            System.out.println("Reversed linked list ");
            list.printList(head);
        }

    }





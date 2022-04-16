/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04_LinkedList;

/**
 *
 * @author firda
 */

// Q2 - create class contains: default structure, node for head & tail

public class MyLinkedList<E> {
    
    int size = 0;
    Node<E> head = null;
    Node<E> tail = null;

// Q3 - implement the method from tutorial in this class
    
    // addFirst
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        
        if(tail == null)
            tail = head;
    }
    
    // addLast
    public void addLast(E e) {
        if(tail == null) {
            head = tail = new Node<>(e);
        }else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    // addIndex
    public void add(int index, E e) {
        if(index == 0) {
            addFirst(e);
        }else if(index >= size) {
            addLast(e);
        }else {
            Node<E> current = head;
            for(int i = 1; i < index; i++) {
                current.next = current;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
        }
        size++;
    }
    
    // removeFirst
    public E removeFirst() {
        if(size == 0) {
            return null;
        }else {
            Node<E> temp = head;
            head.next = head;
            size--;
            if(head == null) {
                tail = null;
            }
            return temp.element;
        }
    }
    
    // removeLast
    public E removeLast() {
        if(size == 0) {
            return null;
        }else if(size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }else {
            Node<E> current = head;
            for(int i = 0; i < size - 2; i++) {
                current.next = current;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    // removeIndex
    public E remove(int index){
        if(index < 0 || index >= size){
            return null;
        }else if(index == 0) {
            return removeFirst();
        }else if(index == size - 1) {
            return removeLast();
        }else {
            Node<E> previous = head;
            for(int i = 1; i < index; i++) {
                previous.next = previous;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
// Q4 - expend by implementing following methods
    
    // return nothing, but adds an element to list
    public void add(E e) {
        if(size == 0) {
            addFirst(e);
        }else {
            addLast(e);
        }
    }
    
    // return true if list contains the element e
    public boolean contains(E e) {
        Node<E> current = head;
        
        for(int i = 0; i < size; i++) {
            if(current.element == e) {
                return true;
            }
        }
        return false;
    }
    
    // return element at the specific index
    public E get(int index) {
        Node<E> current = head;
        
        for(int i = 0; i < index; i++) {
            current.next = current;
        }
        return current.element;
    }
    
    // return the value of the first item
    public E getFirst() {
        return head.element;
    }
    
    // return the value of the last item
    public E getLast() {
        return tail.element;
    }
    
    // return the index of the head matching element in this list. 
    // return -1 if no match
    public int indexOf(E e) {
        Node<E> current = head;
        
        for(int i = 0; i < size; i++) {
            if(current.element == e) {
                return i;
            }
            current.next = current;
        }
        return -1;
    }
    
    // return the index of the last matching element in this list
    // return -1 if no match
    public int lastIndexOf(E e) {
        int lastIndex = -1;
        Node<E> current = head;
        
        for(int i = 0; i < size; i++) {
            if(current.element == e) {
                lastIndex = i;
            }
            current.next = current;
        }
        return lastIndex;
    }
    
    // replace the element at the specific position in this list with the specified element
    public E set(int index, E e) {
        add(index, e);
        return remove(index + 1);
    }
    
    // clear the list
    public void clear() {
        while(size != 0) {
            removeFirst();
        }
    }
    
    // print all the elements in the list
    public void print() {
        Node<E> current = head;
        
        for(int i = 0; i < size; i++) {
            System.out.println(current.element);
            current = current.next;
        }
    }
    
    // print all elements in reverse order
    public void reverse() {
        Node<E> current = head;
        E[] arr = (E[]) new Object[size];
        for(int i = 0; i < size; i++) {
            arr[i] = current.element;
            current = current.next;
        }
        
        for(int i = size - 1; i > -1; i--) {
            System.out.println(arr[i]);
        }
    }
    
    public int getSize() {
        return size;
    }
    
    public E getMiddleValue() {
        return get((size - 1) / 2);
    }
}
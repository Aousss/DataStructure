/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04_LinkedList;

/**
 *
 * @author firda
 */
public class TestLinkedList {
    
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        
        System.out.println("List in order:   ");
        list.print();
        
        System.out.println("List in reverse:    ");
        list.reverse();
        
        System.out.println("\nList size:  " + list.getSize());
        System.out.println("First list: " + list.getFirst());
        System.out.println("Last list:  " + list.getLast());
        
        list.remove(list.getSize() / 2);
        System.out.println(list.getSize());
        
        list.remove(list.getSize() / 2);
        System.out.println(list.getSize());
        
        list.remove(list.getSize() / 2);
        System.out.println(list.getSize());
        
        System.out.println("\nList index: " + list.indexOf('b'));
        System.out.println("List index: " + list.indexOf('d'));
        System.out.println("List contains:  " + list.contains('c'));
    }
}

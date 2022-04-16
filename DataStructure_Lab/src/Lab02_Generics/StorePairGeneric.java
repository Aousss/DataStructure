/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02_Generics;

/**
 *
 * @author firda
 */

// (a) - change to Generic [change int with E]
public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>>{
    private E first, second;
        
    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;
    }

    // (b) - Override the Object equals() method in StorePair class
    @Override
    public boolean equals(Object o) {
        StorePairGeneric<E> other = (StorePairGeneric<E>) o;
        return this.first.equals(other.first);
    }

    
//    @Override
//    public boolean equals(Object o) {
//        StorePairGeneric<E> anotherStorePair = (StorePairGeneric<E>) o;
//        return first.equals(anotherStorePair.first);
//    }
    
    // (c) - Override the comapreTo() method
    @Override
    public int compareTo(StorePairGeneric<E>o) {
        return first.compareTo(o.first);
    }

    
}
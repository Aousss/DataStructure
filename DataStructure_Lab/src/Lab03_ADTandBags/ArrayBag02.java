/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab03_ADTandBags;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author firda
 */

public class ArrayBag02<T> implements BagInterface02<T> {

    private int DEFAULT_CAPACITY = 25;
    private T[] bag = (T[]) new Object[DEFAULT_CAPACITY];
    private int numberOfEntries;

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == 25;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (numberOfEntries < DEFAULT_CAPACITY) {
            numberOfEntries++;
            bag[numberOfEntries - 1] = newEntry;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        if (numberOfEntries != 0) {
            Random r = new Random();
            int selectedIndex = r.nextInt(numberOfEntries);
            T result = bag[selectedIndex];
            bag[selectedIndex] = null;

            for (int i = selectedIndex; i < numberOfEntries; i++) {
                bag[i] = bag[i + 1];
            }

            numberOfEntries--;
            return result;
        }
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        if (numberOfEntries != 0) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (bag[i] == anEntry) {
                    bag[i] = null;

                    for (int j = i; j < numberOfEntries; j++) {
                        bag[j] = bag[j + 1];
                    }

                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(bag, null);
        numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int freq = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry == bag[i]) {
                freq++;
            }
        }
        return freq;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] resultArr = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, resultArr, 0, numberOfEntries);
        return resultArr;
    }

    @Override
    public BagInterface02<T> union(BagInterface02<T> anotherBag) {
        BagInterface02<T> newBag = new ArrayBag02();
        for (int i = 0; i < this.toArray().length; i++) {
            newBag.add((T) Array.get(this.toArray(), i));
        }
        for (int i = 0; i < anotherBag.toArray().length; i++) {
            newBag.add((T) Array.get(anotherBag.toArray(), i));
        }
        return newBag;
    }

    public static void main(String[] args) {
        ArrayBag02<String> bag1 = new ArrayBag02();
        ArrayBag02<String> bag2 = new ArrayBag02();
        bag1.add("a");
        bag1.add("b");
        bag1.add("c");
        bag2.add("b");
        bag2.add("b");
        bag2.add("d");
        bag2.add("e");
        BagInterface02<String> everything = bag1.union(bag2);
        
        Object[] src = everything.toArray();
        String[] dest = new String[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);
        
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));
    }
}
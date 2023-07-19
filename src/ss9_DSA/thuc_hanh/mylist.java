package ss9_DSA.thuc_hanh;

import java.util.Arrays;
import java.lang.Integer;

public class mylist<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }
    private void add(E e){
        if ( size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

}

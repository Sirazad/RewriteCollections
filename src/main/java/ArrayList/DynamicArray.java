package ArrayList;

import java.util.Arrays;

public class DynamicArray {

    private int[] array;
    private int size;

    public DynamicArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public DynamicArray() {
        array = new int[4];
    }

    public int getCapacity() {
        return array.length;
    }

    public int size() {
        return size;
    }

    public void add(int value) {

        if (array.length == size) {
            array = Arrays.copyOf(array, array.length+1);
        }

        array[size] = value;
        size++;
    }

    public int get(int index) {
        if (size < index|| index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }


    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }

    @Override
    public String toString() {
    }

}



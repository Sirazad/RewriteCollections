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
        if (size < indexToBeRemoved|| indexToBeRemoved < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = indexToBeRemoved; i < size-1; i++) {
            array[i] = array[i+1];
        }
        array = Arrays.copyOf(array, array.length-1);
        size--;
    }

    public void insert(int index, int newValue) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (this.size == array.length|| this.size == index) {
            array = Arrays.copyOf(array, array.length*2);
            array[size] = newValue;
        }

        if (this.size < index) {
            array[size] = newValue;
        }

        if (this.size > index) {
            int[] temp = new int[(this.size - index)];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = array[index + i];
            }

            array = Arrays.copyOf(array, ++this.size);
            array[index] = newValue;
            int counter = 0;
            for (int i = index + 1; i < array.length; i++) {
                array[i] = temp[counter++];
            }
        }
    }

    @Override
    public String toString() {
        if (this.size < 1) {
            return "[]";
        } else {
            String result = "[";
            for (int i = 1; i < this.size; i++) {
                result += array[i-1]+", ";
            }
            result += array[this.size-1]+"]";
            return result;
        }
    }

}



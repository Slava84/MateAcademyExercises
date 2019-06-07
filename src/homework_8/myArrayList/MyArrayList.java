package homework_8.myArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
    private static final Object[] EMPTY_ARRAY = {};
    private static final Object[] FULL_ARRAY_CAPACITY = new Object[10];
    private T[] array;

    public MyArrayList() {
        array = (T[]) FULL_ARRAY_CAPACITY;
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            array = (T[]) new Object[capacity];
        } else if (capacity == 0) {
            array = (T[]) EMPTY_ARRAY;
        } else new IllegalArgumentException("Передано невірний аргумент");
    }

    /**
     * Окрема реалізація метода add()
     */
    @Override
    public void add(T value) {
        if (array.length != 0) {
            boolean flag = true;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == null && flag) {
                    array[i] = value;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int counter = 0;
                T[] tempArray = (T[]) new Object[array.length + (array.length >> 1)];

                for (int j = 0; j < array.length; j++) {
                    tempArray[j] = array[j];
                    counter++;
                }
                array = tempArray;
                array[counter] = value;
            }
        } else {
            array = (T[]) FULL_ARRAY_CAPACITY;
            array[0] = value;
        }
    }

    /**
     * Окрема реалізація метода add()
     */
    @Override
    public void add(T value, int index) {
        checkItByIndex(index);

        array = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, index, array, index + 1, size() - index - 1);
        array[index] = value;
    }

    @Override
    public void addAll(List list) {
        T[] tempArray = (T[]) new Object[list.size()];

        for (int i = 0; i < list.size(); i++) {
            tempArray[i] = (T) list.get(i);
        }

        array = Arrays.copyOf(array, array.length + tempArray.length);
        System.arraycopy(tempArray, 0, array, array.length - tempArray.length, tempArray.length);
    }

    @Override
    public T get(int index) {
        checkItByIndex(index);

        return array[index];
    }

    @Override
    public void set(T value, int index) {
        checkItByIndex(index);

        array = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, index, array, index + 1, size() - index - 1);
        array[index] = value;
    }

    /**
     * Окрема реалізація метода remove()
     */
    @Override
    public T remove(int index) {
        checkItByIndex(index);

        T temporery = array[index];
        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        return temporery;
    }

    /**
     * Окрема реалізація метода remove()
     */
    @Override
    public T remove(T o) {
        T temporary = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                temporary = array[i];
                remove(i);
                break;
            }
        }
        return temporary;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private void checkItByIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Вказаний індекс \"" + index + "\" виходить за межі масиву!");
        }
    }
}

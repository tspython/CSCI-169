import java.util.Iterator;

public class SortedList implements Iterable<Integer> {
    protected int len;
    protected int[] list;

    public SortedList() {
        len = 0;
        list = new int[len];
    }

    public SortedList(int[] arr, int l) {
        quicksort(arr, 0, l - 1);
        list = arr;
        len = l;
    }

    public void insert(int n) {
        int[] newList = new int[len + 1];
        for (int i = 0; i < len; i++) {
            newList[i] = list[i];
        }
        newList[len] = n;
        quicksort(newList, 0, len);
        len++;
        list = newList;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                System.out.println(list[i]);
            } else {
                System.out.print(list[i] + ", ");
            }
        }
    }

    private int partition(int[] input, int p, int r) {
        int pivot = input[r];
        while (p < r) {
            while (input[p] < pivot) {
                p++;
            }
            while (input[r] > pivot) {
                r--;
            }
            if (input[p] == input[r]) {
                p++;
            } else if (p < r) {
                int tmp = input[p];
                input[p] = input[r];
                input[r] = tmp;
            }
        }
        return r;
    }

    public int binsearch(int search) {
        int n = len;
        int first, last, middle;
        first = 0;
        last = n - 1;
        middle = (first + last) / 2;
        while (first <= last) {
            if (list[middle] < search)
                first = middle + 1;
            else if (list[middle] == search) {
                return middle;
            } else
                last = middle - 1;
            middle = (first + last) / 2;
        }
        return -1;
    }

    public void quicksort(int[] input, int p, int r) {
        if (p < r) {
            int j = partition(input, p, r);
            quicksort(input, p, j - 1);
            quicksort(input, j + 1, r);
        }
    }
    @Override
    public Iterator<Integer> iterator() {
        return new SortedListIterator(list);
    }

    private class SortedListIterator implements Iterator<Integer> {
        private final int[] list;
        private int currentIndex = 0;

        public SortedListIterator(int[] list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < list.length - 1;
        }

        @Override
        public Integer next() {
            return list[currentIndex++];
        }
    }
}



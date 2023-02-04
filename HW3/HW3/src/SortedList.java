import java.util.Scanner;

public class SortedList {
    protected int len;
    protected int[] list;

    public SortedList() {
        len = 0;
        list = new int[len];
    }

    public SortedList(int[] arr, int l) {
        quicksort(arr, 0, l-1);
        list = arr;
        len = l;
    }
    public void insert(int n) {
        int[] newList = new int[n+1];
        for(int i = 0; i < len; i++) {
            newList[i] = list[i];
        }
        newList[len] = n;
        quicksort(newList, 0, len);
        len++;
        list = newList;
    }

    public void print() {
        for (int i = 0; i < len; i++) {
            if(i == len - 1) {
                System.out.println(list[i]);
            }
            else {
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

    public int binsearch(int search){
        int n = len;
        int first, last, middle;
        first  = 0;
        last   = n - 1;
        middle = (first + last)/2;
        while( first <= last )
        {
            if ( list[middle] < search )
                first = middle + 1;
            else if ( list[middle] == search )
            {
                return middle;
            }
            else
                last = middle - 1;
            middle = (first + last)/2;
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

    public static void main(String args[]) {
        int c, n, search, array[];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];
        System.out.println("Enter " + n + " integers in ascending order");
        for (c = 0; c < n; c++)
            array[c] = in.nextInt();
        SortedList s = new SortedList(array, n);
        System.out.println("Here is the list you have created");
        s.print();
        System.out.println("Enter value to find");
        search = in.nextInt();

        int spot  = s.binsearch(search);
        if(spot>=0)
            System.out.println(search + " found at location " + spot + ".");
        else
            System.out.println(search + " is not present in the list.\n");
        System.out.println("Enter number you would like to add");
        int newInt = in.nextInt();
        s.insert(newInt);
        in.close();

        System.out.println("Here is list after you added number");
        s.print();
    }
}

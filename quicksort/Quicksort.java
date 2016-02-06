package quicksort;

public class Quicksort {
    private int[] tempArray;


    public int[] quicksort(int[] arrayToSort) {
        tempArray = new int[arrayToSort.length];
        for (int i = 0; i < arrayToSort.length; i++) {
            tempArray[i] = arrayToSort[i];
        }
        int top = 0;
        int tail = arrayToSort.length - 1;
        return sort(top, tail);
    }

    public int[] sort(int top, int tail) {
        int pivot = top + (tail - top) / 2;
        int i = top;
        int j = tail;
        while(i <= j) {
            while (tempArray[i] < tempArray[pivot]) {
                i++;
            }
            while (tempArray[j] > tempArray[pivot]) {
                j--;
            }

            if (i <= j) {
                int temp = tempArray[i];
                tempArray[i] = tempArray[j];
                tempArray[j] = temp;
                i++;
                j--;
            }
        }
        if (top < j) {
            sort(top, j);
        }
        if (i < tail) {
            sort(i, tail);
        }
        return tempArray;
    }

    public static void main(String[] args) {
        Quicksort qs = new Quicksort();

        int[] myArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myArray[i] = 1 + (int) (Math.random() * ((100 -1) + 1));
        }
        System.out.println("Original:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
        myArray = qs.quicksort(myArray);
        System.out.println("Sorted:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}

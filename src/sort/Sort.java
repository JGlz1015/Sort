package sort;

import java.util.ArrayList;

public class Sort {
    
    public static <E extends Comparable<E>> void mergeSort(ArrayList<E> arrayList, int start, int end) {
        if (end - start <= 1) return;
        int middle = (start + end) / 2;
        mergeSort(arrayList, start, middle);
        mergeSort(arrayList, middle, end);
        merge(arrayList, start, middle, end);
    }

    public static <E extends Comparable<E>> void mergeSort(ArrayList<E> arrayList) {
        mergeSort(arrayList, 0, arrayList.size());

   
    }

    public static <E extends Comparable<E>> void merge(ArrayList<E> arrayList, int start, int middle, int end) {
        int i=start, j=middle;
        ArrayList<E> temp = new ArrayList<>();
        while (i < middle && j < end) {
            if (arrayList.get(i).compareTo(arrayList.get(j)) > 0) {
                temp.add(arrayList.get(j));
                j++;
            } else {
                temp.add(arrayList.get(i));
                i++;
            }
        }
        while (i < middle) {
            temp.add(arrayList.get(i));
            i++;
        }
        while (j < end) {
            temp.add(arrayList.get(j));
            j++;
        }
        for (i=start; i<end; i++) {
            arrayList.set(i, temp.get(i-start));
        }
    }

    public static <E extends Comparable<E>> boolean isSorted(ArrayList<E> arrayList) {
        for (int i = 0; i < arrayList.size()-1; i++) {
            if(arrayList.get(i).compareTo(arrayList.get(i+1)) > 0) return false;

        }
        return true;
    }
}

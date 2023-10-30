package sort;

import java.util.ArrayList;
import java.util.Random;

public class Student<T extends Comparable<T>> implements Comparable<Student<T>> {
    private T grade;

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }

    public Student (T o) {
        setGrade(o);
    }

    @Override
    public int compareTo(Student<T> o) {
        return getGrade().compareTo(o.getGrade());
    }

    public static void main(String[] args) {
         ArrayList<Student<Float>> arrayList = new ArrayList<>();
        int arrayLength = 10;
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arrayList.add(new Student<Float>(random.nextFloat()));
        }

        for (Student<Float> stu: arrayList) {
            System.out.println(stu.getGrade());
        }
        
        System.out.println("Before sorting " + Sort.isSorted(arrayList));

        Sort.mergeSort(arrayList);

        System.out.println("After sorting " + Sort.isSorted(arrayList));

        for (Student<Float> stu:arrayList) {
            System.out.println(stu.getGrade());
        }


    }
}
    



  


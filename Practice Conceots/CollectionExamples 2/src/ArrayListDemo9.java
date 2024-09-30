import java.util.*;
import java.lang.Comparable;

class Student implements Comparable<Student> {
    int rno;
    String name;
    double per;

    public Student(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return rno + "\t" + name + "\t" + per + "\n";
    }
//    @Override
//    public int compareTo(Student obj){
//        return rno-obj.rno;
//    }

//    @Override
//    public int compareTo(Student obj){
//        return name.compareTo(obj.name);
//    }

    @Override
    public int compareTo(Student obj) {
        if (rno > obj.rno)
            return 1;
        else if (rno < obj.rno)
            return -1;
        else
            return 0;
    }
}

public class ArrayListDemo9 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Mathew", 45.56);
        Student s2 = new Student(121, "Anderson", 45.34);
        Student s3 = new Student(110, "Simon", 87.78);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Elements : \n" + list);
        Collections.sort(list);

        //   System.out.println("Sorting based on Roll Number : \n"+list);
        //    System.out.println("Sorting based on Name : \n"+list);
        System.out.println("Sorting based on Rno : \n" + list);

    }
}

 import java.util.*;
class Student2{
    int rno;
    String name;
    double per;

    public Student2(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    @Override
    public String toString(){
        return rno+"\t"+name+"\t"+per+"\n";
    }
}
class SortByRno2 implements Comparator<Student2>
{
    @Override
    public int compare(Student2 obj1,Student2 obj2){
        return obj1.rno-obj2.rno;
    }
}

class SortByName2 implements Comparator<Student2>
{
    @Override
    public int compare(Student2 obj1,Student2 obj2)
    {
        return obj1.name.compareTo(obj2.name);
    }
}

class SortByPer2 implements Comparator<Student2>
{
    @Override
    public int compare(Student2 obj1,Student2 obj2){
        if(obj1.per>obj2.per)
            return 1;
        else if(obj1.per<obj2.per)
               return -1;
        else
                return 0;
    }
}
public class LinkedListDemo1 
{
    public static void main(String[] args) {
        Student2 s1 = new Student2(101, "Mathew", 45.56);
        Student2 s2 = new Student2(121, "Anderson", 45.34);
        Student2 s3 = new Student2(110, "Simon", 87.78);
        
        LinkedList<Student2> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println("Elements : \n"+list);
        Collections.sort(list, new SortByRno2());
        System.out.println("Sorting based on Roll Number : \n"+list);
     
        Collections.sort(list, new SortByName2());
        System.out.println("Sorting based on Name : \n"+list);
       
        Collections.sort(list, new SortByPer2());
        System.out.println("Sorting based on Percentage : \n"+list);
        
    }
}
 
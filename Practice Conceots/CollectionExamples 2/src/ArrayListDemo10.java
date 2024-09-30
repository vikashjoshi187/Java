 import java.util.*;
class Student1{
    int rno;
    String name;
    double per;

    public Student1(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
    }
    @Override
    public String toString(){
        return rno+"\t"+name+"\t"+per+"\n";
    }
}
class SortByRno implements Comparator<Student1>
{
    @Override
    public int compare(Student1 obj1,Student1 obj2){
        return obj1.rno-obj2.rno;
    }
}

class SortByName implements Comparator<Student1>
{
    @Override
    public int compare(Student1 obj1,Student1 obj2)
    {
        return obj1.name.compareTo(obj2.name);
    }
}

class SortByPer implements Comparator<Student1>
{
    @Override
    public int compare(Student1 obj1,Student1 obj2){
        if(obj1.per>obj2.per)
            return 1;
        else if(obj1.per<obj2.per)
               return -1;
        else
                return 0;
    }
}
public class ArrayListDemo10 
{
    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Mathew", 45.56);
        Student1 s2 = new Student1(121, "Anderson", 45.34);
        Student1 s3 = new Student1(110, "Simon", 87.78);
        
        ArrayList<Student1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        System.out.println("Elements : \n"+list);
        Collections.sort(list, new SortByRno());
        System.out.println("Sorting based on Roll Number : \n"+list);
     
        Collections.sort(list, new SortByName());
        System.out.println("Sorting based on Name : \n"+list);
       
        Collections.sort(list, new SortByPer());
        System.out.println("Sorting based on Percentage : \n"+list);
        
    }
}
 
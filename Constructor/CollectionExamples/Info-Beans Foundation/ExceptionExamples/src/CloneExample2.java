// program showing the concept of cloning (shallow cloning)
class Course1 implements Cloneable{
    String course1,course2;
    public Course1(String course1, String course2) {
        this.course1 = course1;
        this.course2 = course2;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class Student1 implements Cloneable{
    int rno;
    String name;
    Course1 course;
    
    public Student1(int rno, String name, Course1 course) {
        this.rno = rno;
        this.name = name;
        this.course = course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student1 stud = (Student1)super.clone();
        stud.course = (Course1)course.clone();
        return stud; 
    }
}
public class CloneExample2 
{
    public static void main(String[] args) {
        try{
            Course1 cobj = new Course1("Java", "Javascript");
            Student1 sobj1 = new Student1(101, "Jackson", cobj);
            Student1 sobj2 =  (Student1)sobj1.clone();
                
            System.out.println("---------------Details----------------");
            System.out.println("roll number : "+sobj1.rno);
            System.out.println("name : "+sobj1.name);
            System.out.println("course - \n\tcourse1 : "+sobj1.course.course1);
            System.out.println("\tcourse2 : "+sobj1.course.course2);
            
            System.out.println("\nroll number : "+sobj2.rno);
            System.out.println("name : "+sobj2.name);
            System.out.println("course - \n\tcourse1 : "+sobj2.course.course1);
            System.out.println("\tcourse2 : "+sobj2.course.course2);
            
            sobj2.course.course1="Sanskrit";
            
            System.out.println("---------------Details----------------");
            System.out.println("roll number : "+sobj1.rno);
            System.out.println("name : "+sobj1.name);
            System.out.println("course - \n\tcourse1 : "+sobj1.course.course1);
            System.out.println("\tcourse2 : "+sobj1.course.course2);
            
            System.out.println("\nroll number : "+sobj2.rno);
            System.out.println("name : "+sobj2.name);
            System.out.println("course - \n\tcourse1 : "+sobj2.course.course1);
            System.out.println("\tcourse2 : "+sobj2.course.course2);
            
            System.out.println("sobj1 : "+sobj1.hashCode()+"\t"+sobj1.course.hashCode());
            System.out.println("sobj2 : "+sobj2.hashCode()+"\t"+sobj2.course.hashCode());
        }catch(CloneNotSupportedException e)
        {
            System.out.println("Exception : "+e);
        }
    }
}

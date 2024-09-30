// program showing the concept of cloning (shallow cloning)
class Course{
    String course1,course2;
    public Course(String course1, String course2) {
        this.course1 = course1;
        this.course2 = course2;
    }
}
class Student implements Cloneable{
    int rno;
    String name;
    Course course;
    
    public Student(int rno, String name, Course course) {
        this.rno = rno;
        this.name = name;
        this.course = course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class CloneExample1 
{
    public static void main(String[] args) {
        try{
            Course cobj = new Course("Java", "Javascript");
            Student sobj1 = new Student(101, "Jackson", cobj);
            Student sobj2 =  (Student)sobj1.clone();
                
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

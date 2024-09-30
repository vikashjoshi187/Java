public class ThreadDemo2 
{
    static void display(){
                
        
        Thread obj = Thread.currentThread();
        System.out.println("Thread name : "+obj);
        
        ThreadGroup group = obj.getThreadGroup();
        System.out.println(""+group);        
        
        String groupName = group.getName();
        System.out.println("Group name : "+groupName);
        
        int priority = obj.getPriority();
        System.out.println("Priority : "+priority);
    
        String name = obj.getName();
        System.out.println("Name : "+name);

    }
    public static void main(String[] args) {
        display();
    }
}

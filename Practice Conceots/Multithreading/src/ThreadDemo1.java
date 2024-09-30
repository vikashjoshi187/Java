public class ThreadDemo1 
{
    public static void main(String[] args) {
        Thread obj = Thread.currentThread();
        System.out.println("Thread name : "+obj);
        
        ThreadGroup group = obj.getThreadGroup();
        System.out.println(""+group);        
        
        String groupName = group.getName();
        System.out.println("Group name : "+groupName);
        
//        System.out.println("Group name : "+obj.getThreadGroup().getName());

        int priority = obj.getPriority();
        System.out.println("Priority : "+priority);
    
        String name = obj.getName();
        System.out.println("Name : "+name);
    }
}

package ObserverPatternDemo;

import com.java.observerpattern.MessageBoard;
import com.java.observerpattern.Student;
import com.java.observerpattern.Teacher;

public class Demo {
   
    public static void main(String[] m){
        
        MessageBoard message = new MessageBoard();
        
        
        Student st = new Student(message);
        Teacher te = new Teacher(message);
        message.setMessage("hi");
        message.setMessage("new update");
        
        
        
    }
}

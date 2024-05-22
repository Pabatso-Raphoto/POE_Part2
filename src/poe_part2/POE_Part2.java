/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_part2;

import javax.swing.JOptionPane; 
import java.util.ArrayList;
/**
 *
 * @author lab_services_student
 */
public class POE_Part2 {
        public static String WelcomeMessage;
        public static String TaskDesc;
        public static String TaskName;
        private static int TaskNr = 0;
       
        
        //List to store tasks
        private static List<Task> tasks;
        
        public POE_Part2(){
            tasks = new ArrayList<>();
        }
        
       
        
    /**
     * @param args the command line arguments
     */
        //main methods
    public static void main(String[] args) {
        // TODO code application logic here
   
      //Welcome Message to user 
       
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        TaskName = JOptionPane.showInputDialog(null, "Enter the task name");
        JOptionPane.showMessageDialog(null,"Your task name is " + TaskName);
        
        
        var feature = 0;   
        
        
           //do-while  loop for the tasks and ends at eand of loop        
        do{
                  String[]options = {"1.Add tasks", "2.Coming Soon", "3.Quit" };
                  feature = JOptionPane.showOptionDialog(null, "Hello User!", "Welcome to EasyKanban", 0, 2, null, options, options[0]);
    
           switch(feature){
               
               case 0:
                   JOptionPane.showMessageDialog(null, "Add task method");//remove later
                   //addTask();
                   break;
               case 1:
                   JOptionPane.showMessageDialog(null, "Coming soon");
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, "Goodbye");
                   System.exit(0);
               default:
                   JOptionPane.showMessageDialog(null, "Incorrect selection!!!!!");
           }
        
        }while(feature != 2);      
        
        
      
        POE_Part2 taskManager = new POE_Part2();
        //Add specific task 
        taskManager.addTask("Complete assignment");
        taskManager.addTask("Attend meeting");
        taskManager.addTask("Submit report");
                   
     
        //Display tasks 
        taskManager.displayTasks();
        
        
     
 
        
        
        
    }
    
    
    //Method to display all task - void means no return
    public void displayTasks(){
        POE_Part2 show = new  POE_Part2(); //line creates new Stringbuilder object named show.
                                                  //Stringbuilder constructs strings in Java.
        for(POE_Part2 task : tasks){ //for loop iterates each Task object into task list.
            show.append(task).append("/n"); //
        }
        JOptionPane.showMessageDialog(null, show.toString(),"Tasks", JOptionPane.INFORMATION_MESSAGE);//displays an info messagge 
    }
    
    
    public static boolean checkTaskDescription(){
    if(TaskDesc.length() <=50){
    JOptionPane.showMessageDialog(null, "Task successfully captured");
    }else{
    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
    }
    return true; 
    }

//checking The Task length 
    
        public void addTask (String TaskDesc) {//test comment
        Task newTask = new Task(TaskNr++, TaskDesc); //Create new task with current TaskNr
        tasks.add(newTask);//Add task to the List    
}
        
}




 /*if(feature == 0)
          {
              
          }else if(feature == 1)
          {
          
          }
          else if(feature == 2)
          {
          
          }
          else
          {
          
          }*/


/* do{
          if(feature == 0 && 1 ){
           JOptionPane.showMessageDialog(null,"You selected task 1" );   
           }if(feature ==1){
            JOptionPane.showMessageDialog(null,"You selected option 2");
           }if(feature ==3){
            JOptionPane.showMessageDialog(null, "You selected option 3")
                    }while () 
        
        String[]options = {"1.Add tasks", "2.Coming Soon", "3.Quit" };
        var feature = JOptionPane.showOptionDialog(null, "Select One:", "Hello User!", 0, 3, null, options, options[0]);
        */
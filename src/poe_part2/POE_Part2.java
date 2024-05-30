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
    
         //List to store tasks
        private static ArrayList<TaskClass> tasks = new ArrayList();
        private static int TaskTotalHours ;
       
        

        //main method
    public static void main(String[] args) {
        // TODO code application logic here
   
      //Welcome Message to user 
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        int numberofTasks = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to enter?"));
        
        
                                
        do {
            String[] options = {"1.Add tasks", "2. Show Report", "3.Quit"};
            int feature = JOptionPane.showOptionDialog(null, "Choose an Option", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);                       
                  
           switch(feature){
               
               case 0:
                  addTasks(numberofTasks);
                   break;
               case 1:
                   JOptionPane.showMessageDialog(null, "Coming soon");
                   break;
               case 2:
                   JOptionPane.showMessageDialog(null, "Exiting application, Goodbye");
                   System.exit(0);
               default:
                   JOptionPane.showMessageDialog(null, "Incorrect selection!!!!!");
           }
        
        } while (true);
        
        }
        private static void addTasks(int numberofTasks){
            
            for(int i = 0; i< numberofTasks; i++){
                String TaskName = JOptionPane.showInputDialog("Enter task name");
                
                String taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
            
            if(taskDescription.length()>50) {
                
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            
            i--; 

            continue;
            }
            
            String developerFirstName = JOptionPane.showInputDialog("Enter developer's first name:");
            String developerLastName = JOptionPane.showInputDialog("Enter developer's last name:");
            int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration in hours:"));
            
            
            String taskStatus = JOptionPane.showInputDialog(null, "Select task status: \n1. To do\n2. Done\n3 Doing");
            
            //input to actual text
            if("1".equals(taskStatus)){
                taskStatus = "To do";
            } else if ("2.".equals(taskStatus)){
                taskStatus = "Done";
            }else if("3.".equals(taskStatus)){
                taskStatus = "Doing";
            }else{
                // Default to "To do" if input is invalid 
                taskStatus = "To do";
                    }
            // Create a new task object with the provided details
            TaskClass task = new TaskClass(TaskName, tasks.size(), taskDescription, developerFirstName, developerLastName, taskDuration, taskStatus);

            // Add the new task to the list of tasks
            tasks.add(task);

            // Add the duration of the new task to the total hours
            TaskTotalHours += task.returnTotalHours();

            JOptionPane.showMessageDialog(null, "Task successfully captured\n" + task.printTaskDetails());
        }

        JOptionPane.showMessageDialog(null, "Total number of hours across all tasks: " + TaskTotalHours);
    }
}
            
            
            
            
            
            
            
            
            
        
    
    


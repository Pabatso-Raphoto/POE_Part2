/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe_part2;

/**
 *
 * @author lab_services_student
 */
public class TaskClass {

    
     private String TaskName; 
     private int taskNumber; 
     private String taskDescription;
     private String developerFirstName;
     private String developerLasttName;
     private int taskDuration;
     private String taskID;
     private String taskStatus;
     
     public Task(String TaskName, int taskNumber,String taskDescription, String developerFirstName, String developerLastName, int taskDuration, 
              String taskStatus){
     this.TaskName = TaskName;
     this.taskNumber = taskNumber;
     this.taskDescription = taskDescription;
     this.developerFirstName = developerFirstName;
     this.developerLasttName = developerLastName;
     this.taskDuration = taskDuration;
     this.taskID = taskID;
     this.taskStatus = taskStatus;     
     }
    
     public String createTaskDescription(){
         return taskDescription()<=50;
                 }
         
     public String createTaskID(){
         
         //Get first 2 letters of task name and change to uppercase 
         String TaskName1 = TaskName.substring(0,2).toUpperCase();
         
         //Get last 3 letters of developer's last name and put in uppsercase
         String developerLastName1 = developerLastName.substring(developerLastName.length()-3) ;
         
         //Combination of the TaskName1 and developLastname1 with colons between them
         String taskID = TaskName1 + ":" + taskNumber + ":" + developerLastName1;
         
         return taskID;
     }
     
     public String printTaskDetails(){
         return "Task Status is: " + taskStatus + "\n" + 
                 "Developer Details: " + developerFirstName + " " + developerLastName + "\n" + 
                 "Task Number: " + taskNumber + "\n" + 
                 "Task Name: " + TaskName + "\n"+ 
                 "Task Description: " + taskDescription + "\n" +
                 "Task ID: " + taskID + "\n" +
                 "Task Duration: " + taskDuration + "Hours";
     }
     
     public int returnTotalHours(){
         return TaskDuration;
     }
}
    
}

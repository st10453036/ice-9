/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice9;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Ice9 {

    public static void main(String[] args) {
             //declarations
        int a, b;
        String num1, num2;
 //JOptionPane
       num1 = JOptionPane.showInputDialog(null,"Input 1st number");
       a = Integer.parseInt(num1);
       
        num2 = JOptionPane.showInputDialog(null,"Input 2nd number");
        b = Integer.parseInt(num2);
         
      
      while (true){
        String menu = """
                      ======Menu=======
                      1. addition
                      2. subtration
                      3. division
                      4.multiplication
                      0 Exit""";           
                
    
String choice = JOptionPane.showInputDialog(menu);            
        
 
 
      switch (choice){
          case "1": JOptionPane.showInputDialog(null," The sum of " + a + " & " + b + " is " + ( a + b ) );
      break;
          case "2":
              JOptionPane.showInputDialog(null," The difference " + a + " & " + b + " is " + ( a - b ) );
         break;    
       case "3":
              JOptionPane.showInputDialog(null," The quotient of " + a + " & " + b + " is " + ( a / b ) );
         break;
       case "4": 
           JOptionPane.showInputDialog(null," The product of " + a + " & " + b + " is " + ( a * b ) );
       case "0": 
               JOptionPane.showInputDialog(null, "Exiting...");
               System.exit(0);
               break;
      
      }
        
      }
    }
}

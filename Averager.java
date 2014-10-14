//Will Fox

import java.util.Scanner;

public class Grades {
    
    public static void main(String []args) {
        
        Scanner sc = new Scanner(System.in);
        double numInput = 0.0;
        double totalNum = 0.0;
        System.out.println("Enter the number you want to average (or -1 to exit): ");
        double addNum = sc.nextDouble();
        while(addNum != -1) {
            
            totalNum = totalNum + addNum;
            numInput = numInput + 1;
            System.out.println("Enter another number (or -1 to exit): ");
            
            addNum = sc.nextDouble();
            
            
        }
        
        System.out.println("Your grade average is: " + totalNum / numInput);
        
    }
    
}
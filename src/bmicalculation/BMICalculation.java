package bmicalculation;

import java.util.*;
public class BMICalculation {
    public static void main(String[] args) {
      
        System.out.println("BMI calculation and food intake System");
        
        double BMI,weight,Wpound,Dcalories,height;
        
        
        Scanner sc = new Scanner(System.in);
        
           System.out.println("\nPlease enter your weight in KG ");
           
           weight = sc.nextDouble();
           
           System.out.println("\nPlease enter your height in meters");
              
           height = sc.nextDouble();
           
           Wpound = weight*2.2;
           
           Dcalories= Wpound*19;
           
           BMI= weight/(height*height);
           
          System.out.printf("Your calories intake is %.2f",Dcalories,"Calories");
          System.out.printf("\nYour BMI is %.2f",BMI);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_power_x;
import java.util.Scanner;
/**
 *
 * @author Salah
 */
public class Factorial_Power_x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int     x,
                i,
                fact = 0,
                k;
    
        double sum=1,
                sumx=1,
                total=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of x");
    
        x = input.nextInt();
        

        
        

        for (k = 1; k <= x; k++)
        {
         
       
          if (k == 1)
        {
            sumx= x;
            sum = 1;
            
            total = total + x;
        }
      
        else{
             sumx = sumx * x;
             sum  = sum * (k) ; 
            total = (double) total + ( sumx / sum);
            }
         
         
                    System.out.printf("sumx:  %.2f\tsum:  %.2f\ttotal:  %.2f\n\n\n",sumx,sum,1+total);

        }
        
    System.out.printf("\n\nTotal: %.4f\n\n",1+ total);
    
    }
    
}

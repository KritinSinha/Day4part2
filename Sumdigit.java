/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdigit;

/**
 *
 * @author KIIT
 */
import java.util.Scanner;
public class Sumdigit 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int x;
        int t;
        int result=0;      //we'll the value of x operated with % each time to the result,so we took it zero.The value will increase accordingly.
        System.out.println("Enter your number");
        x=sc.nextInt();
        
        while(x>0)          //the loop will run only till the quotitent(x/10) is g.t 0.
        {
            
            t=x%10;          //the remainder is there which will go on to add to result.
            result=t+result;   //we'll add the value of remainder to the result for the first time,in the 2nd loop the second tym and so on....
            x=x/10;       
            /*now, we'll operate '/' on x to get the quotient. now what this does is that it now divied x by 10
                          to get the new value for x, and so this new x will be repeated in the loop again till it is greater than 0*/
        }
        
        System.out.println("The sum is"+result);
       
        
        
              
    }
    
}









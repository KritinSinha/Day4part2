/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenbw100;

/**
 *
 * @author KIIT
 */
public class Evenbw100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number is"+i);
            }
        }
    }
    
}

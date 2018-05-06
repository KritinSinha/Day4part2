/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star1;

/**
 *
 * @author KIIT
 */
public class Star1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int i;
      int j;
      for(i=1;i<=5;i++)
      {
          for(j=1;j<=i;j++)
          {
              System.out.print("*"); //remember the next line(print vs println)!!
          }
          System.out.println();
      }
    }
    
}

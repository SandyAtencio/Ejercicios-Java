package CAPITULO_4;

public class Mystery2 
{
   public static void main(String[] args) {
      /*Exercise 4.25*/

      int count = 1;

      while (count <= 10) 
      {
         System.out.println(count % 2 == 1 ? "****" : "++++++++");
         ++count;
      }

      /*
      ****
      ++++++++
      ****
      ++++++++
      ****
      ++++++++
      ****
      ++++++++
      ****
      ++++++++
      */
   } 
} // end class Mystery2


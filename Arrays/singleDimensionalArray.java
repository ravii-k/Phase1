package Arrays;
import java.util.*; 
public class singleDimensionalArray
{
   public static void main(String[] args) 
   { 
      Scanner sc = new Scanner(System.in); 
      System.out.println("Enter 10 array elements");
      int Arr[] = new int[10]; 
      for(int i = 0; i < Arr.length; i++) 
          Arr[i] = sc.nextInt(); 
      System.out.println("Array: "); 
      for(int j = 0; j < Arr.length; j++) 
         System.out.print(Arr[j]); 
   } 
}
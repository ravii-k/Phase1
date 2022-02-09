package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
   public static void main(String[] args) throws IOException
      {
     try 
     {
          FileWriter fw=new FileWriter("/Users/kashy/Desktop/file.txt");
          fw.write("Welcome to this new file created");
          fw.close();
       }
     catch(Exception e)
     {
        System.out.println(e);
        }
     System.out.println("File Created Sucessfully");
     }
  }
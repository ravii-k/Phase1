package FileHandling;
import java.io.File;
import java.io.IOException;
  public class CreateFile {
    public static void main(String[] args) {
      //initialize File constructor
      File file = new File("/Users/kashy/Desktop/file.txt");
      try {
        boolean createFile = file.createNewFile();
        if (createFile) {
          System.out.println("New File is created.");
        }else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
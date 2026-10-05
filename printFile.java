import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class printFile {
  public static void output(String message) {
    File outputFile = new File("passwords.txt");

    try {
      Files.writeString(outputFile.toPath(), message, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } catch (IOException ex) {
      System.out.println("Error writing to file: " + ex.getMessage());
    }
  }
}

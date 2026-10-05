import java.io.File; // to create "passwords.txt file"
import java.io.IOException; // for try and catch block and error handling
import java.nio.file.Files; // to create and append to "passwords.txt" file
import java.nio.file.StandardOpenOption; // for create and append methods

public class printFile { // creates passwords.txt if it doesn't exist, and then appends new passwords to
                         // the file
  public static void output(String message) { // takes String which shows the password and the website the password was
                                              // created for
    File outputFile = new File("passwords.txt"); // where passwords are stored

    try { // crucial as writes can fail
      Files.writeString(outputFile.toPath(), message, StandardOpenOption.CREATE, StandardOpenOption.APPEND); // appends
                                                                                                             // instead
                                                                                                             // of just
                                                                                                             // overwriting
                                                                                                             // password.txt
    } catch (IOException ex) {
      System.out.println("Error writing to file: " + ex.getMessage()); // appropriate message for malfunctions
    }
  }
}

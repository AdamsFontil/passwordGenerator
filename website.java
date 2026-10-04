import java.util.Scanner;

public class website {
  public static String input() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type the website that this password will be used for");

    String website = "";

    while (true) {
      website = scanner.nextLine();
      if (website.length() >= 5 && website.length() <= 32) {
        break;
      } else {
        System.out.println("Please type a website that is between 5 and 32 letters long.");
      }
    }

    System.out.println("Chosen website:" + website);
    return website;
  }
}

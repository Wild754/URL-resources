package tasks;

import java.net.*;
import java.util.Scanner;

public class URLValidator {
    public static void run(Scanner scanner) {
        System.out.print("Enter URL: ");
        try {
            new URL(scanner.nextLine());
            System.out.println("URL is valid.");
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
        }
    }
}

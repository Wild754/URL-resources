package tasks;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class RedirectDetector {
    public static void run(Scanner scanner) {
        System.out.print("Enter URL: ");
        try {
            URL url = new URL(scanner.nextLine());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setInstanceFollowRedirects(false);
            int responseCode = conn.getResponseCode();
            if (responseCode / 100 == 3) {
                System.out.println("Redirected to: " + conn.getHeaderField("Location"));
            } else {
                System.out.println("No redirection.");
            }
        } catch (Exception e) {
            System.out.println("Error detecting redirect: " + e.getMessage());
        }
    }
}
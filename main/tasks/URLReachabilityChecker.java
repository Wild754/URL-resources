package tasks;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URLReachabilityChecker {
    public static void run(Scanner scanner) {
        System.out.print("Enter URL: ");
        try {
            URL url = new URL(scanner.nextLine());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("HEAD");
            System.out.println(conn.getResponseCode() == HttpURLConnection.HTTP_OK ?
                    "URL is reachable." : "URL is not reachable.");
        } catch (Exception e) {
            System.out.println("Error checking URL: " + e.getMessage());
        }
    }
}
package tasks;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class HeaderPrinter {
    public static void run(Scanner scanner) {
        System.out.print("Enter URL: ");
        try {
            URL url = new URL(scanner.nextLine());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            System.out.println("Response headers:");
            conn.getHeaderFields().forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (Exception e) {
            System.out.println("Error fetching headers: " + e.getMessage());
        }
    }
}
package tasks;

import java.net.*;
import java.util.Scanner;

public class URLParser {
    public static void run(Scanner scanner) {
        System.out.print("Enter URL: ");
        try {
            URL url = new URL(scanner.nextLine());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + (url.getPort() == -1 ? "Default" : url.getPort()));
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
        }
    }
}

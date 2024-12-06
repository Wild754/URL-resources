package tasks;

import utils.URLUtils;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageTitleFetcher {
    public static void run(Scanner scanner) {
        System.out.print("Enter webpage URL: ");
        try {
            String content = URLUtils.readContentFromURL(scanner.nextLine());
            Pattern pattern = Pattern.compile("<title>(.*?)</title>");
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                System.out.println("Page title: " + matcher.group(1));
            } else {
                System.out.println("No title found.");
            }
        } catch (Exception e) {
            System.out.println("Error fetching page title: " + e.getMessage());
        }
    }
}
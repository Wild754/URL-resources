package tasks;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utils.URLUtils;



public class LinkExtractor {
    public static void run(Scanner scanner) {
        System.out.print("Enter webpage URL: ");
        String webpage = scanner.nextLine();

        try {
            String content = URLUtils.readContentFromURL(webpage);
            Pattern pattern = Pattern.compile("href=\"(.*?)\"");
            Matcher matcher = pattern.matcher(content);
            System.out.println("Links found:");
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (Exception e) {
            System.out.println("Error fetching links: " + e.getMessage());
        }
    }


}
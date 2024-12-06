package tasks;

import utils.URLUtils;

import java.net.*;
import java.util.Scanner;

public class WordCounter {
    public static void run(Scanner scanner) {
        System.out.print("Enter webpage URL: ");
        String webpage = scanner.nextLine();

        try {
            String content = URLUtils.readContentFromURL(webpage);
            String text = content.replaceAll("<[^>]*>", " ");
            String[] words = text.split("\\s+");
            System.out.println("Word count: " + words.length);
        } catch (Exception e) {
            System.out.println("Error counting words: " + e.getMessage());
        }
    }
}
package main;

import tasks.*;

import java.util.Scanner;

public class MenuHandler {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Parse and display URL components");
            System.out.println("2. Validate a URL");
            System.out.println("3. Download a file");
            System.out.println("4. Extract all links from a webpage");
            System.out.println("5. Count words on a webpage");
            System.out.println("6. Check if a URL is reachable");
            System.out.println("7. Print all response headers");
            System.out.println("8. Detect redirects");
            System.out.println("9. Fetch page title");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> URLParser.run(scanner);
                case 2 -> URLValidator.run(scanner);
                case 3 -> FileDownloader.run(scanner);
                case 4 -> LinkExtractor.run(scanner);
                case 5 -> WordCounter.run(scanner);
                case 6 -> URLReachabilityChecker.run(scanner);
                case 7 -> HeaderPrinter.run(scanner);
                case 8 -> RedirectDetector.run(scanner);
                case 9 -> PageTitleFetcher.run(scanner);
                case 10 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

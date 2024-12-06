package tasks;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileDownloader {
    public static void run(Scanner scanner) {
        System.out.print("Enter file URL: ");
        String fileUrl = scanner.nextLine();
        System.out.print("Enter destination path: ");
        String destPath = scanner.nextLine();

        try (InputStream in = new URL(fileUrl).openStream();
             FileOutputStream fos = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File downloaded successfully.");
        } catch (Exception e) {
            System.out.println("Error downloading file: " + e.getMessage());
        }
    }
}

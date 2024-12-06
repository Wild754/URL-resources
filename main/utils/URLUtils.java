package utils;

import java.io.*;
import java.net.*;

public class URLUtils {
    public static String readContentFromURL(String urlStr) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new URL(urlStr).openStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
        }
        return content.toString();
    }
}

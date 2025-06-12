package Case_study10;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A simple web crawler that fetches a webpage and extracts all hyperlinks.
 */
public class WebCrawler {
    public static void main(String[] args) {
        String url = "https://www.tzc.edu.cn"; // URL to crawl

        // Fetch the HTML content of the page
        String htmlContent = fetchHtml(url);
        if (htmlContent != null) {
            extractLinks(htmlContent);
        }
    }

    // Method to fetch HTML content from a URL
    private static String fetchHtml(String urlString) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error fetching the page: " + e.getMessage());
            return null;
        }
        return content.toString();
    }

    // Method to extract and print hyperlinks from HTML content
    private static void extractLinks(String html) {
        String regex = "href=\"(.*?)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println("Link: " + matcher.group(1));
        }
    }
}

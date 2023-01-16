package systemdesign;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ShortUrlGenerator {
    public static String generateShortUrl(String url) throws Exception {
        // Choose a hashing algorithm
        MessageDigest hashAlgorithm = MessageDigest.getInstance("SHA-256");

        // Hash the original URL
        byte[] hashValue = hashAlgorithm.digest(url.getBytes(StandardCharsets.UTF_8));

        // Truncate the hash to 6 characters
        String shortUrl = String.format("%06x", new BigInteger(1, hashValue)).substring(0, 6);

        // Add a prefix to the short URL
        shortUrl = "xyz.com/" + shortUrl;

        // Store the original URL and the short URL in a database
      //  storeInDatabase(url, shortUrl);

        return shortUrl;
    }

    // Example usage
    public static void main(String[] args) throws Exception {
        String originalUrl = "https://www.example.com/long/url/path";
        String shortUrl = generateShortUrl(originalUrl);
        System.out.println(shortUrl);  // Output: "xyz.com/fce4a8"
    }
}


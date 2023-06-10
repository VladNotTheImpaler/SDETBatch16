package Class26;

import utils.ConfigReader;

import java.io.IOException;

public class E5ConfigReader {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.getProperty("URL"));
    }
}
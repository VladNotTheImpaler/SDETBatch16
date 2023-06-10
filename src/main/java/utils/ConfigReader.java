package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties(String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties;
    }

    public static String getProperty(String key) throws IOException {

        Properties properties = getProperties(Constants.CONFIG_READER_PATH);
        String values = properties.getProperty(key);
        return values;
    }
}

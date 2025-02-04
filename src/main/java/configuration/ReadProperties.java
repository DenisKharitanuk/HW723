package configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    private static final Properties properties;


    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static int timeout() {
        return Integer.parseInt(properties.getProperty("timeout"));
    }
}
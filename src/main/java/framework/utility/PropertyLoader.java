package framework.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * PropertyLoader for loading properties from property file.
 */
public class PropertyLoader {
    private static Properties props = new Properties();


    static {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream("application.properties")) {
            props.load(resourceStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load property from src/main/resources/env.properties file.
     *
     * @param propertyName the property name
     * @return the string value
     */
    public static String loadProperty(String propertyName) {
        String property = props.getProperty(propertyName);
        if (property == null) {
            property = "";
        }
        return property;
    }
}

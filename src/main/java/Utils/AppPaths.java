package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Created by Shantanu on 2017-04-11.
 */
public class AppPaths {
    private URL loginView, dbCredentials;
    public AppPaths() throws IOException {
        Properties prop = new Properties();
        InputStream propInput = Thread.currentThread().getContextClassLoader().getResourceAsStream("Utils/paths.properties");

        prop.load(propInput);

        loginView = getClass().getClassLoader().getResource("loginView");

    }
}

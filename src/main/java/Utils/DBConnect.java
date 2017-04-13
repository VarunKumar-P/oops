package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Shantanu on 2017-04-11.
 */
public class DBConnect {
    public static Connection conn;
    public static void connectToDB() throws IOException, SQLException {
        Properties prop = new Properties();
        InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("Utils/dbCredentials.properties");

        prop.load(input);

        String host =  prop.getProperty("host");
        String uName = prop.getProperty("user");
        String pass = prop.getProperty("pwd");

        conn = DriverManager.getConnection(host, uName, pass);
    }
}

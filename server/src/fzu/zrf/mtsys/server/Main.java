package fzu.zrf.mtsys.server;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Main {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://blog.tozzger.info:3306/";
    
    public static void main(String[] args) throws Exception {
        Class.forName(JDBC_DRIVER);
        Properties p = new Properties();
        InputStream is = new FileInputStream("psw.properties");
        p.load(is);
        is.close();
        System.out.println(p.get("db"));
    }

}

package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {


    public static Properties loadProperties(String filePath) {

        Properties pro = new Properties();

        try {
            FileInputStream stream = new FileInputStream(filePath);
            pro.load(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro;
    }


}


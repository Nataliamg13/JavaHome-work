package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {

        //Location or path of the file from which we want to read the data
        String path = "Files/test1.properties";

        //A class that helps us navigate to that folder where file is stored
        //if you face an issues hover your mouse and click on ADD EXCEPTION TO METHOD SIGNATURE
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        // This" Properties" class will assist us to read and write data to.properties files
        Properties properties = new Properties();
        //Loads all the data from files inside the above object "properties"
        properties.setProperty("Name", "NattG");
        properties.setProperty("Lastname", "GL");

        properties.store(fileOutputStream, "A new user is being added");
    }
}

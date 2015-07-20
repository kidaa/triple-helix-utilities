package org.triplehelix.lib.properties;

import com.sun.squawk.microedition.io.FileConnection;
import edu.wpi.first.wpilibj.networktables2.util.List;
import java.io.DataInputStream;
import javax.microedition.io.Connector;

/**
 * Loads and stores property values
 * @author robotics
 */
public class PropertyReader {
    
    private static List propertyNames;
    private static List propertyValues;
    
    private PropertyReader() { }
    
    /**
     * Loads the properties from the provided property file.
     * @param fileName The name of the property file.
     */
    public static void loadProperties(String fileName) {
        propertyNames = new List();
        propertyValues = new List();
        
        try {
            FileConnection file = (FileConnection) Connector.open("file://" + fileName);
            DataInputStream reader = file.openDataInputStream();
            String propertyName;
            while ((propertyName = reader.readUTF()) != null) {
                int propertyValue = reader.readInt();
                System.out.println("Loading Property : " + propertyName + " - " + propertyValue);
                propertyNames.add(propertyName);
                propertyValues.add(new Integer(propertyValue));
             }
        } catch(Exception e) {
            System.out.println("Property file not found");
        }
    }
    
    /**
     * Get the value of the stored property, if the property does not exist return the provided default value.
     * @param name The property name to retrieve the value for.
     * @param defaultValue The default value if the property does not exist.
     * @return The value of the requested property or the default value provided
     */
    public static int getProperty(String name, int defaultValue) {
        for (int i = 0; i < propertyNames.size(); i++) {
            if (name.equalsIgnoreCase((String) propertyNames.get(i))) {
                return ((Integer)propertyValues.get(i)).intValue();
            }
        }
        return defaultValue;
    }
}

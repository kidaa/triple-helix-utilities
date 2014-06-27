package org.triplehelix.lib;

import edu.wpi.first.wpilibj.networktables2.util.List;

/**
 *
 * @author robotics
 */
public class RollingAverager {
    
    private List values = new List();
    private int numValues;
    
    /**
     * Initialize an averager that will hold the specified number of values.
     * @param numValues The number of entries the averager will store.
     */
    public RollingAverager(int numValues) {
        if (numValues <= 0) {
            throw new IllegalArgumentException("Cannot have 0 or fewer values.");
        }
        this.numValues = numValues;
    }
    
    /**
     * Initialize an averager that will hold the specified number of values and initialize the values to the specified value.
     * @param numValues The number of entries the averager will store.
     * @param initialValue The value to initialize the averager to.
     */
    public RollingAverager(int numValues, double initialValue) {
        this(numValues);
        for (int i = 0; i < numValues; i++) {
            values.add(new Double(initialValue));
        } 
    }
    
    /**
     * Add a new value to the averager.
     * @param value The value to add to the averager.
     */
    public void addValue(double value) {
        if (values.size() >= numValues) {
            values.remove(0);
        }
        values.add(new Double(value));
    }
    
    /**
     * Get the current average of the averager.
     * @return The current average.
     */
    public double getAverage() {
        double sum = 0;
        
        for(int i = 0; i < values.size(); i++) {
            sum += ((Double) values.get(i)).doubleValue();
        }
        return sum / values.size();
    }
}

package org.triplehelix.lib.pid;

import edu.wpi.first.wpilibj.PIDOutput;

/**
 * Holds the output from the PID controller for later retrieval.
 * @author robotics
 */
public class GenericPIDOutput implements PIDOutput {
    
    private double power;

    /**
     * Store the calculated PID output.
     * @param d The calculated PID output.
     */
    public void pidWrite(double d) {
        power = d;
    }
    
    /**
     * Retrieve the latest calculated PID output.
     * @return The latest calculated PIT output.
     */
    public double getOutput() {
        return power;
    }
}

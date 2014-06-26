/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.triplehelix.lib.pid;

import edu.wpi.first.wpilibj.PIDOutput;

/**
 *
 * @author robotics
 */
public class GenericPIDOutput implements PIDOutput {
    
    private double power;

    public void pidWrite(double d) {
        power = d;
    }
    
    public double getOutput() {
        return power;
    }
}

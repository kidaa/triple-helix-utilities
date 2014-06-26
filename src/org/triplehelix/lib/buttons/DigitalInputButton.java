/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.triplehelix.lib.buttons;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author robotics
 */
public class DigitalInputButton extends Button {
    
    private DigitalInput input;
    
    public DigitalInputButton(int port) {
        input = new DigitalInput(port);
    }

    public boolean get() {
        return input.get();
    }
    
}

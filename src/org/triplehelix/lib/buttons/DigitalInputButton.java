package org.triplehelix.lib.buttons;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * A button that reads from a Digital Ipout on the robot.
 * @author robotics
 */
public class DigitalInputButton extends Button {
    
    private DigitalInput input;
    
    /**
     * Initialize a button that reads from the specified digital input port.
     * @param port 
     */
    public DigitalInputButton(int port) {
        input = new DigitalInput(port);
    }

    /**
     * Get the current state of the digital input.
     * @return The current state.
     */
    public boolean get() {
        return input.get();
    }
    
}

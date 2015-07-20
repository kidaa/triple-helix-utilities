package org.triplehelix.lib.commands.autonomous;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Returns the decimal version of a 3 bit binary number.
 * @author robotics
 */
public class BinaryConverter {
    private Trigger lsb, mb, msb;
    
    /**
    * Initialize a new selector with the provided inputs.
    * @param lsb Least significant bit.
    * @param mb Middle bit.
    * @param msb Most significant bit.
    */
    public BinaryConverter(Trigger lsb, Trigger mb, Trigger msb) {
        this.lsb = lsb;
        this.mb = mb;
        this.msb = msb;
        
    }
    
    /**
     * Retrieves the current decimal value based on the 3 binary bits.
     * @return The decimal value.
     */
    public int getSelectedNumber(){
        return (lsb.get() ? 1 : 0) +        
                2 * (mb.get() ? 1 : 0) +
                4 * (msb.get() ? 1 : 0);
        
    }
    
}

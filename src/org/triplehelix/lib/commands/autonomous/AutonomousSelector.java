package org.triplehelix.lib.commands.autonomous;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.networktables2.util.List;
import org.triplehelix.lib.properties.provides.IProvidesName;

/**
 * A binary selector using 3 buttons that will return the command that is currently selected.
 * @author robotics
 */
public class AutonomousSelector extends BinaryConverter {
    
    private List commandList = new List();
    
    /**
     * Initialize a new autonomous selector with the provided inputs.
     * @param lsb Least significant bit
     * @param mb Middle bit
     * @param msb Most significant bit
     */
    public AutonomousSelector(Trigger lsb, Trigger mb, Trigger msb){
        super(lsb, mb, msb);
    }
    
    public void setCommands(List commandList){
        this.commandList = commandList;
    }

    public IProvidesName getSelectedCommand(){
        if (getSelectedNumber() >= commandList.size()) {
            return new NoneCommand();
        }
        return (IProvidesName)commandList.get(this.getSelectedNumber());
    }
       
}

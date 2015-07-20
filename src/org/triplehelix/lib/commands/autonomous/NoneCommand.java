package org.triplehelix.lib.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import org.triplehelix.lib.properties.provides.IProvidesName;

/**
 * A command that does nothing and displays "NONE" as the command name.
 * @author robotics
 */
public class NoneCommand extends Command implements IProvidesName {

    /**
     * Returns the name "NONE".
     * @return "NONE"
     */
    public String getName() {
        return "NONE";
    }

    protected void initialize() { }

    protected void execute() { }

    protected boolean isFinished() {
        return false;
    }

    protected void end() { }

    protected void interrupted() { }
}

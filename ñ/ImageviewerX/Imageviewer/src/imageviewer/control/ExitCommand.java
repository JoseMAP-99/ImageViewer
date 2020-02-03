package imageviewer.control;

import imageviewer.control.Command;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.exit(0);
    }
    
}

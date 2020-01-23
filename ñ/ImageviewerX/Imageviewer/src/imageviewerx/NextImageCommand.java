package imageviewerx;

public class NextImageCommand implements Command {

    private final ImageDisplay imageDisplay;

    public NextImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute() {
        imageDisplay.display(imageDisplay.image().getNext());
    }
    
}

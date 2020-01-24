package imageviewer;

import imageviewer.control.NextImageCommand;
import imageviewer.control.PrevImageCommand;
import imageviewer.control.ExitCommand;
import imageviewer.persistence.files.FileImageLoader;
import imageviewer.model.Image;
import imageviewer.ui.swing.SwingImageDisplay;

public class Main {
    
    public static void main(String[] args) {
        
        Image image = new FileImageLoader("C:/Users/COCO/Desktop/NADA").load();
        SwingImageDisplay imageDisplay = new SwingImageDisplay();
        imageDisplay.display(image);
        
        MainFrame frame = new MainFrame();
        frame.add(imageDisplay);        
        frame.add("N", new NextImageCommand(imageDisplay));
        frame.add("P", new PrevImageCommand(imageDisplay));
        frame.add("X", new ExitCommand());
        
    }    
}

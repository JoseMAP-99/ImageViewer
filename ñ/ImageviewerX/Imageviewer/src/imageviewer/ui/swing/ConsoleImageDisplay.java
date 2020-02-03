package imageviewer.ui.swing;

import imageviewer.ui.ImageDisplay;
import imageviewer.model.Image;

public class ConsoleImageDisplay implements ImageDisplay {

    private Image image;

    @Override
    public void display(Image image) {
        this.image = image;
        System.out.println(image.getName());
        System.out.println(image.getData().length);
        System.out.println("---------------");
    }

    @Override
    public Image image() {
        return image;
    }
    
}

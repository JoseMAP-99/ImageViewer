package imageviewerx;

public interface Image {
    public String getName();
    public byte[] getData();
    public Image getPrev();
    public Image getNext();
    
}

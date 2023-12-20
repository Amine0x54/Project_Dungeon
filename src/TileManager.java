import java.awt.image.BufferedImage;

public class TileManager {
    private final int height;
    private final int width;

    public TileManager(int height, int width) {
        this.height = height;
        this.width = width;
    }

    // getter hauteur
    public int getHeight() {
        return height;
    }

    //getter largeur
    public int getWidth(){
        return width;
    }

}
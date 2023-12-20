import java.awt.*;

public class HitBox {
    private int x;
    private int y;
    private int width;
    private int height;

    public HitBox(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // Méthode pour vérifier l'intersection avec une autre HitBox
    public boolean intersect(HitBox anotherHitBox) {
        int xOverlap = Math.min(x + width, anotherHitBox.x + anotherHitBox.width) - Math.max(x, anotherHitBox.x);
        int yOverlap = Math.min(y + height, anotherHitBox.y + anotherHitBox.height) - Math.max(y, anotherHitBox.y);

        return xOverlap > 0 && yOverlap > 0;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

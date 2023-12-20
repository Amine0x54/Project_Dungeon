public class SolidThings extends Things {
    private HitBox hitBox;
    // Constructeur
    public SolidThings(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.hitBox = new HitBox(x, y, width, height);
}
// Getter hitBox
    public HitBox getHitBox() {
        return hitBox;
    }
}
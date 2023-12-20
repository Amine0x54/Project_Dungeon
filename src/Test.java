public class Test {
    public void runTests() {
        // Test des intersections
        HitBox hitBox1 = new HitBox(0, 0, 10, 10);
        HitBox hitBox2 = new HitBox(5, 5, 10, 10);
        HitBox hitBox3 = new HitBox(20, 20, 10, 10);
        System.out.println("Intersection entre hitBox1 et hitBox2 : " + hitBox1.intersect(hitBox2)); // censé true
        System.out.println("Intersection entre hitBox1 et hitBox3 : " + hitBox1.intersect(hitBox3)); // censé false
    }
}

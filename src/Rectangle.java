public class Rectangle extends Figure {
    private float x;
    private float y;

    public Rectangle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public float getPerimeter() {
        return 2 * (x + y);
    }

    @Override
    public float getArea() {
        return x * y;
    }
}

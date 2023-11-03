public class Circle extends Figure {
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * r * Math.PI);
    }

    @Override
    public float getArea() {
        return (float) (2 * r * r * Math.PI);
    }
}

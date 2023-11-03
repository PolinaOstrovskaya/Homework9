public class Triangle extends Figure {
    private float x;
    private float y;
    private float z;
    private float p = (x + y + z) / 2;

    public Triangle(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float getPerimeter() {
        return x + y + z;
    }

    @Override
    public float getArea() {
        return (float) Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}

public class Main {
    public static void main(String[] args) {
        Worker w = new Worker();
        Director d = new Director();
        Accountant a = new Accountant();
        System.out.println(w.print());
        System.out.println(d.print());
        System.out.println(a.print());
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(6);
        figures[1] = new Triangle(3, 4, 5);
        figures[2] = new Circle(3F);
        figures[3] = new Rectangle(5, 6);
        figures[4] = new Rectangle(2, 10);
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += figure.getPerimeter();
        }
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
package day33_abstraction.shapeTask;

public abstract class Shape {

    private String shape;

    public Shape(String shape) {
        setShape(shape);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }


    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "shape='" + shape + '\'' +
                '}';
    }
}

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    public String getName() {
        return getClass().getSimpleName();
    }
}

package shapes;

class Circle extends Shape {
    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }
    
    @Override
    public void draw() {
        drawAPI.drawShape("Circle");
    }
}

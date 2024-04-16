package shapes;

class Rectangle extends Shape {
    public Rectangle(DrawAPI drawAPI) {
        super(drawAPI);
    }
    
    @Override
    public void draw() {
        drawAPI.drawShape("Rectangle");
    }
}
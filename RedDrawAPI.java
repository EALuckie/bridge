package drawapi;

class GreenDrawAPI implements DrawAPI {
    @Override
    public void drawShape(String shape) {
        System.out.println("Drawing " + shape + " in green.");
    }
}
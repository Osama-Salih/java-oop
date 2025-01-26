public class CarV1 implements MarkerInterface, Movable, SelfDrivable{
    private int x, y;
    private int numberOfPassengers;

    public CarV1() {}
    
    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void newMethod() {
        System.out.println("new Method");
    }
    @Override
    public void destination(String d) {
        System.out.println("destination = " + d);
    }

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void moveUp() {
        this.y--;
    }

    @Override
    public void moveDown() {
        this.y++;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}

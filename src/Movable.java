public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    default void newMethod() {
        System.out.println("new method");
    }
}

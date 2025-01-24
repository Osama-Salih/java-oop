abstract public class Car {
    float height;
    float weight;
    int numberOfWheels;

   
    public Car() {}

   
    public Car(float height, float weight, int numberOfWheels) {
    this.height = height;
    this.weight = weight;
    this.numberOfWheels = numberOfWheels;
}


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    abstract void autopilot();

    abstract void streamingServices();

    abstract void parkingSeensors();
}
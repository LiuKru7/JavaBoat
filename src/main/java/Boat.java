public class Boat {

    private String model;
    private int engine;
    private int weight;
    private int height;
    private boolean engineOn;
    private int maxSpeed;
    private int reverseSpeed;
    private String boatName;

    public Boat(String model, int engine, int weight, int height, String boatName, boolean engineOn, int maxSpeed, int reverseSpeed) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.height = height;
        this.boatName = boatName;
        this.engineOn = engineOn;
        this.maxSpeed = maxSpeed;
        this.reverseSpeed = reverseSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public boolean getEngineOn() {
        return engineOn;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setReverseSpeed(int reverseSpeed) {
        this.reverseSpeed = reverseSpeed;
    }

    public int getReverseSpeed() {
        return reverseSpeed;
    }

    public void printDetails() {

        System.out.println("\n\nModel: " + model);
        System.out.println("Engine: " + engine + "cc");
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Height: " + height + "cm");
        System.out.println("Boat name: " + boatName);
        System.out.println("Engine on: " + engineOn);
        System.out.println("Max speed: " + maxSpeed + " km/h \n\n");
    }
}

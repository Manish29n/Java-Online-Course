package academy.learnprogramming;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirections;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirections = 0;
    }

    public void steer(int direction){
        this.currentDirections +=direction;
        System.out.println("Vehicle.steer() : steering at "+currentDirections+" degreees ");
    }

    public void move(int velocity,int directions){
        this.currentVelocity=velocity;
        this.currentDirections=directions;
        System.out.println("Vehicle.move() Moving at "+currentVelocity+" in direction "+currentDirections);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirections() {
        return currentDirections;
    }

    public void stop(){
        currentVelocity=0;
    }
}

public class Car extends Vechicle{
    private int numberOfSeats;

    public Car(){
    }
    @Override
    public void start(){
        System.out.println("Car starting");
    }
    @Override
    public void stop(){
        System.out.println("Car stopping");
    }


    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}

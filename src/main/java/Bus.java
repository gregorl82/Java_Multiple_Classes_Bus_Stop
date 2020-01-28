import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Person passenger) {
        if (countPassengers() < this.capacity) {
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        if (countPassengers() > 0) {
            this.passengers.remove(0);
        }
    }

    public void pickUp(BusStop busStop) {
        Person passenger = busStop.removeFromQueue();
        addPassenger(passenger);
    }
}

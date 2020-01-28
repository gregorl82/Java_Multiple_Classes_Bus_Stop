import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Buchanan Street", 5);
        passenger = new Person();
        busStop = new BusStop("Hope Street");
    }

    @Test
    public void hasADestination(){
        assertEquals("Buchanan Street", bus.getDestination());
    }

    @Test
    public void hasACapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.countPassengers());
    }

    @Test
    public void cannotAddPassengerIfFull(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertEquals(5, bus.countPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(2, bus.countPassengers());
    }

    @Test
    public void canPickUpPassenger(){
        busStop.addToQueue(passenger);
        bus.pickUp(busStop);
        assertEquals(0, busStop.countQueue());
        assertEquals(1, bus.countPassengers());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person passenger;

    @Before
    public void before(){
        busStop = new BusStop("Buchanan Street");
        passenger = new Person();
    }

    @Test
    public void hasAName(){
        assertEquals("Buchanan Street", busStop.getName());
    }

    @Test
    public void queueIsEmptyAtStart(){
        assertEquals(0, busStop.countQueue());
    }

    @Test
    public void addPersonToQueue(){
        busStop.addToQueue(passenger);
        assertEquals(1, busStop.countQueue());
    }

    @Test
    public void removePersonFromQueue(){
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.addToQueue(passenger);
        busStop.removeFromQueue();
        assertEquals(2, busStop.countQueue());
    }
}

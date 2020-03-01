<h1>Java Bus Stop Modelling</h1>
<h2>Objective</h2>
<ul>
<li>Create a TDD model of a bus with passengers.</li>
</ul>
<h2>MVP</h2>
<ul>
<li>Create a Bus class with a Destination, Capacity and an initially empty ArrayList passengers of type Person</li>
<li>Create a method to return the number of passengers on the bus.</li>
<li>Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.</li>
<li>Create a method to remove a passenger from the bus.</li>
</ul>
<h2>Extensions:</h2>
<li>Add a BusStop class which interacts with the other two.</li>
<li>BusStop should have a name and an initially empty ArrayList of type “Person” called Queue.</li>
<li>Add a method to add a Person to the queue.</li>
<li>Add a method to remove a person from the queue.</li>
<li>Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.</li>

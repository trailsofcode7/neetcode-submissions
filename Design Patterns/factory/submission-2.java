// Any vehicle must have getType()
// Every factory must create a vehicle, but I don’t know which one
// For this simple example, no. You could make VehicleFactory an interface instead:
// This is cleaner because VehicleFactory only has one method and no shared state or shared behavior.
// Simple rule: Use interface when you only want to define a contract
// Use abstract class when you want to define a contract plus shared behavior or shared fields.
interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    // Write your code here
    
    Vehicle createVehicle(){
        return new Car();
    } 
}

class BikeFactory extends VehicleFactory {
    // Write your code here
     
    Vehicle createVehicle(){
        return new Bike();
    } 
}

class TruckFactory extends VehicleFactory {
    // Write your code here
     
    Vehicle createVehicle(){
        return new Truck();
    } 
}

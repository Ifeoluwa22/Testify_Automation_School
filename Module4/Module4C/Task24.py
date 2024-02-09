import abc


class Vehicle(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def drive_direction(self):
        pass

class Car(Vehicle):
    def drive_direction(self):
        return "Drive Forward"

class Plane(Vehicle):
    def drive_direction(self):
        return "Drive Upward"

cars = Car()
print(cars.drive_direction())

plane = Plane()
print(plane.drive_direction())


# Create an abstract class called Vehicle
# Create an abstract method called drive_direction()
# Create another class Car that inherits from Vehicle
# Create another class Plane that inherits from Vehicle
# Try running the program and fix the abstract method issues
# Optionally instantiate the Car and Plane method, then invoke the drive_direction() in each of the object instances.

# Hint: the drive_direction() method in your Car should print "Drive forward", while drive_direction() in your Plane class should print "Drive Upward"
from signal import default_int_handler


class Car():
    color = ""
    model = ""
    speed = 0
    brand = ""
    fuel_tank = 0
    number_of_wheels = 0
    engine_size = 0
    mileage = 0
    year = 0


#CONSTRUCTORS- to give strict parmeters that are required to instantiate a class
    def __init__(self, brand, model) -> None:
      self.brand = brand
      self.model = model


# To define a function in python you use def and the name of the method
# self argument exposes everything within that class to the method for it to be used .

#METHOD
    def current_speed(self):
     print(f"Current speed is {self.speed}")

#METHOD WITH ARGUMENT
    def navigation(self, direction): 
      print (f"Turn {direction}")   

#METHOD WITH ARGUMENT DEFAULT PARAMETER
    def navigation(self, direction= "Right"): 
      print (f"Turn {direction}")          

     


# this becomes an instance of the car so the "car" will become an object of the class.

car = Car('Tesla', 'Model 5') #meaning there is no way you can create a car without a brand or model
# car.brand = "Tesla"
# car.model = "Model 5"
car.engine_size = 396
car.number_of_wheels = 4
car.mileage = 0
car.speed = 200
car.color = "Paradise blue"

print(f"Abia's car brand: {car.brand}")
print(f"Abia's car model: {car.model}")
car.current_speed()
car.navigation("Left")
car.navigation() #for if i wanted it to pick up the default argument .

# naa_car = Car
# naa_car.color = "Red"
# naa_car.model = "Model 6"
# naa_car.year = 2017

# functions or methods are re-usable codes that can cause a class to behave in a certain way .
# Like a car can move , turn .




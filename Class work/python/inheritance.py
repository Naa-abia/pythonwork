from types import new_class


class Car:
    brand = ""
    model = ""
    year = 0
    speed = 0
    mileage = 0

  # DEFINING STRICT MEASURES TO BE COLLECTED FROM PARENT TO CHILD -(BRAND , MODEL , YEAR)~Constructors

    def __init__(self, brand, model, year) -> None:

      # the following is the base
        self.brand = brand
        self.model = model
        self.year = year


class ElectricCar(Car):  # means to inherit from the class Car.To have inheritance from multiple classes you use a comma (Car, XXXX)
    battery_capacity = 0

    def __init__(self, brand: str, model: str, year: int):
        super().__init__(brand, model, year)

        # super is re-implementing the behaviour of the base .It reinforces the implementation in the base.

        self.brand = f"{brand} e-car"


class CEngingeCar(Car):  # inheritance is happening here
    engine_capacity = 0


car = Car("Hyundai", "Accent 6", "2020")


# instantiating the class that inherits from Car to inherit from that class.
electric_car = ElectricCar("Tesla", "Model 5", "2020")

#electric_car.battery_capacity = 2000

c_engine_car = CEngingeCar("Hyundai", "Accent 6", "2020")


print(f"Engine car brand: {c_engine_car.brand}")
print(f"It's model is: {c_engine_car.model}")
print(f"Made in year: {c_engine_car.year}")
print(f"Electric car brand: {electric_car.brand}")


#creating an inheritance change. Making CEngine the Parent means its also inheriting from the Car Parent as well. 
class Toyota(CEngingeCar):
    new_variable = 0


new_class = Toyota("Toyota", "Accent 6", "2022")
new_class.engine_capacity = 0
new_class.brand = "Toyota"

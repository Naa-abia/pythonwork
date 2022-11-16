from abc import ABC, abstractmethod


class Payroll(ABC):
    @abstractmethod
    def print_payroll(self):
      pass

# Python abstract class example
# Suppose that you need to develop a payroll program for a company. The company has two groups of employees: full-time employees and hourly employees. The full-time employees get a fixed salary while the hourly employees get paid by hourly wages for their services.
# The payroll program needs to print out a payroll that includes employee names and their monthly salaries.To model the payroll program in an object-oriented way, you may come up with the following classes: Employee, FulltimeEmployee, HourlyEmployee, and Payroll.
# To structure the program, we’ll use modules, where each class is placed in a separate module (or file).


# TO-DO
# they have two categories of employees and they are full time and part-time .
#  Fulltime gets a fixed rate and partime get hourly payment .
# the payroll must come up with Employee, fulltime , hourly , payroll

# Writing the employee as a base class and its going to be an abstract class who is going to be used


class Employee():
    id = 0
    first_name = ""
    last_name = ""
    role = ""
    is_active = True
    salary = 0
    # is active = if the employee is working or not


class FulltimeEmployee(Employee, Payroll):
   def print_payroll(self): 
    self.salary = 1000

    print(f"Employee Full Name: {self.first_name} {self.last_name}")
    print(f"Net Salary: {self.salary}")



class HourlyEmployee(Employee, Payroll):
    number_of_hours_worked = 0 
    HourlyEmployee_rate = 0
    def print_payroll(self):
        self.salary = self.number_of_hours_worked * self.HourlyEmployee_rate

        print(f"Employee Name: {self.first_name}{self.last_name}")
        print(f"Net Salary: {self.salary}")


# its inheriting from the Employee class because they will both be attributes of the employee.
# Bring the properties into the new classes through inheritance.

# INSTANTIATING FULL TIME SALARY WORKER
print("\n")
full_time = FulltimeEmployee()
full_time.salary = 1000
full_time.first_name = "Abia"
full_time.last_name = "Addy"
full_time.print_payroll()

# INSTANTIATING AN HOURLY SALARY WORKER (PART TIME)
print("\n")
hourly = HourlyEmployee()
hourly.first_name = "Habib"
hourly.number_of_hours_worked = 12
hourly.HourlyEmployee_rate = 1000
hourly.print_payroll()


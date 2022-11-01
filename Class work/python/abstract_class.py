# Abstraction is the removal of complexities from a data to make it more user friendly 
# Abstract class cannot be instantiated
# Abstract classes can only be accessed via inheritance


from abc import ABC, abstractmethod
from ast import Pass
# abstractmethod is a decorator used to add meta data to the method class


class User:
    first_name = ""
    last_name = ""
    email = ""
    username = ""
    phone_number = ""
    password = ""

class Product:
    name = ""
    type = ""
    price = 0
    expiry_date = ""
    weight = 0 


class UserAbstract(ABC):
    
    # the user:User means you asking the function should be determined by the user class clearly defined above
    @abstractmethod
    def create_user(self, user:User):
      pass

    @abstractmethod
    def get_all_users(self):
        pass

    @abstractmethod
    def get_user_by_id(self):
        pass


class UserManager(UserAbstract):
    def create_user(self, user: User):
       print("Saving in progress.. \n")
       print(f"First Name : {user.first_name}")


    def get_all_users(self):
        print("Hello Abia ! we are getting all your users")

    def get_user_by_id(self, user_id):
        print("hello world")

# INHERIT FROM ABC if you want a class to be abstract
class ProductAbstract(ABC):
 @abstractmethod
 def create_product(self, product:Product):
        pass
    
# instatiating the UserManager class
user_manager = UserManager()
user_manager.get_all_users()
user_manager.get_user_by_id(78)

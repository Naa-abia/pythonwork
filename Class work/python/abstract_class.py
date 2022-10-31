# Abstraction is the removal of complexities from a data to make it more user friendly 
# # Abstract class cannot be instantiated
# Abstract classes can only be accessed via inheritance


from abc import ABC, abstractmethod
# abstractmethod is a decorator used to add meta data to the method class


class User:
    first_name = ""
    last_name = ""

class UserAbstract(ABC):
    
    @abstractmethod
    def create_user(self, user:User):
      pass

    @abstractmethod
    def get_all_users(self):
        pass

class UserManager(UserAbstract):
    def create_user(self, user: User):
       print("user information")


    def get_all_users(self):
        print("Hello Abia ! we are getting all your users")

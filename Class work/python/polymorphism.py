class IBM:
    def get_processor_speed(self):
        print(f"16GHz")

# for the method overload argument

    def login(self, username, password):
     print("Login in progress..................")

    def login(self, username, password, otp):
     print("Login with otp in progress...........")

 # to not make the variables a constant to override the earlier behaviour 
 # known as "method override" you will have to make the options an optional parameter. It should always come after the required parameter.

    # def login(self, username, password, otp=None):
    #     print("Login with otp in progress")


# one way the inhritance in one way
class Nyawira(IBM):
    pass


# acting in a different way
class Nyawira(IBM):
    def get_processor_speed(self):
     print("32GHz")

# doing a method overload as well


ibm = IBM()
ibm.get_processor_speed()
nyawira = Nyawira()
nyawira.get_processor_speed()

# calling the method overload
# note that if the third variable is not inserted it will give an error

ibm.login("username", "password", "1234")

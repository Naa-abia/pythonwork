class IBM:
# here email & password is required while phone_number and DOB are optional parameters.   
    def register_online(self, email, password , phone_number=None, DOB=None):
     print("Your registration online has been successfull")

     if email == "augusta@meltwater.org":
      print("Hello Abia ! Welcome to your world!")

    #  if you want to check the number isnt none , hence the operator "!= which means is not"
     if phone_number!=None:
      print(f"Your phone number {phone_number} has been registered successfully")

ibm = IBM()
ibm.register_online("abia@gmail.com", "1234")
ibm.register_online("augusta@meltwater.org", "12345", "023433234")
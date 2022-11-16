eit = {
    "name": "Augusta",
    "email": "augusta.addy@meltwater.org",
    "phone_number": "0502708165"
}

# print(type(eit))

print(eit["email"])
print(eit.get("emaili","Behave yourself"))

# can be edited
print("\n")
eit["phone_number"] = "+233240299987"
print(eit.get("phone_number"), "-", eit.get("name"))

for ei in eit:
    print(ei)
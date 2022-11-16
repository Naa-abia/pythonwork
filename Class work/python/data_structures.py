# LISTS
eits = ["Jentrix", "Emmanuel", "Elisa"]
print(eits)

# printing the position
print(eits[2])

# editing a list
eits[2] = "Clinton" 
print(eits)

# printing from the last item on the list. The negatives are from the right 
print(eits[-1], eits[2])

# printing the list 
# for eits in eits:
#     print(eits)

# creating a list that starts to list without the index not starting from zero === index+1
# len means length
# range function will start counting and with each of the elements use it to access the positions of the element

for index in range(len(eits)):
    print(f"{index + 1} - {eits[index]}")

for index in range(len(eits)):
    print(eits)
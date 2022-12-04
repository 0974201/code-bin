#vars
string = "dit is een string"

int = 1
int2 = 2
int3 = 3
int4 = 4

list = ["dit is een list", "aaa", "bbb", "ccc", 1, 2, 3] # in python begint t met 0
list2 = ["I hear it's amazing when the famous purple stuffed worm in flap-jaw space with the tuning fork does a raw blink on Hara-Kiri Rock.", "I need scissors!", "61!"]
nested_list = [list, list2] #i heard u like lists, so i put a list in your list
leeg = []

tuple = ("ddd", "eee", "fff") #als een tuple eenmaal gemaakt is kunnen de waardes niet meer gewijzigd worden

dict = {"g" : 7, "h" :  8, "i": 9} #hash-map; je kan zooi hierin bewaren key:value

# print statement
print("hoi")

# formatted string - can pass along variables (\n = een enter)
print(f'print de bovenstaande variabelen: "{string},\n{int},\n{list},\n{list2},\n{nested_list},\n{tuple},\n{dict}"')


#if statements / conditional statements: 
if 1000 > 1:
    print("1000 is groter dan 1") #de conditie is true, dus print hij dit uit

if int + int2 == int3:
    print(f"{int} + {int2} = {int3}")
else:
    print("hier komt ie niet tenzij je de waardes in de conditie veranderd")

#boolean:
if int < int3 or int2 < int3:
    print(f"{int} of {int2} is kleiner dan {int3}")

if int < int3 and int2 < int3:
    print(f"{int} én {int2} zijn kleiner dan {int3}")

if int != int2:
    print(f"{int} is niet gelijk aan {int2}")

if int4 not in list:
    print(f"{int4} staat niet in de variabele list")

#check of list leeg is
if leeg == []:
    print("dis bitch empty! yeet")


#loops:
for num in range(10): #voor ieder getal tussen 0 en 10 print het nummer in de console
    print(num)

i = 0
while i < 10: #voor zolang i kleiner is dan 10, blijf er 1 bij optellen
    i += 1
    print(i) #dit alles kan ook comment worden, dan blijft hij eindeloos 0 printen. niet aan te raden.

#for loops kunnen ook gebruikt worden om door een lijst te gaan: 
for item in list2:
    print(item)

for item in tuple:
    print(item)

for key in dict.keys():
    print(key)

for value in dict.values():
    print(value)

for key, value in dict.items():
    print(f"{key} : {value}")
# LOOOOOOOOOOOOPS!!!!!!!11

#good ol' fizzbuzz

numbers = list(range(1, 31))

for num in numbers:
    result = ""
    if num % 3 == 0:
        result += "Fizz\n"
    if num % 5 == 0:
        result += "Buzz\n"
    if num % 3  == 0 and num % 5 == 0:
        result += "FizzBuzz"
    if result == "":
        result = num

    print(result)


# breaks

# priemgetallen

nummers = list(range(1, 101))

for num in nummers:
    priem = True
    for deler in nummers:
        if deler < num and deler > 1:
            if num % deler == 0:
                priem = False
                break
    if priem:
        print(num)


# nested lists / 2d arrays?

# bingo

print("insert code here")


# while loops

# pls work

antwoord = ""

while antwoord != ".":
    try:
        antwoord = input("Geef een getal: \n >>")
        if antwoord == ".":
            print("Tot ziens!")
            break
        else:
            n = int(antwoord)
            num = list(range(2, n -1))
            priem = True
            
            for i in num:
                if i < n:
                    if n % i == 0:
                        priem = False
            if priem:
                print(f"{n} is een priemgetal!")
            else:
                print(f"{n} is geen priemgetal!")
                
    except ValueError: #valueerror omdat dat de error is die ik terug kreeg toen ik het zonder try/except runde
        print("Dat is geen getal!")

# LISTS!!!!!!!!!!!!!!!!!

# gaem list:

game_list = ["PUBG", "Fortnite", "Apex Legends", "League of Legends", "Counter Strike", "Heartstone", "Minecraft", "DOTA", "The Division 2", "Splatoon 2"]

print(game_list)

for games in game_list:
    print(games)

#Opdracht a; print 5e game van lijst

print(game_list[4])

#Opdracht b; lengte van 8ste game naam

print(len(game_list[7]))

#Opdracht c; print lengte van lijst
print(f"Er zitten {len(game_list)} games in de lijst.")

#Opdracht d; voeg een extra game toe in de lijst
game_list.insert(1, "Snake")
print(game_list)


# Tuples

#computer ding tuple:

computer_leveranciers = ("Apple", "Asus", "Dell", "Lenovo", "Acer", "Samsung", "MSI", "Hewlett-Packard", "Toshiba", "Microsoft", "Chuwi", "Sony")

print(game_list)
for comp in computer_leveranciers:
    print(comp)

#Opdracht a; print lengte van tuple

print(f"De tuple bevat {len(computer_leveranciers)} computer leveranciers.")

#Opdracht b; lengte van 8ste leverancier naam

print(f"De naam van {computer_leveranciers[7]} bestaat uit {len(computer_leveranciers[7])} karakters.")

#Opdracht c; naam van 10e leverancier
print(computer_leveranciers[9])


# Dictionaries

#telefoonnmr dict

fictional_numbers = {"The Simpsons": "636-555-3226", "Vegas Vacation": "555-0100", "Ghostbusters": "555-23678", "Billy Madison": "555-0840", "Swingers": "213-555-0123", "Bruce Almighty": "555-0123", "Seinfield": "555-FILK", "Arrested Development": "555-0113", "Die Hard With a Vengeance": "555-0001", "The A-Team": "555-6162"} #lmao okay nummers moeten strings zijn anders gaat hij het uitrekenen

print(fictional_numbers)

for name,num in fictional_numbers.items():
    print(name, ":", num)

#Opdracht a; print nummer 6 van dict

print(f"Het telefoonnummer van Bruce Almighty is {fictional_numbers['Bruce Almighty']}.")

#Opdracht b; voeg harry potter toe
fictional_numbers["Harry Potter"] = "605-475-6961"

#Opdracht c; pas nummer ghostbusters aan en print
oud_nummer = fictional_numbers["Ghostbusters"]
fictional_numbers["Ghostbusters"] = "555-2368"
print(f"Het telefoonummer {oud_nummer} van de Ghostbusters is gewijzigd naar {fictional_numbers['Ghostbusters']}")

#Opdracht d; verwijder nummer seinfield en print
verwijderd_nummer = fictional_numbers.pop("Seinfield")
print(f"Telefoonummer {verwijderd_nummer} van Seinfield is verwijderd.")

#Opdracht e; print aantal nummers in dict
print(f"In de dictionary zitten {len(fictional_numbers)} telefoonnummers.")

for name,num in fictional_numbers.items():
    print(name, ":", num)
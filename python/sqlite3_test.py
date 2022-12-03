import sqlite3

cnx = sqlite3.connect('test.db') #maak test db aan

db_test_list = [ #what a thrill
    (2001, "Metal Gear Solid 2: Sons of Liberty"),
    (2004, "Metal Gear Solid 3: Snake Eater"),
    (2008, "Metal Gear Solid 4: Guns of the Patriots"),
    (2002, "Pokémon Ruby"),
    (2004, "Pokémon FireRed"),
    (2006, "Pokémon Pearl"),
    (2002, "Phoenix Wright: Ace Attorney - Justice for All"),
    (2007, "Apollo Justice: Ace Attorney"),
    (2015, "The Great Ace Attorney: Adventures")
]

cnx.close()
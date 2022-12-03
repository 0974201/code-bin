import sqlite3

cnx = sqlite3.connect('python/test.db') 
cursor = cnx.cursor() #dit ding praat basically met de db

#maak test db aan
cursor.execute("create table games (release_year integer, release_name text)")

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

#voer table aan db
cursor.executemany("INSERT INTO games VALUES (?, ?)", db_test_list)
cnx.commit()

#select all rows from table
#for row in cursor.execute("SELECT * FROM games"): #print alle rows in table games
#    print(row)

#select all rows w/ specific value
cursor.execute("SELECT * FROM games WHERE release_year = :y", {"y": 2002})
fetch = cursor.fetchall()
print(fetch)

cnx.close()
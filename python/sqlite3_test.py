import sqlite3

#maak test db aan
cnx = sqlite3.connect('python/test.db') 
cursor = cnx.cursor() #dit ding praat basically met de db

#maak table in test db
cursor.execute("create table games (release_year integer, release_name text)")

db_test_list = [ #what a thrill
    (2001, "Metal Gear Solid 2: Sons of Liberty"),
    (2004, "Metal Gear Solid 3: Snake Eater"),
    (2008, "Metal Gear Solid 4: Guns of the Patriots"),
    (2002, "Pokémon Ruby"),
    (2004, "Pokémon FireRed"),
    (2006, "Pokémon Pearl"),
    (2002, "Phoenix Wright: Ace Attorney - Justice for All"),
    (2007, "Apollo Justice: Ace Attorney")
]

#voer list aan db
cursor.executemany("INSERT INTO games VALUES (?, ?)", db_test_list) #de  vraagtekens hier maken het wat veiliger om dingen in de db te bewaren (denk aan sql injections)
cnx.commit() #dit is belangrijk anders stopt ie het niet in db

#voeg iets toe aan db
new_entry = [(2001, "Phoenix Wright"), (2015, "The Great Ace Attorney: Adventures"), (2022, "Pokémon Scarlet")]
cursor.executemany("INSERT INTO games (release_year, release_name) VALUES (?,?)", new_entry)
cnx.commit()

#update row in db
update_entry_stm = "UPDATE games SET release_name = 'Phoenix Wright: Ace Attorney' WHERE release_name = 'Phoenix Wright'"
cursor.execute(update_entry_stm)
cnx.commit()

#delete row in db
delete_stm = "DELETE FROM games WHERE release_name = 'Pokémon Scarlet'"
cursor.execute(delete_stm)
cnx.commit()

#select all rows from table
for row in cursor.execute("SELECT * FROM games"): #print alle rows in table games
    print(row)

#select all rows w/ specific value
cursor.execute("SELECT * FROM games WHERE release_year = :y", {"y": 2002})
fetch = cursor.fetchall() #pakt alle rows die aan query voldoen
print(fetch)

cnx.close()
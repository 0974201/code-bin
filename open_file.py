# staat dit in een andere repo vn mij? yes.
# probeer ik elke x dat ik een nieuwe regel wil schrijven shift + enter te drukken? also yes.

file = open("yeet.txt")
# file = open(r"C:\Users\adeliae\Desktop\school\OP1\yeet.txt", "r") 
# r aan het begin van aan path wilt zeggen dat hij de raw txt leest, 
# de meegegeven r op het einde wilt zeggen dat hij het bestand alleen moet lezen.

# data = file.read()
# print(data)
# file.close()

# read leest de hele file uit als het is ingeladen,
# daarna moet het ook gesloten worden om te voorkomen dat het in gebruik blijft.
# note to self: comment voorgaande stukken code als je andere commands wilt oefenen
# anders gooit ie een error omdat desbetreffende file al gesloten is.

# om één lijn uit een txt bestand te lezen doe je dat als volgt:
# data = file.readline(5) #als je een getal invoert leest hij alleen n hoeveelheid karakters uit?? huh.
# data = file.readlines() #aan output te zien gooit hij alles in een lijst hiermee. leest alles uit.
# print(data)
# file.close()

for line in file:
    print(line)
file.close()
# for loop gebruiken om lijnen in de txt file uit te lezen.

# hmmmm
# try:
#     for line in file:
#         print(line)
#     file.close()
# except ValueError:
#     print("bestand is al gesloten!")
# cool, t werkt.

write_test = open("yeet2.txt", "r")
# write_test.write("ayy lmaooo")
# write_test.close()

for line in write_test:
    print(line)

from datetime import datetime # < ssshhhh ik that i should be more specific w/ my imports

tijd = datetime.now().hour #cast naar int want ik kreeg ruzie met de ide
naam = input(">> Voer je naam in. \n * : ") #vraag om naam

if tijd >= 6 and tijd <= 11:
    print(">> Goedemorgen, " + naam + ".") #greet
elif tijd >= 12 and tijd <= 17:
    print(">> Goedemiddag, " + naam + ".")
else:
    print(">> Goedenavond, " + naam + ".")

import sqlite3
from sqlite3 import OperationalError
import os

class ManageUser:
    """This class is used to manage users."""

    def __init__(self, database_file): #copypasta van tablemodel.py, don't reinvent the wheel.
        self.database_file = database_file
        if not os.path.exists(self.database_file):
            raise FileNotFoundError(f"Could not find database file: {database_file}")

    #add new user
    def add_new_user(self, user, password, admin): #copypasta van demodatabase.py
        try:
            connection = sqlite3.connect(self.database_file)
            cursor = connection.cursor()
        
            #SQL statement to insert new user, didn't pass along the id bc it's on auto-increment anyways.
            new_user_qry = "INSERT INTO login_test (gebruikersnaam, wachtwoord, is_admin) VALUES (?, ?, ?)"
            new_user = (user, password, admin)
        
            cursor.execute(new_user_qry, new_user)
            connection.commit()

            connection.close()

        except OperationalError as e:
            print(f"Error opening database file {self.database_file}")
            raise e 
        
    def edit_user(self, user, password, admin):
        try:
            connection = sqlite3.connect(self.database_file)
            cursor = connection.cursor()
        
            #SQL statement to update an existing user
            update_user_qry = "UPDATE login_test SET gebruikersnaam = ?, wachtwoord = ?, is_admin = ? WHERE gebruiksersnaam = ?"
            edit_user = (user, password, admin)
        
            cursor.execute(update_user_qry, edit_user)
            connection.commit()

            connection.close()

        except OperationalError as e:
            print(f"Error opening database file {self.database_file}")
            raise e

    def check_user(self, user, password):
        try:
            connection = sqlite3.connect(self.database_file)
            cursor = connection.cursor()
        
            #SQL statement to check if user is present in db
            check_user_qry = "SELECT * FROM login_test WHERE gebruikersnaam = ? AND wachtwoord = ?"
            login_user = (user, password)
            print(login_user)

            cursor.execute(check_user_qry, login_user)
            user = cursor.fetchone() #fetchall geeft alle matchende rows terug, fetchone alleen één row of none als t er niet is. 
            print(user)
            connection.commit()

            connection.close()

        except OperationalError as e:
            print(f"Error opening database file {self.database_file}")
            raise e 
        return user
    
    def delete_user(self, user):
        try:
            connection = sqlite3.connect(self.database_file)
            cursor = connection.cursor()
        
            #SQL statement to delete an existing user
            delete_user_qry = "DELETE FROM login_test WHERE gebruikersnaam = ?"
            delete_user = (user)
            
            cursor.execute(delete_user_qry, delete_user)
            connection.commit()

            connection.close()

        except OperationalError as e:
            print(f"Error opening database file {self.database_file}")
            raise e
        
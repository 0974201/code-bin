import random #imports lib

newrand = random.randint  #declaring var with randomint function
r = newrand(1,6)
roll = False

def setup():
    size(500,500) #size of the screen
    frameRate(15) #refreshes the screen 15x per second

def draw():
    global r
    global roll
    #print(r) #added as a check, prints to console
    strokeWeight(0.2)
    fill(150)
    rect(100, 250, 260, 100)
    fill(0)
    textSize(32)
    text("Click to roll dice",105, 310)
    fill(255)
    rect(25, 25, 200, 200) #background for the dice
    
    fill(168, 10, 10)
    if r == 1:  #circles for the dice
        ellipse(125, 125, 50, 50)
        
    elif r == 2:
        ellipse(60, 190, 50, 50)
        ellipse(190, 60, 50, 50)
        
    elif r == 3:
        ellipse(60, 190, 50, 50)
        ellipse(125, 125, 50, 50)
        ellipse(190, 60, 50, 50)
        
    elif r == 4:
        ellipse(60, 60, 50, 50)
        ellipse(190, 60, 50, 50)
        ellipse(60, 190, 50, 50)
        ellipse(190, 190, 50, 50)
        
    elif r == 5:
        ellipse(60, 60, 50, 50)
        ellipse(190, 60, 50, 50)
        ellipse(125, 125, 50, 50)
        ellipse(60, 190, 50, 50)
        ellipse(190, 190, 50, 50)  
        
    elif r == 6:
        ellipse(60, 60, 50, 50)
        ellipse(60, 125, 50, 50)
        ellipse(60, 190, 50, 50)
        ellipse(190, 60, 50, 50)
        ellipse(190, 125, 50, 50)
        ellipse(190, 190, 50, 50)
        
    if roll == True:
        count = millis()
        print count
        r = newrand(1,6)
        if millis() >= count + 3000:
            roll == False
            

def mouseClicked():
    global roll
    if mouseButton == LEFT:
        roll = True #if left mouse button is pressed the dice will start rolling
    if mouseButton == RIGHT:
        roll = False #added as check
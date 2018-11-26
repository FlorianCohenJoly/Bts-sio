#Florian Cohen-Joly
#Oie 2


#on telecharge la bibliotheque
from random import*


#le joueur commence à la case 0
position=0

while position!=63:
    #on lance 2 dés
    
    de1= randint(1,6)
    de2= randint(1,6)
    position= position+de1+de2
print("Vous obtenez :",de1,de2)


if de1==6 and de2==3 or de1==3 and de2==6 :
    position=26

if de1==4 and de2==5 or de1==5 and de2==4 :
    print("Allez a la case 53")


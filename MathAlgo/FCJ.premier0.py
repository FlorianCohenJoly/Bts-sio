#Florian Cohen-Joly
#Nombre premier 0

#fonction primalite
def primalite (n):
    rep= True

    for d in range(2,n-1):

        if n-1 == 0:
            rep = False

#on retourne rep
    return rep


    #Main

#On saisie N
n=int(input ("Saisir N :"))

if primalite(n):
    print("L'entier",n," est premier")

else :
    print("L'entier",n,"n'est pas premier")

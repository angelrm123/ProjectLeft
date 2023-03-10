#Examen piloto
#Genera un programa que calcule el area de un circulo

pi = 3.1416

radio = input ("Ingresa el radio")
radio = int (radio)

if radio <= 0:
    print ("Error")


else:
    radioalc = radio * radio

    radio = pi * radioalc

    print ("El area del circulo es: "), radio
    




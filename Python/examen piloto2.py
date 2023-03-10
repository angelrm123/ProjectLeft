#Desarrolla un progrma que ayude al usuario a saber si es candidato para un credito bancario


nombre = input ("Ingrese su nombre: ")
apellido = input ("Ingrese su apellido: ")
edad = input ("ingrese su edad: ")
edad = int (edad)

if (edad < 18 and edad > 69):
    input ("No puede aplicar su credito bancario debe tener entre 18 y 69 años")

if (edad > 17 and edad < 70):
    ingresos = input("Ingrese sus ingresos: ")
    ingresos = int(ingresos)

    if (ingresos < 10000)|:
        print("Usted no es candidato para tramitar un credito con nosotros")
    if ingresos > 10000 and ingresos < 25000:
        print ("Felicidades usted es candidato para nuestra argumentacion clasica")


    if ingresos > 25000 and ingresos < 35000:
        print ("Felicidades usted es candidato para nuerstra argumentacion oro")

    if ingresos >= 35000:
        print ("Felicidades usted es candidato para nuestra argumentacion platino")

    print("Adios")


else:
    print("Adios")
    
    


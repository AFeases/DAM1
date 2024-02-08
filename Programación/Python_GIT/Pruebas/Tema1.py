#Sirve para añadir comentarios. Sirve hasta el final de la linea y deja de funcionar en la linea siguiente.
variable = "valor" #variable, todo caracter o palabra seguido de un = se convierte en variable. Su valor puede ser Booleano(True or false o (valor==valor))
# Ademas puede ser int(10), float(10.5) o str("Hola, Mundo"), que debe ir "entre". M != m, _ == Espacio.
# 1var = error.  _1var = correcto
# print = error. Destruye una funcion
LIGHT_SPEED = 300_000 #km/h, Las constantes (variables que tienen valor fijo) es mejor que esten en MAYUSCULA
tres = thee = drei = 3 #Se pueden hacer asignaciones multiples
_3 = tres #variable = variable
print(type(_3)) #Saber el formato de la variable
# OR, AND and NOT
# == igual, != no igual, >= mayor o igual, > mayor, <=menor o igual, < menor.
# /Division float, //Division entera, %Modulo o Resto
# + y -, * y **

#Prioridad      Operador
# 1(mayor)      ()
# 2             **
# 3             -a +a
# 4             * / // %
# 5(menor)      + -

Atradicional = 2 ; AAumentada = 2; print("Tradicional: " + str(Atradicional) + " Aumentada: " + str(AAumentada))
# Dos Formas
Atradicional = Atradicional+10; AAumentada += 10; print("Tradicional: " + str(Atradicional) + " Aumentada: " + str(AAumentada))
print("Valor absoluto de -3.14: " + str(abs(-3.14))) #Obtiene el valor absoluto, es el valor ignorando el signo (+ or -)

# prioridad de tipos de valores = 1ºFloat, 2ºInt 3ºBool
is_raining=False ; print("Es bool: " + str(isinstance(is_raining, bool)))
sound_level=3 ; print("Es int: " + str(isinstance(sound_level, int)))
temperature=28.3 ; print("Es float: " + str(isinstance(temperature, float)))
# 0b = binario, 0o = octal, 0x = hexadecimal
binario = 0b100 ; octal = 0o107 ; hexadecimal = 0xAF
print ("binario 100: " + str(binario) + " octal 107: " + str(octal) + " hexadecimal AF: " + str(hexadecimal)) 
cadenasescapadas = 'Los llamados \'strings\' son secuencias de caracteres'
cadenassimples = "Los llamados 'strings' son secuencias de caracteres"
print (cadenasescapadas + "\n" + cadenassimples)



 



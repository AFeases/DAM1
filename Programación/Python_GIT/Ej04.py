#EJ4: Factorial con un giro: En lugar de calcular el factorial directamente, intenta escribir una
#función que calcule la suma de los factoriales de los números enteros desde 1 hasta N.

def factorializar(n):
    if n == 0:
        return 1
    else:
        return n * factorializar(n - 1)
def sumar_factoriales(n):
    if n == 0:
        return 0
    else:
        return factorializar(n) + sumar_factoriales(n - 1)


numero = int(input("Dime un numero:  "))
print(sumar_factoriales(numero))

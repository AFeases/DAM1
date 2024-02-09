#EJ6: Fibonacci Alternativo: En lugar de calcular la secuencia de Fibonacci, intenta escribir una
#función que calcule la suma de los primeros N términos de la secuencia de Fibonacci.
def fibonacci(n: int) -> int:
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibonacci(n - 1) + fibonacci(n - 2)

def sumar_fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    else:
        return fibonacci(n) + sumar_fibonacci(n - 1)

valor=int(input("Dime un numero"))
print(sumar_fibonacci(valor))
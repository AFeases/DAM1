#EJ8: Números de Ackermann: La función de Ackermann es un ejemplo clásico de una función
#recursiva que crece muy rápidamente y puede poner a prueba la capacidad de manejo de la
#recursión de un lenguaje de programación. Intenta implementarla.

def Ackerman(m,n):
    if m==0: return n+1
    elif n==0: return Ackerman(m-1,1)
    else: return Ackerman(m-1, Ackerman(m,n-1))

num1 = int(input("Dime un numero: "))
num2 = int(input("Dime un numero: "))
print(Ackerman(num1, num2))
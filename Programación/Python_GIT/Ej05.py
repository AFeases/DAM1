#EJ5: Números Primos: Desarrolla una función que determine si un número dado es primo o no
#utilizando recursión.
def es_primo(n, d=2,):
    if n<3:
        if n==0 | n==1: return False
        else: return True
    elif n%d==0: return False
    elif d**2>n: return True
    elif d%2!=0: return es_primo(n, d+2)
    else: return es_primo(n, d+1)

numero = abs(int(input("Dime un numero: ")))
if es_primo(numero)==True: print("Es primo")
else: print("No es primo")

#EJ7: Torres de Hanoi: Implementa el famoso problema de las Torres de Hanoi de forma
#recursiva. Este desafío implica mover discos de diferentes tamaños de una torre a otra
#siguiendo ciertas reglas.
def torre_de_Hanoi(disco=3,T_Origen=6,T_Aux=0,T_Destino=0):
    if T_Destino==6:
        return 0
    if disco==3:
        if T_Origen==3 or T_Origen==6:
            print("Disco 3 to Torre de Destino")
            return torre_de_Hanoi(disco-1,T_Origen-disco,T_Aux,T_Destino+disco)
        elif T_Aux==2 and T_Destino==3:
            print("Disco 3 to Torre Auxiliar")
            return torre_de_Hanoi(disco-2,T_Origen,T_Aux+disco,T_Destino-disco)
        else:
            print("Disco 3 to Torre de Origen")
            return torre_de_Hanoi(disco-1,T_Origen+disco,T_Aux-disco,T_Destino)
    elif disco==2:
        if T_Aux==0:
            print("Disco 2 to Torre Auxiliar")
            return torre_de_Hanoi(disco+1,T_Origen-disco,T_Aux+disco,T_Destino)
        else:
            print("Disco 2 to Torre de Destino")
            return torre_de_Hanoi(disco+1,T_Origen,T_Aux-disco,T_Destino+disco)
    else:
        print("Disco 1 to Torre de Destino")
        return torre_de_Hanoi(disco+2,T_Origen-disco,T_Aux,T_Destino+disco)

torre_de_Hanoi()
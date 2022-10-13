import re


def show_menu():
    count = 0
    flag = True
    opcion = None
    print("Que operacion desea realizar\n",
          "1. Consultar saldo\n",
          "2. Retiro de efectivo\n",
          "3. Historico de Movimientos\n",
          "4. Salir\n")

    while flag:
        opcion = input("Operacion:")
        if len(opcion) < 1:
            flag = not (re.match("[1-4]", opcion))
        else:
            count = count + 1
            print("Ingrese un valor valido\n")
        if count == 5:
            print("Ultimo intento")
        if count == 6:
            opcion = None
            flag = False

    return opcion


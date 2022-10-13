#!/usr/bin/env python
# -*- coding: utf-8 -*-
from RegistroMovimientos import *
from Verify import *
from Menu import *
from Exit import *
from Retiro import *
from Historial import *


def main():
    print("Bienvenido al banco")
    online = False
    flag = verify()
    if flag:
        print("Bienvenido usuario")
        online = True

    if online:
        movimientos = []
        saldo = float(1000)
        movimientos.append(registry(1, saldo, None))
        while online:
            opcion = show_menu()
            if opcion is not None and opcion != "4":
                if opcion == "1":
                    print(f"Su saldo actual es de:${int(saldo)}")
                    online = close()
                if opcion == "2":
                    asaldo = saldo
                    saldo = retiro(saldo)
                    if saldo == 0:
                        movimientos.append(registry(3, None, None))
                        saldo = asaldo
                    else:
                        movimientos.append(registry(2, asaldo, saldo))
                        print(f"A usted le quedan ${int(saldo)}")
                        online = close()
                if opcion == "3":
                    show(movimientos)
                    online = close()
            elif opcion is None:
                print("No se ingreso ningun valor correcto\n")
                online = False
                print("Usted salio")
            elif opcion == "4":
                online = False
                print("Usted salio")
    else:
        print("Usted Salio")


main()

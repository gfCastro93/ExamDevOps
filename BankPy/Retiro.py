def retiro(saldo):
    nsaldo = 0
    print(f"Su saldo es de: ${int(saldo)}\nQue cantidad desea retirar(Centavos no permitidos, seran redondeados)?")
    cantidad = float(input("Cantidad:"))
    if cantidad < 0:
        print("Operacion imposible\nRegresando a Menu")
    elif cantidad > saldo:
        print("Fondos insuficientes")
    else:
        nsaldo = saldo - cantidad
    return nsaldo

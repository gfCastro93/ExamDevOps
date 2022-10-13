from datetime import datetime


def registry(op, saldo, cantidad):
    tiempo = datetime.now()
    fecha = tiempo.strftime("%Y-%m-%d %H:%M:%S")
    if op == 1:
        return f"{fecha} Saldo incial por ${saldo}"
    elif op == 2:
        return f"{fecha} Retiro de efectivo por ${int(saldo - cantidad)}, saldo anterior ${int(saldo)}"
    elif op == 3:
        return f"{fecha} Operacion Negada"

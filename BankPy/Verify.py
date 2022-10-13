def verify():
    flag = True
    cont = 1
    res = False
    while flag:
        if cont <= 3:
            contra = input("Ingrese su contraseña para ingresar:\n")
            cont = cont+1
            if contra == "12345":
                print("Contraseña correcta")
                flag = False
                res = True
            else:
                print("Contraseña incorrecta")
        else:
            print("Limite excedido")
            flag = False
            res = False

    return res

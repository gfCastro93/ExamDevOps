def close():
    resbo = False
    flag = True

    while flag:
        res = input("Desea realizar otra operacion(s/n)?")
        if res == "s" or res == "S":
            flag = False
            resbo = True
        elif res == "n" or res == "N":
            flag = False
            resbo = False
            print("Usted Salio")
    return resbo

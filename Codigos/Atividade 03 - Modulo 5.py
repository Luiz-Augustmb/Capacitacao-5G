# Exercicio 01
'''
print("Entre com o ano: ")
ano = int(input())

if ((ano % 4 == 0) and (ano % 100 != 0) or (ano % 400 == 0)):
    print("{} é bissexto".format(ano))
else:
    print(ano ,"não é ano bissexto.")
'''

# Exercicio 02
'''
dia = int(input("Entre com um valor de 1 a 7: "))
if(dia >= 1 and dia <= 7):
    if(dia == 1 ):
        print("Domingo")
    if(dia == 2):
        print("Segunda")
    if(dia == 3):
        print("Terça")
    if(dia == 4):
        print("Quarta")
    if(dia == 5):
        print("Quinta")
    if(dia == 6):
        print("Sexta")
    if(dia == 7):
        print("Sábado")
else:
    print("Valor inválido")
'''

# Exercicio 03
'''
aux = 0
for i in range(1,16):
    aux = aux + i

print("Soma =" , aux)
'''

# Exercicio 04
'''
soma_idades = 0
cont = 0
while cont < 5:
    idade = int(input("Entre com a idade da pessoa {}: ".format((cont)+1)))
    if(idade < 0 ):
        print("Valor inválido")
    else:
        soma_idades += idade
        cont += 1

print("O valor da soma das idades é",soma_idades)
'''
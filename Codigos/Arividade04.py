times = ['Botafogo', 'Palmeiras', 'Bragantino', 'Grémio', 'Flamengo']

#Exercicio 1 ->

#A) Apenas os 3 primeiros colocados;
#print("3 primeiros colocados:" , times[:3])
 
#B) Os últimos 2 colocados;
#print("2 ultimos colocados:" , times[3:])

#C) Uma lista com os times em ordem crescente alfabética;
#print("Ordem Alfabética (A-Z):" , sorted(times))

#D) Uma lista com os times em ordem decrescente alfabética;
#print("Ordem Alfabética (Z-A):" , sorted(times, reverse = True))

#Exercicio 2 ->
loja1 = {'Apple', 'Samsung ', 'Motorola ', 'Xiaomi' }
loja2 = {'Apple', 'Nokia  ', 'Motorola ', 'LG ' }

total = (len(loja1)) + (len(loja2))
modelos_disponiveis = loja1 | loja2
print("Total de Smartphones disponiveis:", total , "sendo eles:", sorted(modelos_disponiveis))

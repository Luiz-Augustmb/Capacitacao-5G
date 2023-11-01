musicas = []

flag = True

while flag:
    nome = input("Digite o nome da música: ")
    ano = int(input("Digite o ano de lançamento da música: "))

    musica = {'nome': nome, 'ano': ano}

    musicas.append(musica)

    opcao = input("Deseja adicionar outra música? (s/n): ")
    if(opcao == 's' or opcao == 'n'):
        if opcao.lower() == 'n':
            flag = False
    else:
        print("Opção inválida")
        break
        
musica_mais_antiga = min(musicas, key=lambda x: x["ano"])

print("-----------------------------------------------")
print("Total de músicas:", len(musicas))
print("Nome:",musica_mais_antiga['nome'])
print("Ano de lançamento:" , musica_mais_antiga['ano'])
print("-----------------------------------------------")


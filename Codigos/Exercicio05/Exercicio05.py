import numpy as np
import pandas as pd

dataset = pd.read_csv('paises.csv', delimiter=";", encoding="utf-8")

pais = dataset['Country']
regiao = dataset['Region']
alfabetizacao = dataset['Literacy (%)'].astype(float)
maior_populacao = dataset['Population'].idxmax()

'''
oceania_paises = dataset.loc[dataset['Region'].str.contains('OCEANIA'), 'Country'].tolist()

for pais in oceania_paises:
    print(pais)
'''
'''
mediaValores = alfabetizacao.mean()
print(f'Média da taxa de alfabetização do planeta: {mediaValores:.3f}')
'''
'''
pais_mais_populoso = dataset.loc[maior_populacao, 'Country']
regiao_mais_populosa = dataset.loc[maior_populacao, 'Region']
num = dataset.loc[maior_populacao, 'Population']

print(f"País com a maior população: {pais_mais_populoso}")
print(f"Região do país mais populoso: {regiao_mais_populosa}")
print(f"População do país mais populoso: {num} habitantes")
'''

sem_costa = dataset[dataset['Coastline (coast/area ratio)'] == 0]
# Salvando os dados em um novo arquivo CSV
sem_costa['Country'].to_csv('semCosta.csv', sep=';', header = False, index = False)
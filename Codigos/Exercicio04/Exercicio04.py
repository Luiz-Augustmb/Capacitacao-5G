from re import T
import numpy as np
import pandas as pd

dataset = np.loadtxt('space.csv', delimiter=";" , dtype=str, encoding="utf-8", skiprows=1)

companhias = dataset[:,1]
localidades = dataset[:,2]
todosCustos = dataset[:,6].astype(float)
status = dataset[:,7]

success = len(status[status == "Success"])
porcentagem = success / len(status) * 100

print("A pocentagem de missoes que deram certo é: " + str(porcentagem))

valorPositivo = todosCustos[todosCustos>0]
mediaValores = np.mean(valorPositivo)

print("Média dos valores positivos: " + str(mediaValores))

spacex = dataset[np.char.find(companhias, "SpaceX") != -1]
spacex_custo = spacex[:,6].astype(float)
maior = (spacex[np.argmax(spacex_custo)])

print("Maior missão da SpaceX " + str(maior[6].astype(float)))
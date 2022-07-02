## PROBABILIDADE

## Quantidade de linhas

totalLinhasTabela <- nrow(Tabela_1)
totalLinhasBrasil <- nrow(Brasil2010)

populacao <- sum(Brasil2010$pop, na.rm = TRUE)

## Pergunta 1

casados <- sum(Tabela_1$`Estado Civil`=='casado')

totalCasados = casados / totalLinhasTabela

totalCasados * 100


## Pergunta 2

ensinoSuperior <- sum(Tabela_1$`Grau de Instrução`=='superior' & Tabela_1$`Estado Civil`=='casado')

totalSuperior = ensinoSuperior / totalLinhasTabela

totalSuperior * 100

## Pergunta 3

filhos2 <- sum(Tabela_1$`N de Filhos`>2, na.rm=TRUE)

totalFilhos2 = filhos2 / totalLinhasTabela

totalFilhos2 * 100


## Pergunta 4

rural <- sum(Brasil2010$pop[Brasil2010$area=="Rural"], na.rm = T) 

totalRural <- rural / populacao

totalRural * 100


# Pergunta 5

sp <- sum(Brasil2010$pop[Brasil2010$uf=='SP'], na.rm = T)

totalSp <- sp / populacao

totalSp * 100

# Pergunta 6

ac <- sum(Brasil2010$pop[Brasil2010$uf=='AC'], na.rm = T)

to <- sum(Brasil2010$pop[Brasil2010$uf=='TO'], na.rm = T)

pa <- sum(Brasil2010$pop[Brasil2010$uf=='PA'], na.rm = T)

ap <- sum(Brasil2010$pop[Brasil2010$uf=='AP'], na.rm = T)

am <- sum(Brasil2010$pop[Brasil2010$uf=='AM'], na.rm = T)

rr <- sum(Brasil2010$pop[Brasil2010$uf=='RR'], na.rm = T)

ro <- sum(Brasil2010$pop[Brasil2010$uf=='RO'], na.rm = T)

norte <- sum(ac, to, pa, ap, am, rr, ro)

totalNorte <- norte / populacao

totalNorte * 100


# Pergunta 7

sorocaba <- sum(Brasil2010$pop[Brasil2010$municipio=='Sorocaba'], na.rm = T)

totalSorocaba <- sorocaba / sp

totalSorocaba * 100











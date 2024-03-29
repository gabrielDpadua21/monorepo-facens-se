#Defirni o diret�rio de trabalho:
setwd("C:\\Users\\Pichau\\Desktop\\Facens\\2021.01\\04_Disciplinas\\Estat�stica\\09_Vari�vel aleat�ria Discreta")

library(readr)#Abrir o arquivo Tabela 1.csv
tabela <- read.csv("Tabela 1.csv", sep = ";") #Neste arquivo CSV os dados est�o separados por ";"

head(tabela) #Retorna a primeira parte da tabela
tail(tabela) #Retorna a �ltima parte da tabela

summary(tabela) #Resumo dos dados

dim(tabela) #Mostra a quantidade de linhas e colunas em uma tabela

sort(na.omit(tabela$N.de.Filhos)) #Mostra os dados da coluna N.de.Filhos em ordem crescente

boxplot(tabela$N.de.Filhos) #Boxplot da coluna N.de.Filhos
plot(density(na.omit(tabela$N.de.Filhos))) #Densidade da coluna N.de.Filhos

#Visualiza��o
par(mfrow=c(2,1))#Permite criar 2 gr�ficos no mesmo plot

hist(na.omit(tabela$N.de.Filhos), freq = F) #Histograma
lines(density(na.omit(tabela$N.de.Filhos))) #Linhas sob o histograma
boxplot(tabela$N.de.Filhos, horizontal = T) #Boxplot ou Diagrama de caixa
#Se n�o funcionar voc� precisa aumentar a �rea do plot

sd(tabela$N.de.Filhos, na.rm = T) #Desvio padr�o amostral

#---------------------------------------------------------
#Probabilidade:
#p = N.casos de sucesso / N.casos total
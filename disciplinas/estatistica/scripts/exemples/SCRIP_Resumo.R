#Defirni o diretório de trabalho:
setwd("C:\\Users\\Pichau\\Desktop\\Facens\\2021.01\\04_Disciplinas\\Estatística\\09_Variável aleatória Discreta")

library(readr)#Abrir o arquivo Tabela 1.csv
tabela <- read.csv("Tabela 1.csv", sep = ";") #Neste arquivo CSV os dados estão separados por ";"

head(tabela) #Retorna a primeira parte da tabela
tail(tabela) #Retorna a última parte da tabela

summary(tabela) #Resumo dos dados

dim(tabela) #Mostra a quantidade de linhas e colunas em uma tabela

sort(na.omit(tabela$N.de.Filhos)) #Mostra os dados da coluna N.de.Filhos em ordem crescente

boxplot(tabela$N.de.Filhos) #Boxplot da coluna N.de.Filhos
plot(density(na.omit(tabela$N.de.Filhos))) #Densidade da coluna N.de.Filhos

#Visualização
par(mfrow=c(2,1))#Permite criar 2 gráficos no mesmo plot

hist(na.omit(tabela$N.de.Filhos), freq = F) #Histograma
lines(density(na.omit(tabela$N.de.Filhos))) #Linhas sob o histograma
boxplot(tabela$N.de.Filhos, horizontal = T) #Boxplot ou Diagrama de caixa
#Se não funcionar você precisa aumentar a área do plot

sd(tabela$N.de.Filhos, na.rm = T) #Desvio padrão amostral

#---------------------------------------------------------
#Probabilidade:
#p = N.casos de sucesso / N.casos total
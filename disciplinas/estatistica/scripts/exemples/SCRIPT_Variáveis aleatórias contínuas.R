#Aula 10 - Distribuições contínuas

# Distribuição uniforme

#Cria um vetor com 100 valores conforme uma distribuição uniforme
#sendo o valor mínimo 0 e o máximo 30

Var_x <- runif(100,0,30)
Var_x

summary(Var_x)

barplot(Var_x)
hist(Var_x, 
     main = "Histograma - Distribuição Uniforme", 
     xlab = "",
     col = "lightblue")

#Exercício distribuição uniforme:
#Se o tempo que uma máquina gasta para produzir determinado tipo de peça 
#variar uniformemente entre 120 e 160 segundos, qual a probabilidade de que 
#uma peça aleatoriamente escolhida por um engenheiro de controle e automação 
#tenha sido produzida em um tempo entre 130 e 140 segundos? 

punif(140,120,160)*100 - punif(130,120,160)*100

#Distribuição exponencial

#dexp(x, lambda) -> probabilidade de um valor 
#pexp(x, lambda) -> probbilidade acumulada até o valor

#Certo tipo de transistor tem duração de vida que segue uma distribuição 
#exponencial, com média de 400 horas. Determinar a probabilidade de que um 
#transistor aleatoriamente escolhido por uma engenheira eletricista dure: 
  
#a) Menos de 400 horas;

#lambda = 1/média = 1/400
#x = 400 (valor que desejamos)

pexp(400, 1/400)
#ou
(pexp(400, 1/400))*100

#b) Mais de 100 horas;

#lambda = 1/média = 1/400
#x = 100 (valor que desejamos)

#o pexp() calcula o valor entre 0 e a variável x, como queremos
# maior ou igual a x temos que calcular (1 - a chance de ser entre 0 e x)

1- pexp(100,1/400)
#ou
(1- pexp(100,1/400))*100

#Considere que o número de chamadas em um serviço de suporte técnico 24 horas 
#de uma empresa tenha uma distribuição de Poisson com média de 0.5 chamada 
#por hora. 

#a) Qual a probabilidade de passar mais de duas horas até ocorrer uma chamada? 

#Encontrar o lambda -> 1/esperança

1 - pexp (2,0.5)
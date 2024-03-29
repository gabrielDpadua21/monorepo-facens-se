#Aula 10 - Distribui��es cont�nuas

# Distribui��o uniforme

#Cria um vetor com 100 valores conforme uma distribui��o uniforme
#sendo o valor m�nimo 0 e o m�ximo 30

Var_x <- runif(100,0,30)
Var_x

summary(Var_x)

barplot(Var_x)
hist(Var_x, 
     main = "Histograma - Distribui��o Uniforme", 
     xlab = "",
     col = "lightblue")

#Exerc�cio distribui��o uniforme:
#Se o tempo que uma m�quina gasta para produzir determinado tipo de pe�a 
#variar uniformemente entre 120 e 160 segundos, qual a probabilidade de que 
#uma pe�a aleatoriamente escolhida por um engenheiro de controle e automa��o 
#tenha sido produzida em um tempo entre 130 e 140 segundos? 

punif(140,120,160)*100 - punif(130,120,160)*100

#Distribui��o exponencial

#dexp(x, lambda) -> probabilidade de um valor 
#pexp(x, lambda) -> probbilidade acumulada at� o valor

#Certo tipo de transistor tem dura��o de vida que segue uma distribui��o 
#exponencial, com m�dia de 400 horas. Determinar a probabilidade de que um 
#transistor aleatoriamente escolhido por uma engenheira eletricista dure: 
  
#a) Menos de 400 horas;

#lambda = 1/m�dia = 1/400
#x = 400 (valor que desejamos)

pexp(400, 1/400)
#ou
(pexp(400, 1/400))*100

#b) Mais de 100 horas;

#lambda = 1/m�dia = 1/400
#x = 100 (valor que desejamos)

#o pexp() calcula o valor entre 0 e a vari�vel x, como queremos
# maior ou igual a x temos que calcular (1 - a chance de ser entre 0 e x)

1- pexp(100,1/400)
#ou
(1- pexp(100,1/400))*100

#Considere que o n�mero de chamadas em um servi�o de suporte t�cnico 24 horas 
#de uma empresa tenha uma distribui��o de Poisson com m�dia de 0.5 chamada 
#por hora. 

#a) Qual a probabilidade de passar mais de duas horas at� ocorrer uma chamada? 

#Encontrar o lambda -> 1/esperan�a

1 - pexp (2,0.5)
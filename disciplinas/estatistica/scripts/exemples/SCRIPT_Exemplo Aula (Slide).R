#DISTRIBUI��O NORMAL

#Exemplo:

#Uma f�brica de chocolates comercializa barras que pesam em m�dia 200g. 
#Os pesos s�o normalmente distribu�dos. Sabe-se que o desvio padr�o � igual 
#a 40g. Calcule a probabilidade de uma barra de chocolate escolhida ao acaso: 

#a) Pesar mais que 230g; 
(1 - pnorm(230,200,40))*100

#b) Pesar menos que 150g.
pnorm(150,200,40)*100

#c) Pesar entre que 200g e 250g.
(pnorm(250,200,40) - pnorm(200,200,40))*100


#-----------------------------------
#PLOTAR O GR�FICO DO PROBLEMA ACIMA:

#Gera 500 dados aleat�rios conforme a distribu��o normal com m�dia de 200 e 
#desvio padr�o de 40
dados <- rnorm(500,200,40)

#Plota o histograma azul:
hist(dados,
     freq = F,
     breaks = 10,
     main = "Distribui��o dos pesos das barras de chocolate",
     xlab = "Peso das barras",
     col = "lightblue")

#Plota a curva normal:
curve(dnorm(x, mean=mean(dados), sd = sd(dados)), add=T)

#Desenha alinha em vermelho na vertical em 230;
abline(v = 230, col= "red")

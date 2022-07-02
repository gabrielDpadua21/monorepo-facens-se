#DISTRIBUIÇÃO NORMAL

#Exemplo:

#Uma fábrica de chocolates comercializa barras que pesam em média 200g. 
#Os pesos são normalmente distribuídos. Sabe-se que o desvio padrão é igual 
#a 40g. Calcule a probabilidade de uma barra de chocolate escolhida ao acaso: 

#a) Pesar mais que 230g; 
(1 - pnorm(230,200,40))*100

#b) Pesar menos que 150g.
pnorm(150,200,40)*100

#c) Pesar entre que 200g e 250g.
(pnorm(250,200,40) - pnorm(200,200,40))*100


#-----------------------------------
#PLOTAR O GRÁFICO DO PROBLEMA ACIMA:

#Gera 500 dados aleatórios conforme a distribução normal com média de 200 e 
#desvio padrão de 40
dados <- rnorm(500,200,40)

#Plota o histograma azul:
hist(dados,
     freq = F,
     breaks = 10,
     main = "Distribuição dos pesos das barras de chocolate",
     xlab = "Peso das barras",
     col = "lightblue")

#Plota a curva normal:
curve(dnorm(x, mean=mean(dados), sd = sd(dados)), add=T)

#Desenha alinha em vermelho na vertical em 230;
abline(v = 230, col= "red")

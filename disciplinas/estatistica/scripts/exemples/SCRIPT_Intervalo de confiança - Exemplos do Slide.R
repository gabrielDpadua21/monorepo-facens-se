#Intervalo de confiança para média de uma amostra

#1. Uma amostra formada por 38 crianças recém-nascidas em um determinado bairro
#da cidade apresentou um peso médio igual a 2.570g. Estima-se que o desvio 
#padrão de todas as crianças recém-nascidas deste bairro seja igual a 850g. 
#Qual deve ser a média populacional dos pesos de crianças recém-nascidas 
#neste bairro? Assuma um nível de significância igual a 0,08.

n <- 38                #Quantidade de amostras
mediaAmostral <- 2570  #Média da população
sigma <- 850           #Desvio padrão populacional
nivelSign <- 0.08      #Nível de significância

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "±", erro)
paste(C1, " <= média <= ", C2)

#2. As vendas semanais de 15 lojas de uma região do país apresentaram uma média 
#igual a $20.000,00. Sabe-se que as vendas de todas as lojas da região podem 
#ser descritas como uma variável aleatória normalmente distribuída, com desvio 
#padrão igual a $8.300,00. Supondo um nível de confiança igual a 96%, qual deve 
#ser a média populacional das vendas?

n <- 15                #Quantidade de amostras
mediaAmostral <- 20000 #Média da população
sigma <- 8300          #Desvio padrão populacional
nivelSign <- 0.04      #Nível de significância

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "±", erro)
paste(C1, " <= média <= ", C2)

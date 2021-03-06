#Intervalo de confian�a para m�dia de uma amostra

#1. Uma amostra formada por 38 crian�as rec�m-nascidas em um determinado bairro
#da cidade apresentou um peso m�dio igual a 2.570g. Estima-se que o desvio 
#padr�o de todas as crian�as rec�m-nascidas deste bairro seja igual a 850g. 
#Qual deve ser a m�dia populacional dos pesos de crian�as rec�m-nascidas 
#neste bairro? Assuma um n�vel de signific�ncia igual a 0,08.

n <- 38                #Quantidade de amostras
mediaAmostral <- 2570  #M�dia da popula��o
sigma <- 850           #Desvio padr�o populacional
nivelSign <- 0.08      #N�vel de signific�ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "�", erro)
paste(C1, " <= m�dia <= ", C2)

#2. As vendas semanais de 15 lojas de uma regi�o do pa�s apresentaram uma m�dia 
#igual a $20.000,00. Sabe-se que as vendas de todas as lojas da regi�o podem 
#ser descritas como uma vari�vel aleat�ria normalmente distribu�da, com desvio 
#padr�o igual a $8.300,00. Supondo um n�vel de confian�a igual a 96%, qual deve 
#ser a m�dia populacional das vendas?

n <- 15                #Quantidade de amostras
mediaAmostral <- 20000 #M�dia da popula��o
sigma <- 8300          #Desvio padr�o populacional
nivelSign <- 0.04      #N�vel de signific�ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "�", erro)
paste(C1, " <= m�dia <= ", C2)

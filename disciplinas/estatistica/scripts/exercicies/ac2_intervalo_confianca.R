## AC2 INTERVALO DE CONFIANCA

## EX 1

n <- 130 * 0.20              #Quantidade de amostras
mediaAmostral <- 1575  #M?dia da popula??o
sigma <- 285           #Desvio padr?o populacional
nivelSign <- 0.05      #N?vel de signific?ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "?", erro)
paste(C1, " <= m?dia <= ", C2)


## EX 2

n <- 10               #Quantidade de amostras
mediaAmostral <- 56.98  #M?dia da popula??o
sigma <- 3.12           #Desvio padr?o populacional
nivelSign <- 0.07      #N?vel de signific?ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "?", erro)
paste(C1, " <= m?dia <= ", C2)


## EX 3

n <- 23                #Quantidade de amostras
mediaAmostral <- 6000  #M?dia da popula??o
sigma <- 300           #Desvio padr?o populacional
nivelSign <- 0.05      #N?vel de signific?ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "?", erro)
paste(C1, " <= m?dia <= ", C2)


## EX 4

n <- 15                #Quantidade de amostras
mediaAmostral <- 479  #M?dia da popula??o
sigma <- 175           #Desvio padr?o populacional
nivelSign <- 0.05      #N?vel de signific?ncia

#
ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "?", erro)
paste(C1, " <= m?dia <= ", C2)


## EX 5

n <- 20                #Quantidade de amostras
mediaAmostral <- 15  #M?dia da popula??o
sigma <- sqrt(4)           #Desvio padr?o populacional
nivelSign <- 0.09      #N?vel de signific?ncia

ZScore <- qnorm((1-(nivelSign/2)),0,1)
C1 <- mediaAmostral - ZScore*(sigma/sqrt(n))
C2 <- mediaAmostral + ZScore*(sigma/sqrt(n))
erro <- ZScore*(sigma/sqrt(n))

paste(mediaAmostral, "?", erro)
paste(C1, " <= m?dia <= ", C2)










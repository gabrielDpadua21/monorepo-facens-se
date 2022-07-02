#######################################################
## DESVIO PADRÃO POPULACIONAL E AMOSTRAL
##
########################################################

#INSTRUÇÕES:
#Utilize "Amostral ou "Amo"  para estudo com a amostra
#Utilize "Populacional" ou "Pop" para estudos com a populacao
# COLOCAR OS DADOS DO EXERCÍCIO NO VETOR DA LINHA 12

tipo <- "Amo"
dados_do_exercicio <- c(16,10,5,7,13)

media <- mean(dados_do_exercicio)

if (tipo == "Amostral" | tipo == "Amo"){
  d <- desvio_padrão_amostral <- sd(dados_do_exercicio)
  v <- variancia_amostral <- var(dados_do_exercicio)
  t <- "amostral"
} else if (tipo == "Populacional" | tipo == "Pop" ) {
  d <- desvio_padrão_populacional <- sqrt(sum((dados_do_exercicio - mean(dados_do_exercicio))^2)/(length(dados_do_exercicio)))
  v <- variancia_populacional <- sum((dados_do_exercicio - media)^2) / length(dados_do_exercicio)
  t <- "populacional"
}

paste("O valor da média é:", round(media, digits = 1))
paste("O valor do desvio padrão", t, "é:", round(d, digits =1))
paste("O valor da variância", t, "é:", round(v,digits=1))

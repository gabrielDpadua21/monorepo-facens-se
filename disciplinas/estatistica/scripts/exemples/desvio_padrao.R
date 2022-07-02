## Desvio padrao amostras e populacional

dados <-c(16, 10, 5, 7, 13)
media <-mean(dados)
desvio_padrao_am <- sd(dados)
desvio_padrão_pop<-sqrt(sum((dados -mean(dados))^2)/(length(dados)))


media
desvio_padrao_am
desvio_padrão_pop

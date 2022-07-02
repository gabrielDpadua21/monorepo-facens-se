## Regressao linear - introducao

## Equacao Y = B0 + B1x

## Exemplo = -307,68 + 30 * Temp -> previsao do valor de vendas em determinada temperatura
library(ggplot2) 
library(tidyr) 

Temperatura <- c(19.2,21.2,16.9,20.2,23.5,27.1,24.4,30.1,28.4,23.1,27.6,22.2) 
Vendas <- c(215,325,185,332,406,522,412,614,544,421,445,408)

plot(Temperatura, Vendas)

abline(lm(Vendas~Temperatura), col = "red" )

lm(Vendas~Temperatura)

dados <- data.frame(Temperatura, Vendas)

ggplot(dados) +
  aes(Temperatura, Vendas) +
  geom_point() +
  geom_smooth(method = lm, se = T)
  labs(title = "Temperatura x Vendas", x = "Temperatura", y = "Vendas")


regression_tannin

plot(regression_tannin$tannin, regression_tannin$growth)
abline(lm(regression_tannin$growth~regression_tannin$tannin), col = "blue")

dados1 <- data.frame(regression_tannin$growth, regression_tannin$tannin)

ggplot(dados1) +
  aes(regression_tannin$growth, regression_tannin$tannin) +
  geom_point() +
  geom_smooth(method = lm, se = T)
  labs(title = "Growth x Tannin")






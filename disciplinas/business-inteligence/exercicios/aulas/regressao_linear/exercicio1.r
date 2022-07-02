install.packages("ISLR")

library(ISLR)

Auto

plot(mpg ~ horsepower, Auto)

modelo <- lm(mpg ~ horsepower, Auto)

# mpg = 39.935861 - 0.157845 * horsepower

# Como p valor da regressão é 2.2e-16 e MENOR que 0.05 (5%) então dizemos que a regressão e diferente de 0, portanto existe e é significativa
# p-value < 2.2e-16

# Poder de explicação? quanto que o horsepower explica mpg?
# (Multiple) R-squared (R Quadrado) - Quanto mais proximo de 1 melhor a explicação
# R^2 = 0.6059

summary(modelo)

plot(mpg ~ log(horsepower), Auto)

modelo <- lm(mpg ~ log(horsepower), Auto)
summary(modelo)

plot(log(mpg) ~ log(horsepower), Auto)

modelo <- lm(log(mpg) ~ log(horsepower), Auto)
summary(modelo)

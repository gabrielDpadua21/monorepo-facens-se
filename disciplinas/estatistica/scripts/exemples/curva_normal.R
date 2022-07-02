## CALCULA DA DISTRIBUICAO NORMAL

# Maior

(1 - pnorm(230, 200, 40)) * 100

# Menor

pnorm(150, 200, 40) * 100

#Diferenca

(pnorm(250, 200, 40) - pnorm(200, 200, 40)) * 100


## Grafico da curva normal

data <- rnorm(10, 50, 7)

sort(data)
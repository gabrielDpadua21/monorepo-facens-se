library(ggplot2)

nome <- c("Joao", "Felipe", "Caio", "Ana", "Carla", "Gilberto", "Gaby", "Joana", "Milena", "Fred")

idade <- c(40, 22, 17, 26, 40, 28, 20, 26, 24, 29)

altura <- c(185, 190, 177, 170, 165, 178, 158, 160, 159, 192)

peso <- c(90, 95, 87, 70, 65, 80, 60, 62, 64, 102)

sexo <- c("M", "M", "M", "F", "F", "M", "F", "F", "F", "M")

dados <- data.frame(Nome = nome, Idade = idade, Altura = altura, Peso = peso, Sexo = sexo)

dados


# Histograma para idade

hist(dados$Idade)


# Bloxplot altura

ggplot(dados) +
  aes(x = Altura) +
  geom_boxplot()


# Boxplot peso separado por sexo

ggplot(dados) +
  aes(x = Peso, y = Sexo) +
  geom_boxplot()


# Grafico de setores (pizza) por sexo

pie(table(dados$Sexo))

# Grafico de dispersao comparando as variaveis Altura x Peso

plot(
  dados$Peso,
  dados$Altura
)

# Media e mediana das idades 

mean(dados$Idade)

median(dados$Idade)





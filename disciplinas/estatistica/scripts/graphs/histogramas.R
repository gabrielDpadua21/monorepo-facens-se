library("MASS")

Horsepower.Sum <- Cars93$Horsepower

mean(Horsepower.Sum)

Horsepower.USA <- Cars93$Horsepower[Cars93$Origin == "USA"]
mean(Horsepower.USA)

Horsepower.NoUsa <- Cars93$Horsepower[Cars93$Origin != "USA"]
mean(Horsepower.NoUsa)

titulo <- "Histograma de medias"
grafico = c(Horsepower.Sum, Horsepower.USA, Horsepower.NoUsa)

hist(grafico, main = titulo, border = "darkblue", col = "lightblue")
library("MASS")

plot(
  Cars93$Horsepower, 
  Cars93$MPG.city,
  pch = as.character(Cars93$Cylinders)
)
abline(lm(Cars93$MPG.city~Cars93$Horsepower), col="red") # Linha de regressao
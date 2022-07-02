# HISTOGRAMAS

library("MASS")
library("ggplot2")

hist(
  Cars93$Price, 
  main = "Carros de 93",
  xlab = "Preco x(1000$)",
  border = "red", 
  col = "darkred",
  breaks = 10,
  xlim = c(0, 70)
)

ggplot(Cars93, aes(x=Price)) + 
  geom_histogram(binwidth = 5, color="black", fill="gray")+
  labs(x = "Preco x(1000$)", y="Frequencia", title="Preco de 93 modelos de carros em 93")

ggplot(Cars93, aes(x=Horsepower)) + 
  geom_histogram(color="black", fill="gray", binwidth = 10)+
  facet_wrap(~Origin)

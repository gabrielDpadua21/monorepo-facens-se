library(ggplot2)

ggplot(Medicoes_CurvaNormal) +
  aes(x = Medicoes) +
  geom_boxplot()
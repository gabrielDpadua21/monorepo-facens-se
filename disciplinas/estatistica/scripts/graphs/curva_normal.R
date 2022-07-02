library(ggplot2)

ggplot(Medicoes_CurvaNormal) +
  aes(x = Medicoes) +
  geom_histogram(
    fill = "#FF2266", 
    alpha = 0.6, 
    col = 'red',
    bins = 15,
    aes(y = ..density..)
  )+
stat_function(fun = dnorm, args = list(mean(Medicoes_CurvaNormal$Medicoes), sd=sd(Medicoes_CurvaNormal$Medicoes)))

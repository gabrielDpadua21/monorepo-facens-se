library("MASS") 

barplot(
  table(Cars93$Type), 
  ylim=c(0,25), 
  xlab="Tipos de veículos", 
  ylab="Frequência", 
  axis.lty = "solid", 
  space = .05, 
  col = "orange", 
  main = "Gráfico de barras") 
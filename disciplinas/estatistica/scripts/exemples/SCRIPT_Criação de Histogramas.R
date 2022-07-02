#CRIA??O DE HISTOGRAMAS:
#----------------------------

#Determinar a qtd e a escala do eixo X
#? necess?rio carregar as vari?veis antes de plotar o gr?fico
Titulo <- "Histograma da atividade Khan Academy"
Variavel <- c(28,33,37,14,55,61,77,15)
Eixo_X <- c(0,20,40,60,80)

#Plotar o gr?fico:
hist(Variavel, breaks = Eixo_X, main = Titulo, border = "darkgreen", col = "lightgreen")

#Para estudar as demais possibilidades de customiza??o utilize o comando abaixo:
hist

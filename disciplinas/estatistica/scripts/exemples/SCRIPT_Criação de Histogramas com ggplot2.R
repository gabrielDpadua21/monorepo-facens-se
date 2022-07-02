library("MASS")
library("ggplot2")

ggplot(Cars93, aes(x=Price)) +
geom_histogram()

ggplot(Cars93, aes(x=Price)) +
geom_histogram(binwidth=5,color="black",fill="white") +
labs(x = "Preçox ( $1000)", y="Frequência", title= "Peço de 93 modelos de carros em 1993")

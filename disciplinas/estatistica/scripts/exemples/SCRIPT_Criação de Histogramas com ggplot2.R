library("MASS")
library("ggplot2")

ggplot(Cars93, aes(x=Price)) +
geom_histogram()

ggplot(Cars93, aes(x=Price)) +
geom_histogram(binwidth=5,color="black",fill="white") +
labs(x = "Pre�ox ( $1000)", y="Frequ�ncia", title= "Pe�o de 93 modelos de carros em 1993")

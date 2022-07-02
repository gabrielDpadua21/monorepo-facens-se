# MEDIA
altura <- c(1.50, 1.62, 1.72, 1.80, 1.85)
mean(altura)


#MEDIANA
valores <- c(12.7, 3.4, 4.2, 18.2, 54, -21, 8, -5)
median.result = median(valores)

median.result

valores2 <- c(15, 15, 27, 32, 32, 44)
median(valores2)

#MODA
getmode <- function(v) {
  uniqv <- unique(v)
  uniqv[which.max(tabulate(match(v, uniqv)))]
}

v <- c(2, 1, 2, 3, 1, 2, 3, 4, 1, 5, 5, 3, 2, 3)

getmode(v)




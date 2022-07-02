##install.package("ISLR")

library(ISLR)

names(Carseats)

plot(Sales ~ Price, Carseats)

plot(Sales ~ US, Carseats)

plot(Sales ~ Urban, Carseats)

modelo <- lm(Sales ~ Price + Urban + US, Carseats)
summary(modelo)

modelo <- lm(Sales ~ Price + US, Carseats)
summary(modelo)



    ##install.packages("ISLR")

library(ISLR)

names(Auto)

plot(mpg ~ cylinders, Auto)

plot(mpg ~ displacement, Auto)

plot(mpg ~ horsepower, Auto)

plot(mpg ~ weight, Auto)

plot(mpg ~ acceleration, Auto)

plot(mpg ~ year, Auto)

plot(mpg ~ origin, Auto)

plot(mpg ~ name, Auto)

cor(Auto[,-9])

modelo <- lm(mpg ~ cylinders + displacement + horsepower + weight + acceleration + year + origin + origin, Auto)
summary(modelo)

modelo <- lm(mpg ~ ., Auto[,-9])
summary(modelo)



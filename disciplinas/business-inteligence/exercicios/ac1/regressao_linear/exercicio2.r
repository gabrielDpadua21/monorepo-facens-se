library(MASS)

names(Boston)

modelo <- lm(crim ~ zn, Boston)
summary(modelo)

plot(crim ~ zn, Boston)

modelo <- lm(crim ~ indus, Boston)
summary(modelo)

plot(crim ~ indus, Boston)

modelo <- lm(crim ~ chas, Boston)
summary(modelo)

plot(crim ~ chas, Boston)

modelo <- lm(crim ~ nox, Boston)
summary(modelo)

plot(crim ~ nox, Boston)

modelo <- lm(crim ~ rm, Boston)
summary(modelo)

plot(crim ~ rm, Boston)

modelo <- lm(crim ~ age, Boston)
summary(modelo)

plot(crim ~ age, Boston)

modelo <- lm(crim ~ dis, Boston)
summary(modelo)

plot(crim ~ dis, Boston)

modelo <- lm(crim ~ rad, Boston)
summary(modelo)

plot(crim ~ rad, Boston)

modelo <- lm(crim ~ tax, Boston)
summary(modelo)

plot(crim ~ tax, Boston)

modelo <- lm(crim ~ ptratio, Boston)
summary(modelo)

plot(crim ~ ptratio, Boston)

modelo <- lm(crim ~ black, Boston)
summary(modelo)

plot(crim ~ black, Boston)

modelo <- lm(crim ~ lstat, Boston)
summary(modelo)

plot(crim ~ lstat, Boston)

modelo <- lm(crim ~ medv, Boston)
summary(modelo)

plot(crim ~ medv, Boston)

modelo = lm(crim ~ ., Boston[,-14])
summary(modelo)

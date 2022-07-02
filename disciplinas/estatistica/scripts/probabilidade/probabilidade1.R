library("MASS")

tabela <- Cars93

edit(tabela)

nrow(tabela)

maior200 = sum(tabela$Horsepower>200)

p200 <- maior200 / nrow(tabela)

#--------------

vDodge <- sum(tabela$Manufacturer=="Dodge")

pDodge <- vDodge / nrow(tabela)


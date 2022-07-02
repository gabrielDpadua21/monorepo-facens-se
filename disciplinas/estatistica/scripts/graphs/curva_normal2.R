
hist(Medicoes_CurvaNormal$Medicoes, col = "#ff2266", probability = T)

mean(Medicoes_CurvaNormal$Medicoes)

lines(density(Medicoes_CurvaNormal$Medicoes), lwd = 2)

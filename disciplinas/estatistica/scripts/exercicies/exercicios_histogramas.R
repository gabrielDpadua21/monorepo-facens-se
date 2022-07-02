library("ggplot2")

Tabela_1$`N de Filhos`[which(is.na(Tabela_1$`N de Filhos`))] <- 0.0

ggplot(Tabela_1, aes(x=`N de Filhos`))+
  geom_histogram(binwidth = 5, color="white", fill="gray")+
  labs(x = "Numero de filhos", y="Frequencia", title="Numero de filhos dos funcionarios")

ggplot(Tabela_1, aes(x=salario))+
  geom_histogram(binwidth = 5, color="white", fill="gray")+
  labs(x = "Salario", y="Frequencia", title="Salario dos funcionarios")

ggplot(Tabela_1, aes(x=Anos))+
  geom_histogram(binwidth = 5, color="white", fill="gray")+
  labs(x = "Idade (anos)", y="Frequencia", title="Idade dos funcionarios")
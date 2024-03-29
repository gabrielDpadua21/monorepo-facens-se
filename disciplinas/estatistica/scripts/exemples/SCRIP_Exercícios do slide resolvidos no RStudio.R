#
# DISTRIBUI��O POISSON
#

# dpois(x,lambda)
# x = N�mero de ocorr�ncias;
# Lambda = � a m�dia de ocorr�ncias num certo intervalo

# EXEMPLO 1:

# Levantamentos feitos em grandes obras da constru��o civil apontam uma m�dia 
# de 6 acidentes leves a cada per�odo de 6 dias. 

# Determinar a probabilidade de que ocorrer�o: 
  
# a) Exatamente 5 acidentes leves durante um per�odo qualquer de 6 dias, 
# aleatoriamente escolhidos.

# dpois(x,lambda)
dpois(5,6)*100

# b) Exatamente 3 acidentes em um dia qualquer, aleatoriamente escolhido. 
# Como a m�dia � de 6 acidentes a cada 6 dias, ent�o, para um dia qualquer, 
# a m�dia � de 1 acidente. 

# dpois(x,lambda)
dpois(3,1)*100

# EXEMPLO 2: 
# Uma pizzaria recebe, em m�dia, 8 pedidos por hora. Qual a probabilidade 
# de que sejam recebidos: 

# a) exatamente 5 pedidos em uma hora? 

# dpois(x,lambda)
dpois(5,8)*100


# b) 2 ou mais pedidos em uma hora? 
1-sum(dpois(0:1,8))

# c) 10 pedidos em 2 horas? 
dpois(10,16)*100

#
# DISTRIBUI��O HIPERGEOM�TRICA
#

#dhyper(X,N1,N2,n)

# X  = N�mero de sucesso pretendido em ???? escolhas;
# N1 = N�mero de elementos da popula��o rotulados de sucesso;
# N2 = N�mero de elementos da popula��o rotulados de fracasso;
# n  = N�mero total de escolhas que ser�o realizadas; 

# EXEMPLO 1:

# Sabe-se que em determinada caixa com 10 l�mpadas, 2 s�o defeituosas.
# Se um engenheiro eletricista extrair uma amostra de 4 l�mpadas dessa 
# caixa, sem reposi��o, calcular a probabilidade de ele obter: 

# a) 1 l�mpada defeituosa:

# Resolu��o:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 3

#dhyper(X,N1,N2,n)
dhyper(3,8,2,4)*100

# b) Nenhuma l�mpada defeituosa. 

# Resolu��o:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 4

#dhyper(X,N1,N2,n)
dhyper(4,8,2,4)*100

# c) 1 ou menos l�mpada defeituosa.

# Resolu��o:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 4

#dhyper(X,N1,N2,n)
sum(dhyper(3:4,8,2,4))*100


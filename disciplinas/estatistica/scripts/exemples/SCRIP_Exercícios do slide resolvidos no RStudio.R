#
# DISTRIBUIÇÃO POISSON
#

# dpois(x,lambda)
# x = Número de ocorrências;
# Lambda = é a média de ocorrências num certo intervalo

# EXEMPLO 1:

# Levantamentos feitos em grandes obras da construção civil apontam uma média 
# de 6 acidentes leves a cada período de 6 dias. 

# Determinar a probabilidade de que ocorrerão: 
  
# a) Exatamente 5 acidentes leves durante um período qualquer de 6 dias, 
# aleatoriamente escolhidos.

# dpois(x,lambda)
dpois(5,6)*100

# b) Exatamente 3 acidentes em um dia qualquer, aleatoriamente escolhido. 
# Como a média é de 6 acidentes a cada 6 dias, então, para um dia qualquer, 
# a média é de 1 acidente. 

# dpois(x,lambda)
dpois(3,1)*100

# EXEMPLO 2: 
# Uma pizzaria recebe, em média, 8 pedidos por hora. Qual a probabilidade 
# de que sejam recebidos: 

# a) exatamente 5 pedidos em uma hora? 

# dpois(x,lambda)
dpois(5,8)*100


# b) 2 ou mais pedidos em uma hora? 
1-sum(dpois(0:1,8))

# c) 10 pedidos em 2 horas? 
dpois(10,16)*100

#
# DISTRIBUIÇÃO HIPERGEOMÉTRICA
#

#dhyper(X,N1,N2,n)

# X  = Número de sucesso pretendido em ???? escolhas;
# N1 = Número de elementos da população rotulados de sucesso;
# N2 = Número de elementos da população rotulados de fracasso;
# n  = Número total de escolhas que serão realizadas; 

# EXEMPLO 1:

# Sabe-se que em determinada caixa com 10 lâmpadas, 2 são defeituosas.
# Se um engenheiro eletricista extrair uma amostra de 4 lâmpadas dessa 
# caixa, sem reposição, calcular a probabilidade de ele obter: 

# a) 1 lâmpada defeituosa:

# Resolução:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 3

#dhyper(X,N1,N2,n)
dhyper(3,8,2,4)*100

# b) Nenhuma lâmpada defeituosa. 

# Resolução:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 4

#dhyper(X,N1,N2,n)
dhyper(4,8,2,4)*100

# c) 1 ou menos lâmpada defeituosa.

# Resolução:

# N1 = 8
# N2 = 2
# n  = 4
# X  = 4

#dhyper(X,N1,N2,n)
sum(dhyper(3:4,8,2,4))*100


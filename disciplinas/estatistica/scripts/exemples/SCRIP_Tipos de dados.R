#TIPOS DE DADOS NO R:
#-------------------

#DETERMINA O VALOR DA VARIÁVEL
variavel_A <- 8
#TESTA O TIPO DA VARIÁVEL
#OBSERVE QUE A VARIÁVEL SERÁ POR PADRÃO DO TIPO NUMÉRICO MESMO
#QUE NÃO SEJA UTILIZADO CASAS DECIMAIS
class(variavel_A)

#-------------------

#SE FOR NECESSÁRIO CRIAR UMA VARIÁVEL DO TIPO INTEIRO
#PRECISAMOS INCLUIR A LETRA L APÓS O NÚMERO
variavel_B = 10L
#OBSERVE QUE AGORA A VARIAVEL É DO TIPO INTEIRO
class(variavel_B)

#-------------------

#OBJETOS TRUE OR FALSE:

variavel_C <- TRUE
variavel_D <- FALSE
variavel_E <- T
variavel_F <- F

#PODEMOS UTILIZAR TRUE OU T E FALSE OU F

#-------------------

#OBJETOS DO TIPO TEXTO:

#SÃO ACEITOS: "" E ''
variavel_G <- "Texto"
variavel_H <- 'Texto'
#TIPOS DE DADOS NO R:
#-------------------

#DETERMINA O VALOR DA VARI�VEL
variavel_A <- 8
#TESTA O TIPO DA VARI�VEL
#OBSERVE QUE A VARI�VEL SER� POR PADR�O DO TIPO NUM�RICO MESMO
#QUE N�O SEJA UTILIZADO CASAS DECIMAIS
class(variavel_A)

#-------------------

#SE FOR NECESS�RIO CRIAR UMA VARI�VEL DO TIPO INTEIRO
#PRECISAMOS INCLUIR A LETRA L AP�S O N�MERO
variavel_B = 10L
#OBSERVE QUE AGORA A VARIAVEL � DO TIPO INTEIRO
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

#S�O ACEITOS: "" E ''
variavel_G <- "Texto"
variavel_H <- 'Texto'
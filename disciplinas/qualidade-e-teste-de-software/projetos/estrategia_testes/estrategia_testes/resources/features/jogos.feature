# language: pt

 Funcionalidade: Avaliando os resultados de um Jogo

Cenario: Avaliando um resultado valido para o jogo

Dado um resultado valido
Quando o jogo esta acontecendo
E o resultado eh anotado
Então o resultado deve ser aceito

Cenario: Avaliando um resultado invalido para o jogo

Dado um resultado invalido
Quando o jogo esta acontecendo
E o resultado eh anotado
Entao o resultado nao deve ser aceito

Cenario: Avaliando varios resultados de um jogo

 Dado um jogo acontencendo
 Quando existe dois resultados
 E de participantes diferentes
 Entao o jogo eh considerado valido

 Cenario: Avaliando resultados de um participante

  Dado um jogo acontencendo
  Quando um participante
  E anotar dois ou mais resultados deste participante
  Entao o segundo resultado deve ser ignorado
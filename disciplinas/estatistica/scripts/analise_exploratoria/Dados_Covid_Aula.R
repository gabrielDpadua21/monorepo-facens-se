#Modificar o diret�rio de trabalho
setwd("C:\\Users\\Pichau\\Desktop\\Facens\\2021.01\\04_Disciplinas\\Estat�stica\\09_Vari�vel aleat�ria Discreta")

#Criar um data frame com os dados do arquivo CSV
dat <- read.csv("HIST_PAINEL_COVIDBR_08abr2021.csv", sep = ";")
dat

head(dat)
tail(dat)
dim(dat)
#edit(dat)

#Instalar a biblioteca (caso voc� ainda n�o tenha)
#install.packages("dplyr")
#install.packages("lubridate")
#install.packages("plotly")
library(dplyr)
library(lubridate)
library(ggplot2)
library(plotly)
library(gridExtra)

#Verificar a classe dos valores na coluna "data"
class(dat$data)
#Inicialmente estes dados est�o no formato "Character" (como texto)

#Transformar os dados da coluna "data" para o formato Date
dat$data <- as.Date(dat$data, format= "%Y-%m-%d")
class(dat$data)

#Aplicar um filtro
#Vamos filtrar para a cidade de Belo Horizonte

p1 <- dat %>% filter(municipio == "Belo Horizonte") %>% select(data,obitosNovos,casosNovos)
p1

ggplot(p1) +
  aes(data,obitosNovos) +
  geom_col() +
  labs(x = "Data", y="Obitos novos", title = "Gr�fico de BH")


#Aplicar um filtro
#Vamos filtrar para a cidade de Belo Horizonte entre 01/01/21 a 01/02/21

p2 <- dat %>% filter(municipio == "Belo Horizonte", data >= as.Date("2021-01-01"), 
                     data <=as.Date("2021-02-01") ) %>%
  select(data,obitosNovos)

p2

ggplot(p2) + 
  aes(data,obitosNovos) + 
  geom_col()

#Deixar o nosso gr�fico interativo

p2_1 <- ggplot(p2) + 
  aes(data,obitosNovos) + 
  geom_col()

ggplotly(p2_1)

#Plotar mais de um gr�fico na mesma imagem

#1� Criar os gr�ficos dentro de uma vari�vel

k1 <- ggplot(p1) +
  aes(data,obitosNovos) +
  geom_col() +
  labs(x = "", y="Obitos novos", title = "Gr�fico de BH Total")

k2<- ggplot(p2) +
  aes(data,obitosNovos) +
  geom_col() +
  labs(x = "", y="Obitos novos", title = "Gr�fico de BH em Janeiro")

k1
k2

#Plotar
grid.arrange(k1, k2, ncol=2, nrow=1)
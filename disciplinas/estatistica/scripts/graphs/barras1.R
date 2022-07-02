library("MASS")
library(ggplot2)

ggplot(Cars93) +
  aes(x = Type) + 
  geom_bar()

ggplot(gender_submission) +
  aes(x = Survived) +
  geom_bar()
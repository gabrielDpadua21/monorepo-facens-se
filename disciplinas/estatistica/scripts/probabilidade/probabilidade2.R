

gender1 = sum(gender_submission$Survived==1)

gender0 = sum(gender_submission$Survived==0)

totalGender1 = gender1 / nrow(gender_submission)

totalGender0 = gender0 / nrow(gender_submission)


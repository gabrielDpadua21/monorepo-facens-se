const cv = require('./cv');

cv.methods(['get', 'post', 'put', 'delete']);
cv.updateOptions({new: true, runValidators: true});
const mongoose = require('mongoose');
mongoose.Promise = global.Promise;

module.exports = mongoose.connect('mongodb://adminmycv:Toor1234@localhost/admin', 
{ useNewUrlParser: true });


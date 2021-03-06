const bodyParser = require('body-parser');
const express = require('express');

const port = 3003;
const server = express();

server.use(bodyParser.urlencoded({ extended: true }));
server.use(bodyParser.json());

server.listen(port, () => {
    console.log(`server is running in port ${port}`);
});

module.exports = server;
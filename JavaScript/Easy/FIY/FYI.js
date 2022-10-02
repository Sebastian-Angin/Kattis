

const fs = require("fs");

fs.readFile("a001.in", (err, data) => {
    if(err) throw err;
    console.log(data.toString());
})



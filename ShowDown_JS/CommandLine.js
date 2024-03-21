const readline = require('readline');

function CommandLine(question) {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
}

module.exports = CommandLine;
const readline = require('readline');
const Player = require('./Player');

class HumanPlayer extends Player{
    constructor(){
        super();
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    nameHimself(){
        this.rl.question(`Enter name for Human Player: `, (name) => {
            this.name = name;
            this.rl.close();
            callback();
        });
    }
}
module.exports = HumanPlayer; 
const readline = require('readline');
const { HumanPlayer, AIPlayer } = require('./Player');

class Game {
    constructor() {
        this.players = [];
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    start() {
        this.rl.question('How many human players? (0-4) ', (numOfHuman) => {
            this.addHumanPlayer(parseInt(numOfHuman));
        });
    }

    addHumanPlayer(numOfHuman) {
        if (numOfHuman) {
            this.rl.question(`Enter name for Human Player ${this.players.length + 1}: `, (name) => {
                const humanPlayer = new HumanPlayer(name);
                humanPlayer.nameHimself();
                this.players.push(humanPlayer);
                this.addHumanPlayer(numOfHuman - 1);
            });
        } else {
            this.addAIPlayers(4 - this.players.length);
        }
    }

    addAIPlayers(numOfAI) {
        for (let i = 0; i < numOfAI; i++) {
            const aiPlayer = new AIPlayer(`AI Player ${i + 1}`);
            this.players.push(aiPlayer);
        }
        this.rl.close();
        this.startGame();
    }

    startGame() {
        console.log("Game starting with players:");
        this.players.forEach((player) => {
            console.log(player.name);
        });
        //more logic here
    }
}

module.exports = Game;

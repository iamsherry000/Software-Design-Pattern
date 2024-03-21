const { HumanPlayer, AIPlayer } = require('./Player');

class Game{
    constructor(){
        this.players = [];
    }

    initial(){
        const playerTotalNum = 4, numOfHuman = 1;
        const numOfAI = playerTotalNum - numOfHuman;
        this.addPlayers(numOfHuman, numOfAI);
        this.start();       
    }

    addPlayers(numOfHuman, numOfAI){
        console.log("line#16");
        // for(let i = 0 ; i < numOfHuman; i++){
        //     console.log("line#18");
        //     //const humanPlayer = new HumanPlayer();
        //     humanPlayer.nameHimself();
        //     this.players.push(humanPlayer);
        //     console.log("human player: " + humanPlayer)
        // }
        for (let i = 0; i < numOfAI; i++) {
            const aiPlayer = new AIPlayer();
            aiPlayer.nameHimself();
            this.players.push(aiPlayer);
        }
    }

    start(){
        console.log("Game starting with players:");
        this.players.forEach((player, index) => {
            const playerName = player instanceof HumanPlayer ? `Human Player ${index + 1}` : `AI Player ${index + 1}`;
            console.log(playerName);
        });
    }

}

module.exports = Game;
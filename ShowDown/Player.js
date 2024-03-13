class Player{
    constructor(name){
        this.name = name;
    }

    static async NameHimself(playerNumber) {
        const players = [];
        for (let i = 0; i < playerNumber; i++) {
            const playerName = CommandLine(`Enter name for Player ${i+1}:`);
            const player = new HumanPlayer(playerName);
            players.push(player);
            console.log(`P${i+1}'s name is ${playerName}`);
        }
        return players;
    }
}

class HumanPlayer extends Player{
    constructor(name) {
        super(name);
    }
}

class AIPlayer extends Player{
    constructor(name) {
        super(name);
    }
}

module.exports = { Player, HumanPlayer, AIPlayer };
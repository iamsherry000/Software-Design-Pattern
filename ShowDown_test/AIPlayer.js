const Player = require('./Player');

class AIPlayer extends Player {
    constructor(name) {
        super(name || `AI Player ${AIPlayer.playerCount}`);
        AIPlayer.playerCount++;
    }

    nameHimself() {
        const names = ['Alice', 'Bob', 'Charlie', 'David', 'Eve'];
        const randomIndex = Math.floor(Math.random() * names.length);
        return names[randomIndex];
    }
}

module.exports = AIPlayer;
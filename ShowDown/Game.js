class Game {
    constructor(players) {
        this.players = [];
    }
  
    /*
    start() {
      console.log("Game starts!");
      this.players.forEach(player => {
        player.nameHimself();
      });
    }
    */

    start(numHumanPlayers) {
        console.log("Game starts!");
    
        // Create HumanPlayers based on user input
        for (let i = 0; i < numHumanPlayers; i++) {
          const playerName = "Player" + (i + 1);
          const humanPlayer = new HumanPlayer(playerName);
          this.players.push(humanPlayer);
        }
    
        // Create AIPlayers to fill the rest of the slots
        const numAIPlayers = 4 - numHumanPlayers;
        for (let i = 0; i < numAIPlayers; i++) {
          const playerName = "AIPlayer" + (i + 1);
          const aiPlayer = new AIPlayer(playerName);
          this.players.push(aiPlayer);
        }
    
        // Output the players
        console.log("Players:");
        this.players.forEach(player => {
          console.log(player.name);
        });
    }
    
}
  
  module.exports = Game;
  
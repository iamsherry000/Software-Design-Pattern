const Game = require('./Game');
const { HumanPlayer, AIPlayer } = require('./Player');

/* Use command line to decided how many humanPlayer
// Create players
const humanPlayer1 = new HumanPlayer("Player1");
const aiPlayer1 = new AIPlayer("Player2");
const humanPlayer2 = new HumanPlayer("Player3");
const aiPlayer2 = new AIPlayer("Player4");
*/

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Initialize game
//const game = new Game([humanPlayer1, aiPlayer1, humanPlayer2, aiPlayer2]);
//const game = new Game();

// Start game
//game.start();

// Start game with user input for number of human players
rl.question('How many human players? (0-4) ', (answer) => {
    console.log(`input: ${answer}`);
    rl.close();
});

const game = new Game();

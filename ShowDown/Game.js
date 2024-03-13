const Deck = require('./Deck');
const Player = require('./Player');

class Game{
    constructor(){
        this.deck = new Deck();
        this.rounds = 13;
    }

    start(){
        const playerNumber = 4;
        const players = Player.NameHimself(playerNumber);
        console.log(players); // 檢查是否成功取得玩家資訊
    }

}

module.exports = Game;
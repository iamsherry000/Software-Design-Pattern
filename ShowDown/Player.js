class Player {
    constructor(name) {
      this.name = name;
    }
  
    nameHimself() {
      console.log("Player " + this.name + " names himself.");
    }
  }
  
  class HumanPlayer extends Player {
    constructor(name) {
      super(name);
    }
  }
  
  class AIPlayer extends Player {
    constructor(name) {
      super(name);
    }
  }
  
  module.exports = {
    Player,
    HumanPlayer,
    AIPlayer
  };
  
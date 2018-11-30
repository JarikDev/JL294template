package com;

public class Main2 {
    public static void main(String[] args) {
        Dota dota=new Dota();
        dota.run();
    }
}

abstract class Game {
    abstract void startGame();
    abstract void playGame();
    abstract void endGame();
    void run() {
        startGame();
        playGame();
        endGame();
    }
}
class Dota extends Game{

    @Override
    void startGame() {
        System.out.println("Get card");
    }

    @Override
    void playGame() {
        System.out.println("play");
    }

    @Override
    void endGame() {
        System.out.println("Loose money");
    }
}




























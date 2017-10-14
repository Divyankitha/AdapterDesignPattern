package com.SJSU.Adapter;

public class AdapterDemo
{
    public static void main(String[] args)
    {
        GamePlayer gamePlayer = new GamePlayer();
        System.out.println("Only the object of the class Game player has been created");
        System.out.println("We are using the same object to play different types of games");
        gamePlayer.play("Normal", "ABC(Traditional game)");
        gamePlayer.play("Voice", "XYZ(Voice Recognition based game)");
        gamePlayer.play("Gesture", "PQR(Gesture Recognition based game)");

    }
}



package com.SJSU.Adapter;

public class GestureGame implements HighEndGamePlayer {
    @Override
    public void SenseAndPlay(String GName) {
        System.out.println("Name of the game: "+GName+" ,Playing the game using Gesture recognition");
    }
}

package com.SJSU.Adapter;

public class GamePlayer implements NormalGamePlayer
{
    GameAdapter gameAdapter;
    @Override
    public void play(String TypeRecognition, String GameName)
    {
        if(TypeRecognition.equals("Normal"))
        {
            System.out.println("Name of the game: "+GameName+" ,Playing game without voice recognition or gesture recognition");
        }
        else if(TypeRecognition.equals("Gesture") || TypeRecognition.equals("Voice"))
        {
            gameAdapter = new GameAdapter(TypeRecognition);
            gameAdapter.play(TypeRecognition,GameName);
        }
        else
        {
            System.out.println("Invalid game type");
        }

    }
}


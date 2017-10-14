package com.SJSU.Adapter;

public class GameAdapter implements NormalGamePlayer
{
    HighEndGamePlayer highEndGamePlayer;

    public GameAdapter(String RecognitionType)
    {
        if(RecognitionType.equals("Gesture")) {
            highEndGamePlayer = new GestureGame();
        }
        else if (RecognitionType.equals("Voice")) {
            highEndGamePlayer = new VoiceGame();
        }
    }

    public void play(String RecognitionType, String GameName)
    {
        if(RecognitionType.equals("Gesture"))
        {
            highEndGamePlayer.SenseAndPlay(GameName);
        }
        else if (RecognitionType.equals("Voice"))
        {
            highEndGamePlayer.SenseAndPlay(GameName);
        }
    }

}


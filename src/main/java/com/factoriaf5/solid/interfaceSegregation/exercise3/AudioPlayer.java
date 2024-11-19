package com.factoriaf5.solid.interfaceSegregation.exercise3;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void playAudio() {
        // Play audio
    }

    @Override
    public void playVideo() {
        throw new UnsupportedOperationException("AudioPlayer can't play videos");
    }
}

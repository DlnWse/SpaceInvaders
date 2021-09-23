package fr.dylan.spaceinvaders.utils;


import javafx.scene.media.AudioClip;

public class Audio {

    private final AudioClip audioClip;

    public Audio(String soundPath) {
        this.audioClip = new AudioClip(soundPath);
        this.audioClip.setVolume(0.01);
    }

    private void play() {
        this.audioClip.play();
    }

    public static void playSound(String soundPath) {
        Audio audio = new Audio(soundPath);
        audio.play();
    }
}

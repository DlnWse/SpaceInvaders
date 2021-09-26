package fr.dylan.spaceinvaders.utils;

import javafx.animation.AnimationTimer;


public abstract class FixedFrameRateTimer extends AnimationTimer {

    private final long timeNeededBetweenTicks;
    private final long NANOS_IN_A_SECOND = 1_000_000_000L;
    private long nanoLastTickStamp;
    private double frameRate;
    private float frameCount = 0;
    private long timeCounter = 0;
    private long last = System.nanoTime();

    public FixedFrameRateTimer(double FPSWanted) {
        this.timeNeededBetweenTicks = (long) (NANOS_IN_A_SECOND / FPSWanted);
    }

    public double getFrameRate() {return frameRate;}

    @Override
    public void handle(long now) {
        long deltaTime = now - last;
        last = now;
        timeCounter += deltaTime;
        long nanoTimeSinceLastTick = now - nanoLastTickStamp;
        if (nanoTimeSinceLastTick > timeNeededBetweenTicks) {
            nanoLastTickStamp = now;
            frameCount++;
            loop();
        }
        if (timeCounter > NANOS_IN_A_SECOND) {
            frameRate = frameCount;
            frameCount = 0;
            timeCounter %= NANOS_IN_A_SECOND;
        }
    }

    public abstract void loop();
}


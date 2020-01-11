package com.company.structural.bridge.device;

/**
 * Created by omerfarukcoban on 6.12.2019.
 */
public class Radio implements Device {

    private boolean on = false;
    private int volume = 0;
    private int channel = 1;

    @Override
    public boolean isOpen() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String getStatus() {
        return "Radio{" +
                "on=" + on +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}

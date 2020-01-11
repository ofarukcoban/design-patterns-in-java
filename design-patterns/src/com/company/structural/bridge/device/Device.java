package com.company.structural.bridge.device;

/**
 * Created by omerfarukcoban on 6.12.2019.
 */
public interface Device {

    boolean isOpen();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    String getStatus();
}

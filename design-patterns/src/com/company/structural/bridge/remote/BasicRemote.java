package com.company.structural.bridge.remote;

import com.company.structural.bridge.device.Device;

/**
 * Created by omerfarukcoban on 6.12.2019.
 */
public class BasicRemote implements Remote {

    private Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if(device.isOpen()){
            device.disable();
        }else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        if(device.getVolume() == 0)
            return;
        device.setVolume(device.getVolume()-1);
    }

    @Override
    public void volumeUp() {
        if(device.getVolume() == 30)
            return;
        device.setVolume(device.getVolume()+1);
    }

    @Override
    public void channelDown() {
        if(device.getChannel() == 0)
            return;
        device.setChannel(device.getChannel()-1);
    }

    @Override
    public void channelUp() {
        if(device.getChannel() == 20)
            return;
        device.setChannel(device.getChannel()+1);
    }
}

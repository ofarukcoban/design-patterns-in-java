package com.company.structural.bridge;

import com.company.structural.bridge.device.Radio;
import com.company.structural.bridge.remote.BasicRemote;

/**
 * Created by omerfarukcoban on 6.12.2019.
 */
public class Demo {

    public static void main(String[] args) {

        Radio device = new Radio();
        BasicRemote remote = new BasicRemote(device);

        remote.power();
        remote.volumeUp();
        remote.channelDown();

        System.out.println(device.getStatus());
    }
}

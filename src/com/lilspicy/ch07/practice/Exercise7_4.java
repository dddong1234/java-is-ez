package com.lilspicy.ch07.practice;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevchannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int channel) {
        prevchannel = this.channel;
        this.channel = channel;
    }

    int getChannel() {
        return channel;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }

    int getVolume() {
        return volume;
    }

    void gotoPrevChannel() {
        setChannel(prevchannel);

    }
}

public class Exercise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VL:" + t.getVolume());

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

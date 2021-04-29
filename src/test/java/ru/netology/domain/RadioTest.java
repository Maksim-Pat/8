package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(0,10,0,100);

    @Test
    public void shouldSetCurrentStation(){
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    public void shouldSetUnderLimitStation(){
        int underLimitStation = radio.getMaxChanel()+1;
        radio.setStation(underLimitStation);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldSetOverLimitStation(){
        int overLimitStation = radio.getMinChanel() - 1;
        radio.setStation(overLimitStation);
        assertEquals(0, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelUp() {
        radio.setStation(7);
        radio.switchArrowsUp();
        assertEquals(8, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelFromMaxToMin() {
        int expected = radio.getMinChanel();
        int maxChanel = radio.getMaxChanel();
        radio.setStation(maxChanel);
        radio.switchArrowsUp();
        assertEquals(expected, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelDown() {
        radio.setStation(8);
        radio.switchArrowsDown();
        assertEquals(7, radio.getStation());
    }

    @Test
    public void shouldSwitchChanelFromMinToMax() {
        int expected = radio.getMaxChanel();
        int minChanel = radio.getMinChanel();
        radio.setStation(minChanel);
        radio.switchArrowsDown();
        assertEquals(expected, radio.getStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        int expected = radio.getMaxVolume();
        int MaxVolume = radio.getMaxVolume();
        radio.setCurrentVolume(MaxVolume);
        radio.volumeUp();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(8);
        radio.volumeDown();
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {
        int expected = radio.getMinVolume();
        int minVolume = radio.getMinVolume();
        radio.setCurrentVolume(minVolume);
        radio.volumeDown();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderLimitVolume(){
        int underMaxVolume = radio.getMaxVolume()+1;
        radio.setCurrentVolume(underMaxVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverLimitVolume(){
        int overMinVolume = radio.getMinVolume() - 1;
        radio.setCurrentVolume(overMinVolume);
        assertEquals(0, radio.getCurrentVolume());
    }
}
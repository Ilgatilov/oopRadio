package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldTheStationByRemoteControl() {
        Radio radio = new Radio();
        assertEquals(3, radio.changeTheStationByRemoteControl(3));
    }

    @Test
    void shouldTheStationByRemoteControlIfNumberIsWrong() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.maxStation);
        radio.changeTheStationByRemoteControl(13);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonNextIfCurrentIsNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.maxStation);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonNext() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrevIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.prevRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTheStationByButtonPrev() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAboveMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
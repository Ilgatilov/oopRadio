package ru.netology.domain;

public class Radio {
    int minStation = 0;
    int maxStation = 9;
    private int currentRadioStation;
    int minVolume = 0;
    int maxVolume = 10;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int changeTheStationByRemoteControl(int presetStation) {
        if (presetStation <= maxStation && presetStation >= minStation) {
            currentRadioStation = presetStation;
        }
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else
            currentRadioStation = minStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else
            currentRadioStation = maxStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
}

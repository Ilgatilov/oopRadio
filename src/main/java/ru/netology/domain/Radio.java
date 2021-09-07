package ru.netology.domain;

public class Radio {
    private int currentRadioStation = 7;
    int minStation = 0;
    int maxStation = 9;
    private int currentVolume = 7;
    int minVolume = 0;
    int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int changeTheStationByRemoteControl(int presetStation) {
        if (presetStation >= minStation) {
            this.currentRadioStation = currentRadioStation;
        }
        if (presetStation <= maxStation) {
            this.currentRadioStation = presetStation;
        } else {
            this.currentRadioStation = currentRadioStation;
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

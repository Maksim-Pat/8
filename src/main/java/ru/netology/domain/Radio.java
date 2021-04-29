package ru.netology.domain;

public class Radio {
    private int minChanel;
    private int maxChanel;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;
    private int currentChanel;

    public Radio(int minChanel, int maxChanel, int minVolume, int maxVolume) {
        this.minChanel = minChanel;
        this.maxChanel = maxChanel;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public void setStation(int currentChanel) {
        if (currentChanel > maxChanel){
            return;
        }
        if (currentChanel < minChanel){
            return;
        }
        this.currentChanel = currentChanel;
    }

    public int getStation() {
        return currentChanel;
    }

    public int getMaxChanel() {
        return maxChanel;
    }
    public void setMaxChanel(int maxChanel) {
        this.maxChanel = maxChanel;
    }
    public int getMinChanel() {
        return minChanel;
    }
    public void setMinChanel(int minChanel) {
        this.minChanel = minChanel;
    }

    //Переключение вверх
    public void switchArrowsUp() {
        if (currentChanel == maxChanel) {
            currentChanel = minChanel;
            return;
        }
        this.currentChanel ++;
    }

    //Переключение вниз
    public void switchArrowsDown() {
        if (currentChanel == minChanel){
            currentChanel = maxChanel;
            return;
        }
        this.currentChanel --;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //Увеличить громкость
    public void volumeUp() {
        if (currentVolume == maxVolume){
            return;
        }
        this.currentVolume ++;
    }

    //Уменьшить громкость
    public void volumeDown() {
        if (currentVolume == minVolume){
            return;
        }
        this.currentVolume --;
    }
}
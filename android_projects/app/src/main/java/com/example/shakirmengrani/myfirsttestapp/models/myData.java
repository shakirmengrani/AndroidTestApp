package com.example.shakirmengrani.myfirsttestapp.models;

/**
 * Created by shakirmengrani on 3/8/2016.
 */
public class myData {
    private String title;
    private String desc;

    public myData(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + desc;
    }
}
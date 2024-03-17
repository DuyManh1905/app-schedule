package com.duymanh.myapplication.model;

public class Schedule {
    private String name;
    private String categoty;
    private String time;

    public Schedule(String name, String categoty, String time) {
        this.name = name;
        this.categoty = categoty;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

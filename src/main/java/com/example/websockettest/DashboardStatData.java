package com.example.websockettest;

public class DashboardStatData {
    boolean clicked;
    boolean ordered;

    public DashboardStatData(boolean clicked, boolean ordered) {
        this.clicked = clicked;
        this.ordered = ordered;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}

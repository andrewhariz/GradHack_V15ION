package com.example.v15ion_19;


import android.widget.LinearLayout;

public class ModelDashboard {

    private LinearLayout linearLayout;
    int id;

    public ModelDashboard(LinearLayout card, int id) {
        this.linearLayout = card;
        this.id = id;
    }

    public int getCard() {
        return id;
    }

    public void setCard(int card) {
        this.id = card;
    }
}

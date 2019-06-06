package com.example.ue_3;

import android.app.Activity;
import android.os.Bundle;


public class GraphView1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        float[] values = new float[] { "your values"};
        String[] verlabels = new String[] { "your values" };
        String[] horlabels = new String[] { "your values"
                GraphView graphView = new GraphView(this, values,"GraphView",horlabels, verlabels, GraphView.BAR);
        setContentView(graphView);
        }
}
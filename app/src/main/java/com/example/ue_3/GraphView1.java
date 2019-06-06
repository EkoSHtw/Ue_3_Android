package com.example.ue_3;

import android.app.Activity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;


public class GraphView1 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //change to actual values
        float[] values = new float[] { 0,1f};
        String[] verlabels = new String[] { "your values" };
        String[] horlabels = new String[] { "your values"};

        GraphView graphView = new GraphView(this);
        setContentView(graphView);
        }
}
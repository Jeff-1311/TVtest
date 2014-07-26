package com.example.anatolii.textviewtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anatolii on 25.07.2014.
 */
public class FirstFragment extends Fragment {
    String TAG = "TextViewTest";
    TextView textView;
    Button button;
    MyTimer myTimer;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.first_fragment, container, false);
    //    textView = (TextView) root.findViewById(R.id.textView1);
        button = (Button) root.findViewById(R.id.button);
        textView  = (TextView) root.findViewById(R.id.textView1); // This View was not initialized

        myTimer = new MyTimer(10000,1000,textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.util.Log.d(TAG, "button start");

                textView.setText("some txt"); // You need init all View
                myTimer.start();

            }
        });





        return root;
    }


}

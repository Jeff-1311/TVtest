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

    public TextView getTextView()
    {
        return textView;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.first_fragment, container, false);
    //    textView = (TextView) root.findViewById(R.id.textView1);
        button = (Button) root.findViewById(R.id.button);
        myTimer = new MyTimer(10000,1000,(TextView) root.findViewById(R.id.textView1));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.util.Log.d(TAG, "button start");

                textView.setText("some txt");
                myTimer.start();

            }
        });





        return root;
    }


}

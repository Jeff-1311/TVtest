package com.example.anatolii.textviewtest;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by anatolii on 25.07.2014.
 */
public class MyTimer extends CountDownTimer {
    TextView counter;
    String TAG = "TextViewTest";
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public MyTimer(long millisInFuture, long countDownInterval, final TextView newCounter) {
        super(millisInFuture, countDownInterval);
        counter = newCounter;
        counter.setText("Left: " + millisInFuture);
    }

    @Override
    public void onTick(long millisUntilFinished) {
        Log.d(TAG, "onTick");
        counter.setText("Left: " + millisUntilFinished / 1000);
    }

    @Override
    public void onFinish() {
        Log.d(TAG, "onFinish");
    }


}

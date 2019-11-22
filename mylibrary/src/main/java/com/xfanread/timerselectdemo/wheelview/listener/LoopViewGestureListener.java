package com.xfanread.timerselectdemo.wheelview.listener;

import android.view.MotionEvent;

import com.xfanread.timerselectdemo.wheelview.view.WheelView;


/**
 * 手势监听
 * Created by zes on 2018/4/28.
 */
public final class LoopViewGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {

    private final WheelView wheelView;


    public LoopViewGestureListener(WheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        wheelView.scrollBy(velocityY);
        return true;
    }
}

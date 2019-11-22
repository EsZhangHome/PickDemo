package com.halfroom.pickdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.xfanread.timerselectdemo.wheelview.listener.OnTimeSelectListener;
import com.xfanread.timerselectdemo.wheelview.utils.WheelSetUtils;

import java.util.Calendar;

import static com.xfanread.timerselectdemo.wheelview.utils.WheelSetUtils.setDate;
import static com.xfanread.timerselectdemo.wheelview.utils.WheelSetUtils.setLabel;
import static com.xfanread.timerselectdemo.wheelview.utils.WheelSetUtils.setTextXOffset;

public class MainActivity extends AppCompatActivity {
    public OnTimeSelectListener timeSelectListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitWheelView();
    }


    public void InitWheelView() {
        WheelSetUtils.setPickerOptions(MainActivity.this, timeSelectListener);
        Calendar selectedDate = Calendar.getInstance();//系统当前时间
        Calendar startDate = Calendar.getInstance();
        startDate.set(startDate.get(Calendar.YEAR) - 30, 0, 01);
        Calendar endDate = Calendar.getInstance();
        endDate.set(endDate.get(Calendar.YEAR), 11, 31);
        //当点击显示时间选择器的时候显示当前的时间
        setDate(selectedDate);
        WheelSetUtils.setRangDate(startDate, endDate);
        setLabel("年", "月", "日", "时", "分", "秒");
        setTextXOffset(-40, 0, 40, 40, 0, -40);
        // 时间转轮 自定义控件
        LinearLayout timePickerView = (LinearLayout) findViewById(R.id.timepicker1);
        WheelSetUtils.initWheelTime(timePickerView);
    }
}

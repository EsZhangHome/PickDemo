package com.xfanread.timerselectdemo.wheelview.configure;

import android.content.Context;
import android.graphics.Typeface;

import com.xfanread.mylibrary.R;
import com.xfanread.timerselectdemo.wheelview.listener.OnTimeSelectChangeListener;
import com.xfanread.timerselectdemo.wheelview.view.WheelView;

import java.util.Calendar;

/**
 * 配置类
 * Created by zes on 2018/4/28.
 */

public class PickerOptions {

    public static final int TYPE_PICKER_OPTIONS = 1;
    public static final int TYPE_PICKER_TIME = 2;

    public OnTimeSelectChangeListener timeSelectChangeListener;

    public Calendar date;//当前选中时间
    public Calendar startDate;//开始时间
    public Calendar endDate;//终止时间
    public int startYear;//开始年份
    public int endYear;//结尾年份

    public boolean cyclic = false;//是否循环
    public boolean isLunarCalendar = false;//是否显示农历

    public String label_year, label_month, label_day, label_hours, label_minutes, label_seconds;//单位
    public int x_offset_year, x_offset_month, x_offset_day, x_offset_hours, x_offset_minutes, x_offset_seconds;//单位


    public PickerOptions(int buildType) {
        if (buildType == TYPE_PICKER_OPTIONS) {
            layoutRes = R.layout.pickerview_options;
        } else {
            layoutRes = R.layout.pickerview_time;
        }
    }

    //******* 公有字段  ******//
    public int layoutRes;

    public Context context;

    public int textColorOut = 0xFFa8a8a8; //分割线以外的文字颜色
    public int textColorCenter = 0xFF2a2a2a; //分割线之间的文字颜色
    public int dividerColor = 0xFFd5d5d5; //分割线的颜色


    public float lineSpacingMultiplier = 1.6f; // 条目间距倍数 默认1.6

    public boolean isCenterLabel = false;//是否只显示中间的label,默认每个item都显示
    public Typeface font = Typeface.MONOSPACE;//字体样式
    public WheelView.DividerType dividerType = WheelView.DividerType.FILL;//分隔线类型
}

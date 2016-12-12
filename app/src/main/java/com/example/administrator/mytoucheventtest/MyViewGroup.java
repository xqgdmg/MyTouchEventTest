package com.example.administrator.mytoucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class MyViewGroup extends RelativeLayout {

	private static final String TAG = "MyViewGroup";

	public MyViewGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * ViewGroup 分发事件
	 */
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e("MyViewGroup", "MyViewGroup dispatchTouchEvent");
		return super.dispatchTouchEvent(ev);
	}
	
	/**
	 * 拦截事件 true 表示拦截事件， false表示不拦截 ,拦截孩子的事件
	 */
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.e("MyViewGroup", "MyViewGroup onInterceptTouchEvent");
//		boolean result = true;
		boolean result = false;
		if (result) {
			//拦截
			Log.e("MyViewGroup", "拦截事件");
		} else {
			Log.e("MyViewGroup", "不拦截事件");
		}
		
		return result;
	}
	
	/**
	 * 消费事件 true表示消费 false不消费
	 */
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		boolean result = true;
//		boolean result = false;
		if (result) {

			Log.e("MyViewGroup", "消费事件");
		} else {
			Log.e("MyViewGroup", "不消费事件");
		}
		return result;
	}

}

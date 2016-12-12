package com.example.administrator.mytoucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {

	private static final String TAG = "MyView";

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	/**
	 * View 分发事件
	 */
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		Log.e("MyView", "MyView dispatchTouchEvent");

		// 添加这两行代码可以向父容器申请，父容器不拦截事件,父子都打印消费事件
//		getParent().requestDisallowInterceptTouchEvent(true);
//		Log.e("MyView", "MyView requestDisallowInterceptTouchEvent");

		return super.dispatchTouchEvent(ev);
	}
	
	
	/**
	 * 消费事件 true表示消费 false不消费
	 */
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
//		boolean result = true;// 消费
		boolean result = false;// 不消费
		if (result) {

			Log.e("MyView", "消费事件");
		} else {
			Log.e("MyView", "不消费事件");
		}
		return result;
	}


}

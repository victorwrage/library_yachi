/** 
 * @Filename VUtils.java 
 * @Description TODO 
 * @Version 1.0
 * @Author xiaoyl
 * @Creation 2013-8-21 下午4:08:32   
 * @Copyright Copyright © 2009 - 2013 Victor.All Rights Reserved.
 **/
package com.yachi.library_yachi.utils;

import com.yachi.library_yachi.VLog;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.WindowManager;

/**
 * @ClassName VUtils
 * @Description TODO
 * @Version 1.0
 * @Creation 2013-8-21 下午4:08:32
 * @Mender xiaoyl
 * @Modification 2013-8-21 下午4:08:32
 **/
public class VUtils {
	
	public static boolean isConnect(Context context) {
		// 获取手机所有连接管理对象（包括对wi-fi,net等连接的管理）
		try {
			ConnectivityManager connectivity = (ConnectivityManager) context
			.getSystemService(Context.CONNECTIVITY_SERVICE);
			if (connectivity != null) {
				// 获取网络连接管理的对象
				NetworkInfo info = connectivity.getActiveNetworkInfo();
				if (info != null && info.isConnected()) {
					// 判断当前网络是否已经连接
					if (info.getState() == NetworkInfo.State.CONNECTED) {
						return true;
					}
				}
			}

		} catch (Exception e) {
			VLog.v("error", e.toString());
		}

		return false;

	}
	
	@SuppressWarnings("deprecation")
	public static int[] getPhoneResolution(Context context){
		int[] resolution = new int[2];
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

		int width = wm.getDefaultDisplay().getWidth();
		int height = wm.getDefaultDisplay().getHeight();
	    resolution[0] = width;
	    resolution[1] = height;
		return resolution;
		 
	}
	
}

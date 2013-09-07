package com.yachi.library_yachi.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * @firm 长沙江泓信息技术有限公司
 * 
 * @author xiaoyl
 * @date 2013-07-20
 * 
 * @file 小数据存读Preference操作类
 * 
 */
public class VSharedPreference {
	/** 小数据配置存储类*/
	private static VSharedPreference instance;
	
	private Context context;
	/** KEY 是否第一次进入应用*/
	private static final String FIRST_ENTER = "first_enter";
	/** KEY 保存最大TAG数*/
	private static final String TAG_TAG_COUNT = "tag_count";
       
       /**
   	 * 构造方法
   	 * @param context
   	 */
   	private VSharedPreference(Context context) {
   		this.context = context;
   	}

   	/**
   	 * 获得GoMarketPreferences静态实例对象
   	 * @param context
   	 * @return
   	 */
   	public static VSharedPreference getInstance(Context context) {
   		if (instance == null) {
   			instance = new VSharedPreference(context);
   		}
   		return instance;
   	}
   	/**
	 * get SharedPreferences
	 * @return
	 */
	private SharedPreferences getSharedPreferences() {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}
	/**
	 * get Editor
	 * @return
	 */
	private Editor getEditor() {
		SharedPreferences pref = getSharedPreferences();
		return pref.edit();
	}
   	/**
	 * 是否第一次进入应用
	 * @return
	 */
	public boolean isFirstEnter() {
		SharedPreferences pref = getSharedPreferences();
		return pref.getBoolean(FIRST_ENTER, false);

	}
	/**
	 * 设置是否第一次进入应用
	 * @return
	 */
	public boolean setActionCount(boolean enter) {
		Editor editor = getEditor();
		editor.putBoolean(FIRST_ENTER, enter);
		return editor.commit();
	}
}

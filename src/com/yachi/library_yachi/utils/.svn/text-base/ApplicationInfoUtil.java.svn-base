/** 
 * @Filename ApplicationInfoUtil.java 
 * @Description TODO 
 * @Version 1.0
 * @Author xiaoyl
 * @Creation 2013-8-17 下午2:38:02   
 * @Copyright Copyright © 2009 - 2013 Victor.All Rights Reserved.
**/
package com.yachi.library_yachi.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

/** 
 * @ClassName ApplicationInfoUtil 
 * @Description TODO 程序信息获取 
 * @Version 1.0
 * @Creation 2013-8-17 下午2:38:02 
 * @Mender xiaoyl
 * @Modification 2013-8-17 下午2:38:02 
 **/
public class ApplicationInfoUtil {
	private Context context;
	private static ApplicationInfoUtil instance;
	/** 
	 * @Name ApplicationInfoUtil 
	 * @Description TODO 
	 **/
	private ApplicationInfoUtil(Context context) {
		this.context = context;
	}
	
	public static ApplicationInfoUtil getInstance(Context context){
		if(instance==null){
			instance = new ApplicationInfoUtil(context);
		}
		return instance;
	}
	/**
	 * 获取版本号
	 * 
	 * @return
	 * @throws Exception
	 */
	public  String getVersionName()  {
		// 获取packagemanager的实例
		PackageManager packageManager = context.getPackageManager();
		// getPackageName()是你当前类的包名，0代表是获取版本信息
		PackageInfo packInfo;
		String version = "0";
		try {
			packInfo = packageManager.getPackageInfo(context.getPackageName(),
					0);
			version = packInfo.versionName;
		} catch (NameNotFoundException e) {

			e.printStackTrace();
		}
		
		return version;
	}

}

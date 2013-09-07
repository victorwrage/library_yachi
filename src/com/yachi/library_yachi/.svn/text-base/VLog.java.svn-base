/** 
 * @Filename VLog.java 
 * @Description TODO 
 * @Version 1.0
 * @Author xiaoyl
 * @Creation 2013-8-10 上午10:34:43   
 * @Copyright Copyright © 2009 - 2013 Victor.All Rights Reserved.
**/
package com.yachi.library_yachi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

/** 
 * @ClassName VLog 
 * @Description TODO  LOG工具类
 * @Version 1.0
 * @Creation 2013-8-10 上午10:34:43 
 * @Mender xiaoyl
 **/
public class VLog {
	/**是否DEBUG*/
	private static boolean DEBUG = true;
	/**是否输出到文件*/
	private static boolean OUTPUT = true;
	private static  String TAG = "appliaction";
	
	/**
	 * @return the tag
	 **/
	public static String getTag() {
		return TAG;
	}
	
	public static void setTag(String tag){
		TAG = tag;
	}

	public static void e(String paramString) {
		if (!DEBUG)
			return;
		Log.e(TAG, paramString);
		if (!OUTPUT)
			return;
		writeFile(paramString);
	}

	public static void e(String paramString1, String paramString2) {
		if (!DEBUG)
			return;
		Log.e(paramString1, paramString2);
		if (!OUTPUT)
			return;
		writeFile(paramString2);
	}

	public static void e(String paramString1, String paramString2,
			Throwable paramThrowable) {
		if (!DEBUG)
			return;
		Log.e(paramString1, paramString2, paramThrowable);
		writeFile(paramString2);
	}

	public static void i(String paramString) {
		if (!DEBUG)
			return;
		Log.i(TAG, paramString);
		if (!OUTPUT)
			return;
		writeFile(paramString);
	}

	public static void i(String paramString1, String paramString2) {
		if (!DEBUG)
			return;
		Log.i(paramString1, paramString2);
	}

	public static void i(String paramString1, String paramString2,
			Throwable paramThrowable) {
		if (!DEBUG)
			return;
		Log.i(paramString1, paramString2, paramThrowable);
		if (!OUTPUT)
			return;
		writeFile(paramString2+":"+paramThrowable);
	}

	public static boolean isDEBUG() {
		return DEBUG;
	}

	public static void setDEBUG(boolean paramBoolean) {
		DEBUG = paramBoolean;
	}

	public static void v(String paramString) {
		if (!DEBUG)
			return;
		Log.v(TAG, paramString);
		if (!OUTPUT)
			return;
		writeFile(paramString);
	}

	public static void v(String paramString1, String paramString2) {
		if (!DEBUG)
			return;
		Log.v(paramString1, paramString2);
		if (!OUTPUT)
			return;
		writeFile(paramString2);
	}

	/**
	 * 写入文件
	 * 
	 * @param paramString
	 */
	private static void writeFile(String paramString) {
		fileWriter localfileWriter = new fileWriter();
		String[] arrayOfString = new String[1];
		arrayOfString[0] = paramString;
		localfileWriter.execute(arrayOfString);
	}
    /**
     * 
     * @author xiaoyl
     * @date 后台写LOG文件
     */
	private static class fileWriter extends AsyncTask<String, Void, Void> {

		@Override
		protected Void doInBackground(String... params) {
			if(!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
				return null;
			}
			File localFile1 = Environment.getExternalStorageDirectory();
			if (!localFile1.canWrite()){
				return null;
			}
			try {
				
				File localFile2 = new File(localFile1.getPath() + "/"+TAG+"/");
				Log.e("fileWriter", ""+localFile2.exists());
				if(!localFile2.exists()){
				   localFile2.mkdirs();
				   
				}
				
				File dir = new File(localFile2.getAbsoluteFile()+"/debug.txt"); 	
		        if (!dir.exists()) { 
		              try { 
		                  dir.createNewFile(); 	 
		            } catch (Exception e) { 
		            	
		            } 
		        } 

				FileWriter localFileWriter = new FileWriter(dir, true);
				BufferedWriter localBufferedWriter = new BufferedWriter(
						localFileWriter);
				localBufferedWriter.write(new Date().toLocaleString() + ": "
						+ params[0] + "\n");
				localBufferedWriter.close();
				localFileWriter.close();
				return null;
			} catch (Exception localException) {
				localException.printStackTrace();
			}
			return null;
		}
	}
}

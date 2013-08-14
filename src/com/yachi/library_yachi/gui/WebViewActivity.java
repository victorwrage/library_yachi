/** 
 * @Filename WebViewActivity.java 
 * @Description TODO 
 * @Version 1.0
 * @Author xiaoyl
 * @Creation 2013-8-12 下午2:02:12   
 * @Copyright Copyright © 2009 - 2013 Victor.All Rights Reserved.
 **/
package com.yachi.library_yachi.gui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @ClassName WebViewActivity
 * @Description TODO
 * @Version 1.0
 * @Creation 2013-8-12 下午2:02:12
 * @Mender xiaoyl
 * @Modification 2013-8-12 下午2:02:12
 **/
public class WebViewActivity extends ActivityBasedSherlock {
	WebView mWebView;

	/**
	 * @Name onCreate
	 * @Description TODO
	 * @param savedInstanceState
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 * @Date 2013-8-12 下午2:13:54
	 **/
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mWebView = (WebView) new WebView(this);
		WebSettings webSettings = mWebView.getSettings();
		webSettings.setJavaScriptEnabled(true);

		mWebView.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}

		});
		mWebView.loadUrl("http://www.taobao.com");
		setContentView(mWebView);
	}

}

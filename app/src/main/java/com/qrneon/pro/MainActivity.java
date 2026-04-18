package com.qrneon.pro;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);

WebView w=new WebView(this);

WebSettings s=w.getSettings();
s.setJavaScriptEnabled(true);
s.setDomStorageEnabled(true);

w.loadUrl("file:///android_asset/www/splash.html");

setContentView(w);
}
}

package com.example.dateandtimepickerdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        WebView webView=new WebView(this);
        setContentView(webView);
        webView.loadUrl("https://www.google.com/");
    }
}

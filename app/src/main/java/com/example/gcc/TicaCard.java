package com.example.gcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TicaCard extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tica_card);
        webView=findViewById(R.id.webViewId);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // do not go other browser
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.surokkha.gov.bd");

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
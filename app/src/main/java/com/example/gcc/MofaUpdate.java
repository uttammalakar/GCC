package com.example.gcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MofaUpdate extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mofa_update);

        webView=(WebView)findViewById(R.id.webViewId);
        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // do not go other browser
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://visa.mofa.gov.sa/VisaPerson/CheckMedicalResult");

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
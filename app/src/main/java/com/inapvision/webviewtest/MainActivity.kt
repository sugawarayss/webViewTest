package com.inapvision.webviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)

        myWebView.settings.javaScriptEnabled = true

        myWebView.loadUrl("https://dqlvplmjhnpwk.cloudfront.net/inviter/mansions?id_token=10&refresh_token=10&email=user@example.com")
    }
}

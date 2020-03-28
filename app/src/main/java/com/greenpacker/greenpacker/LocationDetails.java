package com.greenpacker.greenpacker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class LocationDetails extends AppCompatActivity {

    private WebView webviewlocdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        String location = getIntent().getStringExtra("LOCATION");
        String URL1 = "https://www.google.com/search?q=";
        URL1 = URL1 + location;

        //Toast.makeText(LocationDetails.this, URL1 , Toast.LENGTH_LONG).show();

        webviewlocdetail = (WebView) findViewById(R.id.webviewlocdetail);
        webviewlocdetail.setWebViewClient(new WebViewClient());
        webviewlocdetail.loadUrl(URL1);
        //webviewlocdetail.loadUrl("https://www.google.com/travel/guide?dest_src=yts&tcfs=EgoKCC9tLzBmaHA5&dest_mid=%2Fm%2F0fhp9&hl=hu&gl=us#dest_mid=/m/0fhp9&dest_src=yts&tcfs=EiQKCC9tLzBmaHA5GhgKCjIwMjAtMDQtMTMSCjIwMjAtMDQtMTc");
    }
}

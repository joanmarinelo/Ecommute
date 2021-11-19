package com.example.ecommute;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.ecommute.databinding.ActivityLoginBinding;
import com.example.ecommute.databinding.ActivityRutasBinding;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RutasActivity extends AppCompatActivity {

    private ActivityRutasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        binding = ActivityRutasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String iframe = "<iframe\n        width=\"450\"\n        height=\"250\"\n        frameborder=\"0\" style=\"border:0\"\n        src=https://www.google.com/maps/embed/v1/directions?key=AIzaSyApUk0xJoZuc46YAjVQEhF1ul67ObY80Sk&origin=Barcelona&destination=Madrid&mode=driving&region=es allowfullscreen>\n    </iframe>";
        WebView googleMapWebView = binding.googlemapWebView;
        googleMapWebView.getSettings().setJavaScriptEnabled(true);
        googleMapWebView.loadData(iframe, "text/html", "utf-8");

    }

}
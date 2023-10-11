package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ProgressBar progressBar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用正确的id来初始化进度条
        progressBar = findViewById(R.id.pb);
        progressBar2 = findViewById(R.id.pb2);
    }

    public void leoClick(View view) {
        if(progressBar.getVisibility() == View.GONE){
            progressBar.setVisibility(View.VISIBLE);
        }else{
            progressBar.setVisibility(View.GONE);
        }
    }

    public void load(View view){
        int progress = progressBar2.getProgress();
        progress += 10;
        progressBar2.setProgress(progress);

    }
}
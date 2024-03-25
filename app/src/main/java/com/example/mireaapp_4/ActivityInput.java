package com.example.mireaapp_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityInput extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage("ok");
            }
        });
    }

    public void onAccessClickOk(View view) {
        sendMessage("oks");
    }

    private void sendMessage(String message) {
        Intent intent = new Intent();
        intent.putExtra(ActivityEdit.ACCESS_MESSAGE, message);
        setResult(RESULT_OK,intent);
        finish();
    }

}

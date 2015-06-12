package com.example.yddehigama.idioma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by YD DEHIGAMA on 5/18/2015.
 */
public class english1 extends gui1 {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.english1);

        final ImageButton learn=(ImageButton)findViewById(R.id.btn_learn);

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(english1.this, sinhala_choose_path.class));
            }
        });
    }
}

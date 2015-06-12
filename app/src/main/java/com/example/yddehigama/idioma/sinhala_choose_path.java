package com.example.yddehigama.idioma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by YD DEHIGAMA on 6/10/2015.
 */
public class sinhala_choose_path extends english1 {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinhala_choose_path);

        final Button basic=(Button)findViewById(R.id.btn_basic);

        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sinhala_choose_path.this,sinhala_basicq1.class));
            }
        });
    }
}

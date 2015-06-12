package com.example.yddehigama.idioma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by YD DEHIGAMA on 5/18/2015.
 */
public class gui1 extends MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gui1);

        final ImageButton sinhala=(ImageButton)findViewById(R.id.btn_sinhala);
        final ImageButton english=(ImageButton)findViewById(R.id.btn_english);

        //final TextView txt = (TextView) findViewById(R.id.sinhala_font);
        //final Typeface font = Typeface.createFromAsset(getAssets(), "Amal.TTF");
        //txt.setTypeface(font);

        sinhala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gui1.this, english1.class));
            }
        });

    }
}

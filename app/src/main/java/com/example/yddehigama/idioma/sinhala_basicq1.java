package com.example.yddehigama.idioma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.yddehigama.idioma.mydb.*;

/**
 * Created by YD DEHIGAMA on 6/11/2015.
 */
public class sinhala_basicq1 extends sinhala_choose_path {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinhala_basicq1);

        mydb myData = new mydb(this);

        /*String text;
        String text1;
        String text2;
        String text3;*/
        myData.insert_to_table();
        String text = myData.getquestion();
        String text1=myData.getanswer1();
        String text2=myData.getanswer2();
        String text3=myData.getanswer3();
        String text4=myData.getcorrectanswer();


        TextView txt = (TextView) findViewById(R.id.txt);
        Typeface font = Typeface.createFromAsset(getAssets(), "DL-Manel.TTF");
        txt.setTypeface(font);
        txt.setText(text);

        final CheckBox checkBox1=(CheckBox)findViewById(R.id.checkbox1);
        checkBox1.setText(text1);

        final CheckBox checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox2.setText(text2);

        final CheckBox checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox3.setText(text3);

        Button btn_check=(Button)findViewById(R.id.btn_check);
        final TextView msg=(TextView)findViewById(R.id.msg);


        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()&&checkBox2.isChecked()&&checkBox3.isChecked()){
                    msg.setText("Dont Wiok");
                }

            }
        });




    }
}
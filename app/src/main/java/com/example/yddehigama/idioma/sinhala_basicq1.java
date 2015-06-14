package com.example.yddehigama.idioma;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

import static com.example.yddehigama.idioma.mydb.*;

/**
 * Created by YD DEHIGAMA on 6/11/2015.
 */
public class sinhala_basicq1 extends sinhala_choose_path {

    int count=1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinhala_basicq1);


        final mydb myData = new mydb(this);
        myData.insert_to_table();

        myData.update();


        final int answer_no = 1;


        String text = myData.getquestion(answer_no);
        String text1 = myData.getanswer1(answer_no);
        String text2 = myData.getanswer2(answer_no);
        String text3 = myData.getanswer3(answer_no);
        final String text4 = myData.getcorrectanswer(answer_no);

        TextView txt = (TextView) findViewById(R.id.txt);
        Typeface font = Typeface.createFromAsset(getAssets(), "DL-Manel.TTF");
        txt.setTypeface(font);
        txt.setText(text);

        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.q1);


        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox1.setText(text1);

        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox2.setText(text2);

        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox3.setText(text3);

        Button btn_check = (Button) findViewById(R.id.btn_check);
        final TextView msg = (TextView) findViewById(R.id.msg);


        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
                    msg.setText("Choose One Answer");
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                } else if (checkBox1.isChecked() && checkBox2.isChecked() || checkBox1.isChecked() && checkBox3.isChecked() || checkBox2.isChecked() && checkBox3.isChecked()) {
                    msg.setText("You Choosed Two Question");
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                } else if (checkBox1.isChecked() && text4.equals(checkBox1.getText())) {
                    msg.setText("Correct 1===");


                } else if (checkBox2.isChecked() && text4.equals(checkBox2.getText())) {
                    msg.setText("Correct 2");

                } else if (checkBox3.isChecked() && text4.equals(checkBox3.getText())) {
                    msg.setText("Correct 3");

                } else {
                    msg.setText("Wrong Correct Answer is :" + text4);
                    checkBox1.setChecked(false);
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                }


            }
        });


        Button next = (Button) findViewById(R.id.btn_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                msg.setText("");

                count++;

                String text = myData.getquestion(count);
                String text1 = myData.getanswer1(count);
                String text2 = myData.getanswer2(count);
                String text3 = myData.getanswer3(count);
                final String text4 = myData.getcorrectanswer(count);

                TextView txt = (TextView) findViewById(R.id.txt);
                Typeface font = Typeface.createFromAsset(getAssets(), "DL-Manel.TTF");
                txt.setTypeface(font);
                txt.setText(text);

                ImageView image=(ImageView)findViewById(R.id.imageView);
                image.setImageResource(0);

                /*File file=new File("/drawable/q"+count);
                if(file.exists()){
                    Bitmap myBitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                    ImageView myImage = (ImageView) findViewById(R.id.imageView);
                    myImage.setImageResource(0);
                    myImage.setImageBitmap(myBitmap);
                }*/




                final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
                checkBox1.setText(text1);

                final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
                checkBox2.setText(text2);

                final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
                checkBox3.setText(text3);

                Button btn_check = (Button) findViewById(R.id.btn_check);
                final TextView msg = (TextView) findViewById(R.id.msg);


                btn_check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         if (checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()) {
                                msg.setText("Choose One Answer");
                                checkBox1.setChecked(false);
                                checkBox2.setChecked(false);
                                checkBox3.setChecked(false);
                         } else if (checkBox1.isChecked() && checkBox2.isChecked() || checkBox1.isChecked() && checkBox3.isChecked() || checkBox2.isChecked() && checkBox3.isChecked()) {
                                msg.setText("You Choosed Two Question");
                                checkBox1.setChecked(false);
                                checkBox2.setChecked(false);
                                checkBox3.setChecked(false);
                         } else if (checkBox1.isChecked() && text4.equals(checkBox1.getText())) {
                                msg.setText("Correct 1===");


                         } else if (checkBox2.isChecked() && text4.equals(checkBox2.getText())) {
                                msg.setText("Correct 2");

                         } else if (checkBox3.isChecked() && text4.equals(checkBox3.getText())) {
                                msg.setText("Correct 3");

                         } else {
                                msg.setText("Wrong Correct Answer is :" + text4);
                                checkBox1.setChecked(false);
                                checkBox2.setChecked(false);
                                checkBox3.setChecked(false);
                         }


                        }
                    });


                }

        });
    }


}

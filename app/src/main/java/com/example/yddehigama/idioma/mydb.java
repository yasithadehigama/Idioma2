package com.example.yddehigama.idioma;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by YD DEHIGAMA on 6/9/2015.
 */
class mydb extends SQLiteOpenHelper {
    public mydb(Context context) {
        super(context, "language2.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //String sql1 = "CREATE TABLE sinhala_basic (question_no INT PRIMARY KEY NOT NULL,question CHAR(100) NOT NULL ,answer1 CHAR(100) NOT NULL,answer2 CHAR(100) NOT NULL,answer3 CHAR(100) NOT NULL,correct_answer CHAR(100) NOT NULL)";
        //db.execSQL(sql1);

        //String strSQL = "UPDATE sinhala_basic SET Column1 = someValue WHERE columnId = "+ someValue;

        //db.update(sinhala_basic, "(Field1, Field2, Field3)" + " VALUES ('Bob', 19, 'Male')", "where _id = 1", null);

        //db.execSQL("UPDATE sinhala_basic SET question='<uhd hk jpkh bx.%Sishg yrjkak' WHERE id= "+2);





    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void update(){
        SQLiteDatabase x=getWritableDatabase();
        ContentValues xx=new ContentValues();

        xx.put("question","<uhd hk jpkh bx.%Sishg yrjkak");
        x.update("sinhala_basic",xx,"question_no"+"="+2,null);

        xx.put("question","uu msßñ <ufhla   hk jelsh bx.%Sishg yrjkak");
        x.update("sinhala_basic",xx,"question_no"+"="+3,null);

    }
    public void insert_to_table() {
        SQLiteDatabase x = getWritableDatabase();
        ContentValues xx = new ContentValues();
        //xx.put("",);
        xx.put("question_no", 1);
        xx.put("question", "mska;+rhg .e,fmk ksjerÈ jpkh f;darkak");//pinturayata galapena wachanaya..
        xx.put("answer1", "Child");
        xx.put("answer2", "Mother");
        xx.put("answer3", "Book");
        xx.put("correct_answer", "Child");

        xx.put("question_no", 2);
        xx.put("question", "bx.%Sishg yrjkak <uhd");//pinturayata galapena wachanaya..
        xx.put("answer1", "Book");
        xx.put("answer2", "Teacher");
        xx.put("answer3", "Child");
        xx.put("correct_answer", "Child");

        xx.put("question_no", 3);
        xx.put("question", "ksjerÈ jdlHh f;darkak");//pinturayata galapena wachanaya..
        xx.put("answer1", "I played Cricket");
        xx.put("answer2", "I am a Boy");
        xx.put("answer3", "I am a Girl");
        xx.put("correct_answer", "I am a Boy");

        x.insert("sinhala_basic", null, xx);




    }

    public String getquestion(int a) {

        String Table_Name = "sinhala_basic";

        String selectQuery = "SELECT  * FROM sinhala_basic WHERE question_no ="+a;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        String data = null;

        if (cursor.moveToFirst()) {
            do {
                data = cursor.getString(cursor.getColumnIndex("question"));
            } while (cursor.moveToNext());
        }

        db.close();
        //return data;
        return data;
    }

    public String getanswer1(int a) {

        String Table_Name = "sinhala_basic";

        String selectQuery = "SELECT  * FROM sinhala_basic WHERE question_no ="+a;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        String data1 = null;

        if (cursor.moveToFirst()) {
            do {
                data1 = cursor.getString(cursor.getColumnIndex("answer1"));
            } while (cursor.moveToNext());
        }

        db.close();
        //return data;
        return data1;

    }

    public String getanswer2(int a) {

        String Table_Name = "sinhala_basic";

        String selectQuery = "SELECT  * FROM sinhala_basic WHERE question_no ="+a;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        String data2 = null;

        if (cursor.moveToFirst()) {
            do {
                data2 = cursor.getString(cursor.getColumnIndex("answer2"));
            } while (cursor.moveToNext());
        }

        db.close();
        //return data;
        return data2;

    }

    public String getanswer3(int a) {

        String Table_Name = "sinhala_basic";

        String selectQuery = "SELECT  * FROM sinhala_basic WHERE question_no ="+a;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        String data3 = null;

        if (cursor.moveToFirst()) {
            do {
                data3 = cursor.getString(cursor.getColumnIndex("answer3"));
            } while (cursor.moveToNext());
        }

        db.close();
        //return data;
        return data3;

    }
    public String getcorrectanswer(int a) {

        //String Table_Name = "sinhala_basic";

        String selectQuery = "SELECT  * FROM sinhala_basic WHERE question_no ="+a;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        String correct_answers = null;

        if (cursor.moveToFirst()) {
            do {
                correct_answers = cursor.getString(cursor.getColumnIndex("correct_answer"));
            } while (cursor.moveToNext());
        }

        db.close();
        //return data;
        return correct_answers;

    }


}

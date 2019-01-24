package com.htoon.tp.willy.wy.magicnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, u1, u2, u3, u4, u5, u6,
            u7, u8, u9, u10, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, w1, w2,
            w3, w4, w5, w6, w7, w8, w9, w10, x1, x2, x3, x4, x5, x6, x7, x8,
            x9, x10,rsu,tvC,tvS1,tvS2,tvS3,tvS4,tvS5,tvS6;
    CheckBox chk;
    Button btnSubmit,btnStart;
    int mindNumber = 0;
    int state = 0;
    LinearLayout l1;
    LinearLayout rw;
    RelativeLayout r1;
    String[] card1 = { "1", "3", "5", "7", "9", "11", "13", "15", "17", "19",
            "21", "23", "25", "27", "29", "31", "33", "35", "37", "39", "41",
            "43", "45", "47", "49", "51", "53", "55", "57", "59", "61", "63",
            "65", "67", "69", "71", "73", "75", "77", "79", "81", "83", "85",
            "87", "89", "91", "93", "95", "97", "99" };

    String[] card2 = { "2", "3", "6", "7", "10", "11", "14", "15", "18", "19",
            "22", "23", "26", "27", "30", "31", "34", "35", "38", "39", "42",
            "43", "46", "47", "50", "51", "54", "55", "58", "59", "62", "63",
            "66", "67", "70", "71", "74", "75", "78", "79", "82", "83", "86",
            "87", "90", "91", "94", "95", "98", "99" };
    String[] card3 = { "4", "5", "6", "7", "12", "13", "14", "15", "16", "21",
            "22", "23", "28", "29", "30", "31", "36", "37", "38", "39", "44",
            "46", "46", "47", "52", "53", "54", "55", "60", "61", "62", "63",
            "68", "69", "70", "71", "76", "77", "78", "79", "84", "85", "86",
            "87", "92", "93", "94", "95", "100", "-" };
    String[] card4, card5, card6, card7;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        String cs4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31 40 41 42 43 44 45 46 47 56 57 58 59 60 61 62 63 72 73 74 75 76 77 78 79 88 89 90 91 92 93 94 95 - - ";
        card4 = cs4.split(" ");
        String cs5="16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 - - ";
        card5=cs5.split(" ");
        String cs6="32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 96 97 98 99 100 - - - - - - - - - - - - - ";
        card6=cs6.split(" ");
        String cs7="64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 - - - - - - - - - - - - - ";
        card7=cs7.split(" ");
        findView();
        btnStart=(Button)findViewById(R.id.btnStart);
        rw=(LinearLayout) findViewById(R.id.welcomeLayout) ;
        tvS1.setText("- Pick A Number Between 1-100.");
        tvS2.setText("- Note It In Your Mind.");
        tvS3.setText("- I'll Show You Seven Cards.");
        tvS4.setText("- Look Each Card Carefully!");
        tvS5.setText("- If A Card Contains Your Number,Mark At 'Yes'.");
        tvS6.setText("- Finally,I'll Show The Number You Picked...");

        btnStart.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        createCard(card1);

    }
    private void cardChange(int c) {
        switch (c) {
            case 1:
                createCard(card2);
                break;
            case 2:
                createCard(card3);
                break;
            case 3:
                createCard(card4);
                break;
            case 4:
                createCard(card5);
                break;
            case 5:
                createCard(card6);
                break;
            case 6:
                createCard(card7);
                break;
            case 7:state=0;
                createCard(card1);
                l1.setVisibility(View.INVISIBLE);
                r1.setVisibility(View.VISIBLE);
                rsu.setText(mindNumber+"");



        }

    }

    private void createCard(String[] n) {
        t1.setText(n[0]);
        t2.setText(n[1]);
        t3.setText(n[2]);
        t4.setText(n[3]);
        t5.setText(n[4]);
        t6.setText(n[5]);
        t7.setText(n[6]);
        t8.setText(n[7]);
        t9.setText(n[8]);
        t10.setText(n[9]);

        u1.setText(n[10]);
        u2.setText(n[11]);
        u3.setText(n[12]);
        u4.setText(n[13]);
        u5.setText(n[14]);
        u6.setText(n[15]);
        u7.setText(n[16]);
        u8.setText(n[17]);
        u9.setText(n[18]);
        u10.setText(n[19]);

        v1.setText(n[20]);
        v2.setText(n[21]);
        v3.setText(n[22]);
        v4.setText(n[23]);
        v5.setText(n[24]);
        v6.setText(n[25]);
        v7.setText(n[26]);
        v8.setText(n[27]);
        v9.setText(n[28]);
        v10.setText(n[29]);

        w1.setText(n[30]);
        w2.setText(n[31]);
        w3.setText(n[32]);
        w4.setText(n[33]);
        w5.setText(n[34]);
        w6.setText(n[35]);
        w7.setText(n[36]);
        w8.setText(n[37]);
        w9.setText(n[38]);
        w10.setText(n[39]);

        x1.setText(n[40]);
        x2.setText(n[41]);
        x3.setText(n[42]);
        x4.setText(n[43]);
        x5.setText(n[44]);
        x6.setText(n[45]);
        x7.setText(n[46]);
        x8.setText(n[47]);
        x9.setText(n[48]);
        x10.setText(n[49]);
    }

    private void findView() {
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
        t5 = (TextView) findViewById(R.id.t5);
        t6 = (TextView) findViewById(R.id.t6);
        t7 = (TextView) findViewById(R.id.t7);
        t8 = (TextView) findViewById(R.id.t8);
        t9 = (TextView) findViewById(R.id.t9);
        t10 = (TextView) findViewById(R.id.t10);

        u1 = (TextView) findViewById(R.id.t11);
        u2 = (TextView) findViewById(R.id.t12);
        u3 = (TextView) findViewById(R.id.t13);
        u4 = (TextView) findViewById(R.id.t14);
        u5 = (TextView) findViewById(R.id.t15);
        u6 = (TextView) findViewById(R.id.t16);
        u7 = (TextView) findViewById(R.id.t17);
        u8 = (TextView) findViewById(R.id.t18);
        u9 = (TextView) findViewById(R.id.t19);
        u10 = (TextView) findViewById(R.id.t20);

        v1 = (TextView) findViewById(R.id.t21);
        v2 = (TextView) findViewById(R.id.t22);
        v3 = (TextView) findViewById(R.id.t23);
        v4 = (TextView) findViewById(R.id.t24);
        v5 = (TextView) findViewById(R.id.t25);
        v6 = (TextView) findViewById(R.id.t26);
        v7 = (TextView) findViewById(R.id.t27);
        v8 = (TextView) findViewById(R.id.t28);
        v9 = (TextView) findViewById(R.id.t29);
        v10 = (TextView) findViewById(R.id.t30);

        w1 = (TextView) findViewById(R.id.t31);
        w2 = (TextView) findViewById(R.id.t32);
        w3 = (TextView) findViewById(R.id.t33);
        w4 = (TextView) findViewById(R.id.t34);
        w5 = (TextView) findViewById(R.id.t35);
        w6 = (TextView) findViewById(R.id.t36);
        w7 = (TextView) findViewById(R.id.t37);
        w8 = (TextView) findViewById(R.id.t38);
        w9 = (TextView) findViewById(R.id.t39);
        w10 = (TextView) findViewById(R.id.t40);

        x1 = (TextView) findViewById(R.id.t41);
        x2 = (TextView) findViewById(R.id.t42);
        x3 = (TextView) findViewById(R.id.t43);
        x4 = (TextView) findViewById(R.id.t44);
        x5 = (TextView) findViewById(R.id.t45);
        x6 = (TextView) findViewById(R.id.t46);
        x7 = (TextView) findViewById(R.id.t47);
        x8 = (TextView) findViewById(R.id.t48);
        x9 = (TextView) findViewById(R.id.t49);
        x10 = (TextView) findViewById(R.id.t50);

        tvC=(TextView)findViewById(R.id.tvCard);

        rsu=(TextView)findViewById(R.id.tvRs);

        l1=(LinearLayout)findViewById(R.id.linearOne);
        r1=(RelativeLayout)findViewById(R.id.resultLayout);

        chk = (CheckBox) findViewById(R.id.chkCon);
        btnSubmit = (Button) findViewById(R.id.btnS);

        tvS1=(TextView)findViewById(R.id.tvS1);
        tvS2=(TextView)findViewById(R.id.tvS2);
        tvS3=(TextView)findViewById(R.id.tvS3);
        tvS4=(TextView)findViewById(R.id.tvS4);
        tvS5=(TextView)findViewById(R.id.tvS5);
        tvS6=(TextView)findViewById(R.id.tvS6);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnS:state++;
                tvC.setText("Card "+(state+1));
                if (chk.isChecked()) {
                    mindNumber += Math.pow(2, (state - 1));
                }
                chk.setChecked(false);

                cardChange(state);
                break;
            case R.id.btnStart:rw.setVisibility(View.INVISIBLE);
                l1.setVisibility(View.VISIBLE);
                tvC.setText("Card 1");
        }
    }
}

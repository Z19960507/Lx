package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText1;
    EditText editText2;
    String TAG = "textAA";
    Button button;

    TextView TextView_1;
    TextView TextView_2;
    Button BT_1;
    Button BT_2;
    Button BT_3;
    Button BT_4;
    Button BT_5;
    Button BT_6;
    Button BT_7;
    Button BT_8;
    Button BT_9;
    Button BT_0;
    Button BT_CHENG;
    Button BT_CHU;
    Button BT_JIA;
    Button BT_JIAN;
    Button BT_DENG;
    Button BT_JIAJIAN;
    Button BT_AC;
    Button BT_YU;
    Button BT_DIAN;

    String g ;
    double h;
    String t;
    String d;
    String b;
    String f;
    String dYi = "";
    String dEr = "";
    String hs = "";
    String hs2 = "";
    String dSan = "";
    String d3= "";
    String c = "";
    String cc = "";
    String zf = "";
    int xx;
    double x;
    double y;
    double z;
    boolean t1;
    double n;
    double zz;

    private void Forzz_() {
        String q = TextView_1.getText().toString();
//        int a = Integer.parseInt(hs);

        if ("+".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);
            n = Double.parseDouble(dSan);

//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x + y;


            if ("+".equals(hs2)) {
                h = x + y + n;

                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            } else if ("-".equals(hs2)) {
                h = x + y - n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }



            }else if ("*".equals(hs2)) {
                h = y * n + x;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }

            }else if ("/".equals(hs2)) {
                h = y / n + x;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            }

        }else if ("-".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);
            n = Double.parseDouble(dSan);

//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x - y;




            if ("+".equals(hs2)) {
                h = x - y + n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            } else if ("-".equals(hs2)) {
                h = x - y - n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }



            }else if ("*".equals(hs2)) {
                h = x - y * n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }

            }else if ("/".equals(hs2)) {
                h = x - y / n ;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            }
//            int xx;
//            boolean t;
//
//            t = true;
//            for (int b = 1; b < 10; b++) {
//                if (z % b == 0) {
//                    t = false;
//                    xx = (int) z;
//                    q = "" + xx;
//                    TextView_1.setText(q);
//                    break;
//                }
//            }
//            if (t == true) {
//                q = "" + z;
//                TextView_1.setText(q);
//
//            }





        }else if ("*".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);
            n = Double.parseDouble(dSan);

//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = y * n;





            if ("+".equals(hs2)) {
                h = x * y + n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            } else if ("-".equals(hs2)) {
                h = x * y - n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }



            }else if ("*".equals(hs2)) {
                h = x * y * n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }

            }else if ("/".equals(hs2)) {
                h = x * y / n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            }





        }else if ("/".equals(hs)){
//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
//            int z = x / y;
            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);
            n = Double.parseDouble(dSan);
            double z = x / y;
//            q = "" + z;
//            TextView_1.setText(q);
            if ("+".equals(hs2)) {
                h = x / y + n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            } else if ("-".equals(hs2)) {
                h = x / y - n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }



            }else if ("*".equals(hs2)) {
                h = x / y * n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }

            }else if ("/".equals(hs2)) {
                h = x / y / n;
                zz = new Double( new DecimalFormat( ".00" ).format( h ) );
                t1 = true;
                for (int b = 1; b < 10; b++) {

                    if (h % b == 0) {
                        t1 = false;
                        xx = (int) zz;
                        q = "" + xx;
                        TextView_1.setText(q);
                        break;
                    }
                }
                if (t1 == true) {
                    q = "" + zz;
                    TextView_1.setText(q);

                }
            }
//            if (x % y == 0){
//                double z = x / y;
//                q = "" + z;
//                TextView_1.setText(q);
//            }

        }
    }
    private void Forzz2_() {
        String p;
        if ("+".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);


//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x + y;
            zz = new Double( new DecimalFormat( ".00" ).format( z ) );
            t1 = true;
            for (int b = 1; b < 10; b++) {

                if (z % b == 0) {
                    t1 = false;
                    xx = (int) zz;
                    p = "" + xx;
                    TextView_1.setText(p);
                    break;
                }
            }
            if (t1 == true) {
                p = "" + zz;
                TextView_1.setText(p);

            }
        }else if ("-".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);

//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x - y;
            zz = new Double( new DecimalFormat( ".00" ).format( z ) );
            t1 = true;
            for (int b = 1; b < 10; b++) {

                if (z % b == 0) {
                    t1 = false;
                    xx = (int) zz;
                    p = "" + xx;
                    TextView_1.setText(p);
                    break;
                }
            }
            if (t1 == true) {
                p = "" + zz;
                TextView_1.setText(p);

            }
        }else if ("*".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);


//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x * y;
            zz = new Double( new DecimalFormat( ".00" ).format( z ) );
            t1 = true;
            for (int b = 1; b < 10; b++) {

                if (z % b == 0) {
                    t1 = false;
                    xx = (int) zz;
                    p = "" + xx;
                    TextView_1.setText(p);
                    break;
                }
            }
            if (t1 == true) {
                p = "" + zz;
                TextView_1.setText(p);

            }
        }else if ("/".equals(hs)) {

            x = Double.parseDouble(dYi);
            y = Double.parseDouble(dEr);


//            int x = Integer.parseInt(dYi);
//            int y = Integer.parseInt(dEr);
            z = x / y;
            zz = new Double( new DecimalFormat( ".00" ).format( z ) );
            t1 = true;
            for (int b = 1; b < 10; b++) {

                if (z % b == 0) {
                    t1 = false;
                    xx = (int) zz;
                    p = "" + xx;
                    TextView_1.setText(p);
                    break;
                }
            }
            if (t1 == true) {
                p = "" + zz;
                TextView_1.setText(p);

            }
        }

    }

//    private void aaa() {
//        button = (Button) findViewById(R.id.bottom1);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String q = "";
//                editText1 = (EditText) findViewById(R.id.editText_1);
//                String aa = editText1.getText().toString();
//                if (aa == null || aa.equals("")) {
////                    aa = "1";
//                    return;
//                }
//                int x = Integer.parseInt(aa);
//                editText2 = (EditText) findViewById(R.id.editText_2);
//                String bb = editText2.getText().toString();
//                if (bb == null || bb.equals("")) {
////                    bb = "1";
//                    return;
//                }
//                int y = Integer.parseInt(bb);
//                for (int h = 1; h <= x * y; h++) {
//                    if (h % x == 0 && h % y == 0) {
////                        Log.d("HHH", "H=" + h );
//                        q = ""  + h;
//                        break;
//                    }
//                }
//
//
//                textView = (TextView) findViewById(R.id.textView_1);
//                textView.setText(q);
//
//            }
//        });
//    }
//    private void bbb() {
//        editText2 = (EditText) findViewById(R.id.editText_2);
//        String bb = editText2.getText().toString();
//        int y = Integer.parseInt(bb);
//    }
View.OnClickListener onClickListener = new View.OnClickListener() {

    @Override
    public void onClick(View view) {
        String bc=TextView_1.getText().toString();
        switch (view.getId()) {
            case R.id.BT_0:
                bc+="0";
                t =BT_0.getText().toString();
                c = c + t;
                d =BT_0.getText().toString();
                d3 =BT_0.getText().toString();
                cc = cc + d;
                dSan= dSan + d;
                TextView_1.setText(bc);
                break;
            case R.id.BT_1:
                bc += "1";
                t =BT_1.getText().toString();
                c = c + t;
                d =BT_1.getText().toString();
                d3 =BT_1.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_2:
                bc += "2";
                t =BT_2.getText().toString();
                c = c + t;
                d =BT_2.getText().toString();
                d3 =BT_2.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_3:
                bc += "3";
                t =BT_3.getText().toString();
                c = c + t;
                d =BT_3.getText().toString();
                d3 =BT_3.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_4:
                bc += "4";
                t =BT_4.getText().toString();
                c = c + t;
                d =BT_4.getText().toString();
                d3 =BT_4.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_5:
                bc += "5";
                t =BT_5.getText().toString();
                c = c + t;
                d =BT_5.getText().toString();
                d3 =BT_5.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_6:
                bc += "6";
                t =BT_6.getText().toString();
                c = c + t;
                d =BT_6.getText().toString();
                d3 =BT_6.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_7:
                bc += "7";
                t =BT_7.getText().toString();
                c = c + t;
                d =BT_7.getText().toString();
                d3 =BT_7.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_8:
                bc += "8";
                t =BT_8.getText().toString();
                c = c + t;
                d =BT_8.getText().toString();
                d3 =BT_8.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_9:
                bc += "9";
                t =BT_9.getText().toString();
                c = c + t;
                d =BT_9.getText().toString();
                d3 =BT_9.getText().toString();
                cc = cc + d;
                dSan= dSan + d3;
                TextView_1.setText(bc);
                break;
            case R.id.BT_CHENG:
                if(bc.length() != 0){
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;
                    bc+="*";
                    if (dYi.equals("")){//  fuhao 1   dyi you   cc = ""
                        dYi = "" + c;
                        cc = "";
                    }
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;

                    if (dYi.length() != 0){

                        dEr = "" + cc;
                        d3 = "";
                    }

                    if (dYi.length() != 0){

                        dSan = "" + d3;
                    }
//                    dEr = "";
//                    dSan = "";
                    if (hs.equals("")) {
                        hs = "*";
                    }
                    if (hs.length() != 0){
                        hs2 = "*";
                    }

                    TextView_2.setText(bc);
                    TextView_1.setText(null);
                }break;
            case R.id.BT_CHU:
                if(bc.length() != 0){
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;
                    bc+="/";
                    if (dYi.equals("")){
                        dYi = "" + c;
                        cc = "";
                    }
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;

                    if (dYi.length() != 0){

                        dEr = "" + cc;
                        d3 = "";
                    }

                    if (dYi.length() != 0){

                        dSan = "" + d3;
                    }
//                    dEr = "";
//                    dSan = "";
                    if (hs.equals("")) {
                        hs = "/";
                    }
                    if (hs.length() != 0){
                        hs2 = "/";
                    }

                    TextView_2.setText(bc);
                    TextView_1.setText(null);
                }break;
            case R.id.BT_JIA:
                if(bc.length() != 0){
                    bc+="+";
                    if (dYi.equals("")){
                        dYi = c;
                        cc = "";
                    }
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;

                    if (dYi.length() != 0){

                        dEr = "" + cc;
                        d3 = "";
                    }

                    if (dYi.length() != 0){

                        dSan = "" + d3;
                    }

                    if (hs.equals("")) {
                        hs = "+";
                    }
                    if (hs.length() != 0){
                        hs2 = "+";

                    }

                    TextView_2.setText(bc);
                    TextView_1.setText(null);
                }break;
            case R.id.BT_JIAN:
                if(bc.length() != 0){
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;
                    bc+="-";
                    if (dYi.equals("")){
                        dYi = "" + c;
                        cc = "";
                    }
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;

                    if (dYi.length() != 0){

                        dEr = "" + cc;
                        d3 = "";
                    }

                    if (dYi.length() != 0){

                        dSan = "" + d3;
                    }
//                    dEr = "";
//                    dSan = "";
                    if (hs.equals("")) {
                        hs = "-";
                    }
                    if (hs.length() != 0){
                        hs2 = "-";
                    }

                    TextView_2.setText(bc);
                    TextView_1.setText(null);
                }break;
            case R.id.BT_JIAJIAN:
                String fus = "";
                String qqq;
                fus = TextView_1.getText().toString();
                if (!fus.equals("") && !fus.equals("0")) {
                    double fu = Double.parseDouble(fus);
                    fu = fu * -1;
                    if (fu % 1 == 0) {
                        xx = (int) fu;
                        qqq = "" + xx;
                        TextView_1.setText(qqq);

                    }
                    if (fu % 1 != 0) {
                        qqq = "" + fu;
                        TextView_1.setText(qqq);
                    }
                }

//                d =BT_JIAJIAN.getText().toString();
                if (!c.equals("")){
                    double a1 = Double.parseDouble(c);
                    a1 = a1 * -1;
                    if (a1 % 1 == 0) {
                        int a11 = (int) a1;
                        c = "" + a11;


                    }
                    if (a1 % 1 != 0) {
                        c = "" + a1;

                    }

                }


                if (!cc.equals("") ){
                    double a2 = Double.parseDouble(cc);
                    a2 = a2 * -1;
                    if (a2 % 1 == 0) {
                        int a12 = (int) a2;
                        cc = "" + a2;


                    }
                    if (a2 % 1 != 0) {
                        cc = "" + a2;

                    }
                }

                if (!dSan.equals("") ){
                    double a3 = Double.parseDouble(dSan);
                    a3 = a3 * -1;
                    if (a3 % 1 == 0) {
                        int a13 = (int) a3;
                        dSan = "" + a13;


                    }
                    if (a3 % 1 != 0) {
                        dSan = "" + a3;

                    }
                }

                break;
            case R.id.BT_DENG:
//                if(q==null||q.equals(""))
//                    return;
//                if(!q.contains(""))
//                    return;
//                if (f == "+") {
//                    int x = Integer.parseInt(t);
//                    int y = Integer.parseInt(d);
//                    int z = x + y;
//                    q = "" + z;
//                }TextView_1.setText(q);
                if (dEr.equals("")) {
                    hs2 = "=";


                    if (dYi.length() != 0) {

                        dEr = "" + cc;
                        d3 = "";
                        Forzz2_();
                    }

                }

                if (!dEr.equals("")) {

                    Forzz_();
                }

//                if (dYi.length() == 0){
//                    dYi = "" + c;
//                    cc = "";
//                }
//                    t=TextView_1.getText().toString();
//                    dYi = "" + t;
//
//                if (dYi.length() != 0){
//
//                    dEr = "" + cc;
//                }



                TextView_2.setText(null);
                break;
            case R.id.BT_DIAN:
                if(bc.length() != 0 ){
                    bc+=".";
                    t =BT_DIAN.getText().toString();
                    c = c + t;
                    d =BT_DIAN.getText().toString();
                    d3 =BT_DIAN.getText().toString();
                    dSan= dSan + d3;
                    cc = cc + d;
                    TextView_1.setText(bc);
                }break;
            case R.id.BT_YU:
                String ba = "";
                String bai;
                ba = TextView_1.getText().toString();
                if (!ba.equals("") && !ba.equals("0")) {
                    double fu = Double.parseDouble(ba);
                    fu = fu / 100;
                    if (fu % 1 == 0) {
                        xx = (int) fu;
                        bai = "" + xx;
                        TextView_1.setText(bai);

                    }
                    if (fu % 1 != 0) {
                        bai = "" + fu;
                        TextView_1.setText(bai);
                    }
                }

//                d =BT_JIAJIAN.getText().toString();
                if (!c.equals("")){
                    double a1 = Double.parseDouble(c);
                    a1 = a1 / 100;
                    if (a1 % 1 == 0) {
                        int a11 = (int) a1;
                        c = "" + a11;


                    }
                    if (a1 % 1 != 0) {
                        c = "" + a1;

                    }

                }


                if (!cc.equals("") ){
                    double a2 = Double.parseDouble(cc);
                    a2 = a2 / 100;
                    if (a2 % 1 == 0) {
                        int a12 = (int) a2;
                        cc = "" + a2;


                    }
                    if (a2 % 1 != 0) {
                        cc = "" + a2;

                    }
                }

                if (!dSan.equals("") ){
                    double a3 = Double.parseDouble(dSan);
                    a3 = a3 / 100;
                    if (a3 % 1 == 0) {
                        int a13 = (int) a3;
                        dSan = "" + a13;


                    }
                    if (a3 % 1 != 0) {
                        dSan = "" + a3;

                    }
                }

                break;

            case R.id.BT_AC:
                TextView_1.setText(null);
                TextView_2.setText(null);
                dYi = "";
                c = "";
                cc = "";
                d3 = "";
                dEr = "";
                dSan = "";
                hs = "";
                hs2 = "";
                break;

        }
    }

};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView_1 = findViewById(R.id.TextView_1);
        TextView_2 = findViewById(R.id.TextView_2);
        BT_0=(Button)findViewById(R.id.BT_0);
        BT_1=(Button)findViewById(R.id.BT_1);
        BT_2=(Button)findViewById(R.id.BT_2);
        BT_3=(Button)findViewById(R.id.BT_3);
        BT_4=(Button)findViewById(R.id.BT_4);
        BT_5=(Button)findViewById(R.id.BT_5);
        BT_6=(Button)findViewById(R.id.BT_6);
        BT_7=(Button)findViewById(R.id.BT_7);
        BT_8=(Button)findViewById(R.id.BT_8);
        BT_9=(Button)findViewById(R.id.BT_9);
        BT_JIA=(Button)findViewById(R.id.BT_JIA);
        BT_JIAN=(Button)findViewById(R.id.BT_JIAN);
        BT_CHENG=(Button)findViewById(R.id.BT_CHENG);
        BT_CHU=(Button)findViewById(R.id.BT_CHU);
        BT_JIAJIAN=(Button)findViewById(R.id.BT_JIAJIAN);
        BT_AC=(Button)findViewById(R.id.BT_AC);
        BT_YU=(Button)findViewById(R.id.BT_YU);
        BT_DENG=(Button)findViewById(R.id.BT_DENG);
        BT_DIAN=(Button)findViewById(R.id.BT_DIAN);


        BT_0.setOnClickListener(onClickListener);
//        findViewById(R.id.BT_0).setOnClickListener(onClickListener);
        BT_1.setOnClickListener(onClickListener);
        BT_2.setOnClickListener(onClickListener);
        BT_3.setOnClickListener(onClickListener);
        BT_4.setOnClickListener(onClickListener);
        BT_5.setOnClickListener(onClickListener);
        BT_6.setOnClickListener(onClickListener);
        BT_7.setOnClickListener(onClickListener);
        BT_8.setOnClickListener(onClickListener);
        BT_9.setOnClickListener(onClickListener);
        BT_JIAJIAN.setOnClickListener(onClickListener);
        BT_JIA.setOnClickListener(onClickListener);
        BT_JIAN.setOnClickListener(onClickListener);
        BT_DIAN.setOnClickListener(onClickListener);
        BT_DENG.setOnClickListener(onClickListener);
        BT_CHU.setOnClickListener(onClickListener);
        BT_CHENG.setOnClickListener(onClickListener);
        BT_YU.setOnClickListener(onClickListener);
        BT_AC.setOnClickListener(onClickListener);





//        textView = (TextView) findViewById(R.id.textView_1);





//        textView = (TextView) findViewById(R.id.textView_1);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView.setText("0");
//            }
//        });
//       IF_();
//        SW_();
//        Foree_();
//          while1_();
//             while_();
//               For_();
//                  Forzz_();
//                  aaa();
//        Forxx_();
//            Forcc_();
//        aaa();
//        bbb();
//        ForLX_();
//Forlx_();
//        ForLX2_();
//        ForLX3_();
//        ForLX4_();
//        ForLX5_();
//        ForLX5_2_();
//        ForLX6_(); /
//        ForLX7_();
//        ForLX8_();
//        ForLX9_();
//        ForLX10_();
//        ForLX11_();
//            ggg();
    }

    int a = 100;

    //    int b = a  / 10;
    private void IF_() {
        if (a > 100 || a < 0) {
            Log.d("textAA", "输入错误: " + a);
        } else if (a >= 70) {
            Log.d("textAA", "良: ");

        } else if (a >= 80) {
            Log.d("textAA", "优秀: ");

        } else if (a >= 60) {
            Log.d("textAA", "及格: ");

        } else if (a < 60) {

            Log.d("textAA", "不及格: ");
        }
    }

    int a2 = 100;
    int b2 = a2 / 10;

    private void SW_() {
        if (a2 > 100 || a2 < 0) {
            Log.d("textAA", "输入错误 ");
        } else {
            switch (a2 / 10) {
                case 10:
                case 9:
                case 8:
//                    if (a2 <= 10) {
                    Log.d("textAA", "优秀");
//        }
                    break;
                case 7:
                    Log.d("textAA", "良");
                    break;
                case 6:
                    Log.d("textAA", "及格");
                    break;

                default:
//                    if (a2 >= 0 ) {
                    Log.d("textAA", "不及格");
//                    }
                    break;
            }
        }
    }

    private void while_() {
        int i = 0;
        int n = 0;
        while (i <= 10000) {
            n = n + i;
            i++;
        }
        Log.d("KKK", "n:" + n);

    }


    private void while1_() {
        int s = 0;
        int h = 0;
        do {
            h = s + h;
            s++;
        } while (s <= 10000);
        Log.d("QH", "h= " + h);
    }


    private void Foree_() {
        for (int e = 1; e <= 10; e++) {
            if (e % 2 != 0) {
                continue;
            }
            Log.d("EE", "J=" + e);
        }
    }

    ;

    private void For_() {
        int e;
        boolean yy;
        for (int d = 2; d <= 100; d++) {
            yy = true;//1

            //2
            for (int f = 2; f < d; f++) {

                //2-1
                if (d % f == 0) {

                    yy = false;
                    break;
                }

            }

            //3
            if (yy == true) {
                Log.d("QWER", "d的值" + d);
//                if (d >= 10){
//                    Log.d("QWER", "d的值"+d);
//
//                    break;

//                }
            }

        }


    }


    private void Forzz_(String aaa) {
        int z1 = 6;
        int z2 = 9;

        for (int h = 1; h <= z1 * z2; h++) {
            if (h % z1 == 0 && h % z2 == 0) {
                Log.d("HHH", "H=" + h);
                break;
            }
        }
    }


    private void Forxx_() {
        String a = "";
//        String b="";

        for (int i = 0; i < 5; i++) {

            for (int j = 1; j <= 5; j++) {
                a = a + "*";

            }
            a = a + "\n";

        }
        Log.d("7410", "a的结果" + "\n" + a);
    }

    public void Forcc_() {
        String x = "";
        for (int t = 1; t <= 5; t++) {
            for (int y = 1; y <= t; y++) {
                x = x + "*";

            }
            x = x + "\n";
        }
        Log.d("SD", "x的值：" + "\n" + x);


    }


    private void Forlx_() {
        String t = "";
        String q = " ";
        int k = 7;
        for (int x = 1; x <= k; x++) {
            if (x < 4) {
                for (int y = 1; y <= x * 2 - 1; y++) {
                    if (x == 1) {
                        t = t + q + q + "*";
                    } else if (x == 2 && y == 1) {
                        t = t + q + "*";
                    } else if (x == 2 && y <= 3) {
                        t = t + "*";
                    } else {
                        t = t + "*";
                    }
                }
            } else
                for (int y = x * 2; y <= 10; y++) {
                    if (x == 4 && y == 8) {
                        t = t + q + "*";
                    } else if (x == 4 && y <= 10) {
                        t = t + "*";
                    } else {
                        t = t + q + q + "*";
                    }
                }
            t = t + "\n";
        }
        Log.d("LX1", "t的值：" + "\n" + t);
    }


    private void ForLX_() {
        int h = 5;
        String t = "";
        String q = " ";
        for (int x = 1; x <= h; x++) {
            if (x < 4) {
                for (int y = 1; y <= x; y++) {
                    if (x == 1) {
                        t = t + q + q + q + "*";
                    } else if (x == 2 && y == 1) {
                        t = t + q + q + "*";
                    } else if (x == 2 && y <= 2) {
                        t = t + q + "*";
                    } else {
                        t = t + q + "*";
                    }
                }
            } else
                for (int y = x; y <= h; y++) {

                    if (x == h - 1 && y == 4) {
                        t = t + q + q + "*";
                    } else if (x == 4 && y <= 5) {
                        t = t + q + "*";
                    } else {
                        t = t + q + q + q + "*";
                    }
                }
            t = t + "\n";
        }
        Log.d("LX1", "t的值：" + "\n" + t);
    }


    private void ForLX2_() {

        int l;
        int a = 1;
        int b = 0;
        int s = 0;
        for (l = 1; l <= 5; l++) {
            b = a;//1   //1   //0   //1   //1   //2   //3
            a = s;//0   //0   //1   //1   //2   //3   //5
            s = a + b;  //1   //1   //2   //3   //5   //8
            Log.d("LX2", "ForLX2_（" + l + "）: " + s);
        }

    }


    private void ForLX3_() {
        boolean t;
        for (int a = 100; a <= 200; a++) {
            t = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    t = false;
                    break;
                }
            }
            if (t == true) {
                Log.d("LX3", "d的值" + a);
            }
        }
    }


    private void ForLX4_() {
//        int h;
//        for (int a = 0;a < 10;a++){
//            for (int b = 0;b < 10;b++){
//                for (int c = 0;c < 10;c++){
//                    if (a*a*a+b*b*b+c*c*c==a*100+b*10+c){
//                        h=a*100+b*10+c;
//
//                        Log.d("LX4", "h:"+h);
//
//                    }
//                }
//            }
//        }
        int b_100;
        int s_10;
        int g_1;

        for (int a = 100; a < 1000; a++) {
            b_100 = a / 100;
            s_10 = a % 100 / 10;
            g_1 = a % 10;
            if (a == b_100 * b_100 * b_100 + s_10 * s_10 * s_10 + g_1 * g_1 * g_1) {
                Log.d("LX4", "ForLX4_: " + a);
            }
        }


    }


    private void ForLX5_() {
        int a = 2;
        int h = 0;
        int t = 1;
        int o = 0;
        for (int b = 1; b <= a; b++) {
            if (b == 1) {
                h = h + a;
            } else {
                t = t * 10 + 1;
                h = a * t;
            }
            o = o + h;
            Log.d("LX5", "a: " + o);
        }
    }


    private void ForLX5_2_() {
        int a = 5;
        int f = 3;
        int h = 0;
        int t = 1;
        int o = 0;

        for (int b = 1; b <= f; b++) {
            if (b == 1) {
                h = h + a;
            } else {
                t = t * 10 + 1;
                h = a * t;
            }
            o = o + h;
            Log.d("LX5", "a: " + o);
        }
    }

    private void ForLX6_() {
        double h = 0;//求总和
        double x = 1000;//初始值1000米
        double q = 0;//每次x值变量
        for (int a = 1; a <= 20; a++) {//循环次数
            h = h + x + x / 2;//1500//1500+500+250
            x = x / 2;//500
// h = 0;
//1000+500  h = 1500;
// +500+250  h = 2250;
// +250+125  h = 2625
//            h = h + x;//初始1000米
//            x = x / 2;//每次回弹一半
//            q = 2 * x;//下落与回弹各一次，所以x*2
//            h = h + x ;//每次经过米数总和
        }
//        h = h - x - q ;//总和减去初始x=1000米的回弹与最后一次回弹q的值
        Log.d("LX6", "第20次下落了" + x);//最后一次回弹和下落数值一样，输出q的值代表下落米数

        Log.d("LX6", "经过了" + h);//输出总经过米数H的值
    }


    private void ForLX7_() {
        int x;
        int y;
        int z;
        int q = 0;
        for (x = 1; x < 5; x++) {
            for (y = 1; y < 5; y++) {
                for (z = 1; z < 5; z++) {
                    if (x == y || x == z || y == z) {
                        continue;
                    }
                    q = x * 100 + y * 10 + z;
                    Log.d("LX7", "ForLX7_: " + q);

                }
            }
        }

    }


    private void ForLX8_() {
        int a = -989;
        int b = 0;
        int c = 556;
        if (a < b && a < c) {
            if (b > c) {
                Log.d("LX8", a + "<" + c + "<" + b);
            } else {
                Log.d("LX8", a + "<" + b + "<" + c);
            }
        }
        if (b < a && b < c) {
            if (a > c) {
                Log.d("LX8", b + "<" + c + "<" + a);
            } else {
                Log.d("LX8", b + "<" + a + "<" + c);
            }
        }
        if (c < a && c < b) {
            if (a > b) {
                Log.d("LX8", c + "<" + b + "<" + a);
            } else {
                Log.d("LX8", c + "<" + a + "<" + b);
            }
        }
    }


    private void ForLX9_() {
        int x = 1;
        int y = 1;
        int j = 0;
        String t = "";
        String d = " ";

        for (x = 1; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                j = y * x;
                t = t + ""+ y + ""+ "*" + "" + x + "" + "=" + " " + j + d;
            }t = t + "\n";
        }
        Log.d("LX9","99乘法表：" + "\n" + t);

    }



    private void ForLX10_() {
        int x = 1;//
        for (int a = 1; a <= 10; a++) {
            x =  (x + 1) * 2;//n  = (x + 1) * 2
            Log.d("LX10", "ForLX10_: " + x);

        }
        Log.d("LX10", "ForLX10_: " + x);
    }




    private void ForLX11_(){
        int x = 0;    //x=1  y=0  h=1   2.3.5   ;  x=0  y=1  h=1   1.2.3
        int y = 1;
        int h = 1;
        int a20;
        double aa = 0;
        int bb = 1;
        int cc = 1;
        for (a20 = 1; a20 <= 20; a20++) {
             y = x;
            x = h;
            h = x + y;
            double dd = (double) ( h + x ) / h;
            aa = aa + dd;
//            Log.d("LX11", "ForLX2_（" + a20 + "）: " + aa);
            bb = bb * ( h + x );
            cc = cc * h ;
//            Log.d("LX11", "ForLX2_（" + a20 + "）: " + aa);
            Log.d("LX11", "ForLX2_（" + a20 + "）: " + bb + "/" + cc);

        }
//        Log.d("LX11", "ForLX2_（" + a20 + "）: " + bb + "/" + cc);

//        Log.d("LX11", "ForLX2_（" + a20 + "）: " + aa);
    }
}




//方法二：实现匿名内部类。这种方法适合只希望对监听器进行一次性使用的情况，在该代码块运行完毕之后，该监听器也就不复存在了。
//
//    bt1.setOnClickListener(new View.OnClickListener() {
////@Override
////public void onClick(View v) {
////        Toast.makeText(MainActivity.this,"you have clicked Button1",Toast.LENGTH_SHORT).show();
////        }
//        });

//方法三：利用布局文件中的onClick属性，并在实现文件中实现该方法。注意的是这里的方法名应该和布局文件中onClick属性的方法名相同，该方法必须是public方法。
//
//// 方法三，注意需要public方法
//public void onButtonClick (View view){
//        Toast.makeText(MainActivity.this,"you have clicked Button3",Toast.LENGTH_SHORT).show();
//        }
//        }



//    double num1=1,num2=1;
//    double Result=1;//计算结果
//    int op=1;//判断操作数，
//    boolean isClickEqu=false;//判断是否按了“=”按钮




//    int op=0;//判断操作数，
//boolean isClickEqu=false;//判断是否按了“=”按钮




























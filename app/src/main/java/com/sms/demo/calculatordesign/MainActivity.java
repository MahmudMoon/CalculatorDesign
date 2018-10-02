package com.sms.demo.calculatordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String v1,v2,v3;

    TextView monitor,operatr;
    TextView pre_value;

    Button btnclear,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnmul,btndiv,btneql,
            btncls,btndecimal,btnpercent;
    Button[] btn_Numbers,btn_operators,btn_clean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_listener();
        init_functions();
    }


    private void init_functions() {
        enableNumbers();
        disableOperators();
        enableClean();
        disableEqual();

    }

    private void enableEqual() {
      btneql.setBackgroundColor(getResources().getColor(R.color.green));
      btneql.setClickable(true);
    }

    private void disableEqual() {
        btneql.setBackgroundColor(getResources().getColor(R.color.yellow));
        btneql.setClickable(false);
    }

    private void disableOperators() {
        for(int i = 0;i<btn_operators.length;i++){
            btn_operators[i].setBackgroundColor(getResources().getColor(R.color.yellow));
            btn_operators[i].setClickable(false);
        }
    }

    private void enableOperators() {
        for(int i = 0;i<btn_operators.length;i++){
            btn_operators[i].setBackgroundColor(getResources().getColor(R.color.green));
            btn_operators[i].setClickable(true);
        }
    }

    private void disableNumberss() {
        for(int i = 0;i<btn_Numbers.length;i++){
            btn_Numbers[i].setBackgroundColor(getResources().getColor(R.color.yellow));
            btn_Numbers[i].setClickable(false);
        }


    }



    public void enableClean(){
        for(int i =0;i<btn_clean.length;i++){
            btn_clean[i].setBackgroundColor(getResources().getColor(R.color.green));
            btn_clean[i].setClickable(true);
        }

    }
    public void disableClean(){
        for(int i = 0;i<btn_clean.length;i++){
            btn_clean[i].setBackgroundColor(getResources().getColor(R.color.yellow));
            btn_clean[i].setClickable(false);
        }

    }

    private void enableNumbers() {
        for(int i = 0;i<btn_Numbers.length;i++){
            btn_Numbers[i].setBackgroundColor(getResources().getColor(R.color.green));
            btn_Numbers[i].setClickable(true);
        }
    }

    private void init_listener() {

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btndecimal.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                disableEqual();
                disableOperators();
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn0.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
            }
        });
       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn1.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);;
                disableOperators();
                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn2.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                disableOperators();
                if(v1!=""){
                    enableEqual();
                }else {
                    disableEqual();
                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn3.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn4.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn5.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);
                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn6.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);

                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn7.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);

                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();

                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn8.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);

                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();

                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn9.getText().toString();
                String temp = monitor.getText().toString();
                temp += x;
                monitor.setText(temp);

                if(v1!=""){
                    enableEqual();
                    disableOperators();
                }else {
                    disableEqual();
                    enableOperators();
                }
//                if(v1.equals("")){
//                    v1 = x;
//                }else
//                    v3 = x;
            }
        });




        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnplus.getText().toString();
                String temp = monitor.getText().toString();
                monitor.setText("");
                operatr.setText(x);
               // operatr.setBackgroundColor(getResources().getColor(R.color.colorAccent));

                Log.i("RES",temp);
                if(!TextUtils.isEmpty(temp)) {
                    if (v1.equals("")) {
                        v1 = temp;
                    } else {
                        v2 = temp;
                        double fst = Double.parseDouble(v1);
                        double sec = Double.parseDouble(v2);
                        v1 = String.valueOf(fst + sec);
                        Log.i("RES",v1);
                        pre_value.setText("Previous_result : " + v1);
                        v2 = "";


                    }
                }
                v3 = x;
                disableOperators();
                enableNumbers();
                disableEqual();
               // monitor.setText("");

            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnminus.getText().toString();
                String temp = monitor.getText().toString();
                monitor.setText("");
                operatr.setText(x);
                //operatr.setBackgroundColor(getResources().getColor(R.color.yellow));

                Log.i("RES",temp);
                if(!TextUtils.isEmpty(temp)) {
                    if (v1.equals("")) {
                        v1 = temp;
                    } else {
                        v2 = temp;
                        double fst = Double.parseDouble(v1);
                        double sec = Double.parseDouble(v2);
                        v1 = String.valueOf(fst - sec);
                        Log.i("RES",v1);
                        pre_value.setText("Previous_result : " + v1);
                        v2 = "";


                    }
                }
                v3 = x;
                disableOperators();
                enableNumbers();
                disableEqual();

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btndiv.getText().toString();
                String temp = monitor.getText().toString();
                monitor.setText("");
                operatr.setText(x);
                //operatr.setBackgroundColor(getResources().getColor(R.color.green));

                Log.i("RES",temp);
                if(!TextUtils.isEmpty(temp)) {
                    if (v1.equals("")) {
                        v1 = temp;
                    } else {
                        v2 = temp;
                        double fst = Double.parseDouble(v1);
                        double sec = Double.parseDouble(v2);
                        v1 = String.valueOf(fst / sec);
                        Log.i("RES",v1);
                        pre_value.setText("Previous_result : " + v1);
                        v2 = "";


                    }
                }
                v3 = x;
                disableOperators();
                enableNumbers();
                disableEqual();
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnmul.getText().toString();
                String temp = monitor.getText().toString();
                monitor.setText("");
                operatr.setText(x);
               // operatr.setBackgroundColor(getResources().getColor(R.color.green));

                Log.i("RES",temp);
                if(!TextUtils.isEmpty(temp)) {
                    if (v1.equals("")) {
                        v1 = temp;
                    } else {
                        v2 = temp;
                        double fst = Double.parseDouble(v1);
                        double sec = Double.parseDouble(v2);
                        v1 = String.valueOf(fst * sec);
                        Log.i("RES",v1);
                        pre_value.setText("Previous_result : " + v1);
                        v2 = "";


                    }
                }
                v3 = x;
                disableOperators();
                enableNumbers();
                disableEqual();

            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnpercent.getText().toString();
                String temp = monitor.getText().toString();
                monitor.setText("");
                operatr.setText(x);
                if(!TextUtils.isEmpty(temp)) {
                    if (v1.equals("")) {
                        v1 = temp;
                    } else {
                        v2 = temp;
                        double fst = Double.parseDouble(v1);
                        double sec = Double.parseDouble(v2);
                        int f = (int) fst;
                        int s = (int) sec;
                        int r = f % s;

                        v1 = String.valueOf(r);
                        pre_value.setText("Previous_result : " + v1);
                        v2 = "";


                    }
                }
                v3 = x;
                disableOperators();
                enableNumbers();
                disableEqual();




            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = monitor.getText().toString();
                if(v1.equals("")){
                    v1 = temp;
                }else
                    v2 = temp;

                monitor.setText("");
                operatr.setText("=");

                if(v1!="" && v2!= "" && v3!="") {
//                    int fst = Integer.parseInt(v1);
//                    int sec = Integer.parseInt(v3);


                    double fst = Double.parseDouble(v1);
                    double sec = Double.parseDouble(v2);

                    switch (v3) {
                        case "+":
                            double res = fst + sec;
                            String res_str = Double.toString(res);
                            monitor.setText(res_str);
                            break;

                        case "-":
                            double res_minus = fst - sec;
                            String res_str_minus = Double.toString(res_minus);
                            monitor.setText(res_str_minus);
                            break;

                        case "*":
                            double res_mul = fst * sec;
                            String res_str_mul = Double.toString(res_mul);
                            monitor.setText(res_str_mul);
                            break;

                        case "/":
                            double res_div = fst / sec;
                            String res_str_div = Double.toString(res_div);
                            monitor.setText(res_str_div);
                            break;

                        case "%":
                            int f = (int)fst;
                            int s = (int)sec;
                            int r = f%s;
                            monitor.setText(String.valueOf(r));
                            break;

                        default:
                            break;
                    }

                   v1 = monitor.getText().toString().trim();
                    v2 = "";
                    v3 = "";
                    pre_value.setText("Previous res: "+v1);
                    monitor.setText("");
                    enableOperators();
                    enableClean();
                    disableNumberss();
                    disableEqual();
                }

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnclear.getText().toString();
                monitor.setText("");
                v1 = "";
                v2 = "";
                v3 = "";
                pre_value.setText("Previous res: ");
                disableOperators();
                disableClean();
                enableNumbers();
            }
        });

        btncls.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(monitor.getText().toString().length()>0){
                   monitor.setText("");
                   disableOperators();
                   enableNumbers();
                }
            }
        });
    }

    private void init_variables() {
        v1 = "";
        v2 = "";
        v3 = "";

        btn_operators = new Button[5];
        btn_Numbers = new Button[11];
        btn_clean = new Button[2];

        btn_Numbers[0] = btn0;
        btn_Numbers[1] = btn1;
        btn_Numbers[2] = btn2;
        btn_Numbers[3] = btn3;
        btn_Numbers[4] = btn4;
        btn_Numbers[5] = btn5;
        btn_Numbers[6] = btn6;
        btn_Numbers[7] = btn7;
        btn_Numbers[8] = btn8;
        btn_Numbers[9] = btn9;
        btn_Numbers[10] = btndecimal;

        btn_operators[0] = btnplus;
        btn_operators[1] = btnminus;
        btn_operators[2] = btnmul;
        btn_operators[3] = btndiv;
        btn_operators[4] = btnpercent;

        btn_clean[0] = btnclear;
        btn_clean[1] = btncls;


    }

    private void init_views() {
        monitor = (TextView)findViewById(R.id.monitor);
        operatr = (TextView)findViewById(R.id.operators);
        pre_value = (TextView)findViewById(R.id.previous_result);
        btn0 = (Button)findViewById(R.id.btn_zero);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);
        btnplus = (Button)findViewById(R.id.btn_plus);
        btnminus = (Button)findViewById(R.id.btn_minus);
        btndiv = (Button)findViewById(R.id.btn_div);
        btnmul = (Button)findViewById(R.id.btn_star);
        btndecimal = (Button)findViewById(R.id.btn_Dot);
        btneql = (Button)findViewById(R.id.btn_Equal);
        btncls = (Button)findViewById(R.id.btn_X);
        btnpercent = (Button)findViewById(R.id.btn_percentage);
        btnclear = (Button)findViewById(R.id.btn_Clear);
    }
}

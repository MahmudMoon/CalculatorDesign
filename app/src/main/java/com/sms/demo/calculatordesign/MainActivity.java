package com.sms.demo.calculatordesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String v1,v2,v3;

    TextView monitor;
    Button btnclear,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnminus,btnmul,btndiv,btneql,btncls,btndecimal,btnpercent;
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

    }

    private void init_listener() {
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String x = btn1.getText().toString();
               monitor.setText(x);
               if(v1.equals("")){
                   v1 = x;
               }else
                   v3 = x;
           }
       });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn2.getText().toString();
                monitor.setText(x);
                if(v1.equals("")){
                    v1 = x;
                }else
                    v3 = x;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btn3.getText().toString();
                monitor.setText(x);
                if(v1.equals("")){
                    v1 = x;
                }else
                    v3 = x;
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnplus.getText().toString();
                monitor.setText(x);
                v2 = x;
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnminus.getText().toString();
                monitor.setText(x);
                v2 = x;

            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btndiv.getText().toString();
                monitor.setText(x);
                v2 = x;

            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnmul.getText().toString();
                monitor.setText(x);
                v2 = x;

            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String x = btn1.getText().toString();
                monitor.setText("");

                int fst = Integer.parseInt(v1);
                int sec = Integer.parseInt(v3);




                switch (v2){
                    case "+":
                        int res = fst+sec;
                        String res_str = Integer.toString(res);
                        monitor.setText(res_str);
                        break;

                    case "-":
                        int res_minus = fst-sec;
                        String res_str_minus = Integer.toString(res_minus);
                        monitor.setText(res_str_minus);
                        break;

                    case "*":
                        int res_mul = fst*sec;
                        String res_str_mul = Integer.toString(res_mul);
                        monitor.setText(res_str_mul);
                        break;

                    case "/":
                        int res_div = fst/sec;
                        String res_str_div = Integer.toString(res_div);
                        monitor.setText(res_str_div);
                        break;

                        default:
                            break;
                }

                init_variables();

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = btnclear.getText().toString();
                monitor.setText("");
            }
        });
    }

    private void init_variables() {
        v1 = "";
        v2 = "";
        v3 = "";
    }

    private void init_views() {
        monitor = (TextView)findViewById(R.id.monitor);
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

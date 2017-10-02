package com.example.user.calci;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;
    EditText e1;
    Boolean add, sub, mul, div;
    float g, h, k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.e1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String a;
        int x = 0, y, z, p, q, r, s, t, u, w;
        if (v == b1) {
            a = (String) b1.getText();
            e1.append(a);
            x = Integer.parseInt(String.valueOf(a));
        }
        if (v == b2) {
            a = (String) b2.getText();
            e1.append(a);
            x = Integer.parseInt(String.valueOf(a));

        }
        if (v == b3) {
            a = (String) b3.getText();
            e1.append(a);
            z = Integer.parseInt(String.valueOf(a));

        }
        if (v == b4) {
            if (x==0)
                e1.setText("");
            else {
                add = true;
                g = x;
                e1.setText("");
            }

            }
            if (v == b6) {
                a = (String) b6.getText();
                e1.append(a);
                p = Integer.parseInt(String.valueOf(a));

            }
            if (v == b7) {
                a = (String) b7.getText();
                e1.append(a);
                q = Integer.parseInt(String.valueOf(a));

            }
            if (v == b8) {
                a = (String) b8.getText();
                e1.append(a);
                r = Integer.parseInt(String.valueOf(a));

            }
            if (v == b9) {
                a = (String) b9.getText();
                e1.append(a);
            }
            if (v == b10) {
                a = (String) b10.getText();
                e1.append(a);
                s = Integer.parseInt(String.valueOf(a));

            }
            if (v == b11) {
                a = (String) b11.getText();
                e1.append(a);
                t = Integer.parseInt(String.valueOf(a));

            }
            if (v == b12) {
                a = (String) b12.getText();
                e1.append(a);
                u = Integer.parseInt(String.valueOf(a));

            }
            if (v == b13) {
                a = (String) b13.getText();
                e1.append(a);
            }
            if (v == b14) {
                a = (String) b14.getText();
                e1.append(a);
                w = Integer.parseInt(String.valueOf(a));

            }
            if (v == b15) {
                a = (String) b15.getText();
                e1.append(a);
            }
            if (v == b16) {
                if (add == true) {
                    h = x;
                    k = g + h;
                    e1.setText(String.valueOf(k));

                }
                if (v == b17) {
                    a = (String) b17.getText();
                    e1.append(a);
                }


            }
        }

    }


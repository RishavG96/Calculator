package rcpl.com.calculator;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String s, s1, s2;
    int i, i1;
    int result,flag=0;
    RelativeLayout rl;
    ToggleButton tb;
    EditText et;
    TextView tv1, tv2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (RelativeLayout) findViewById(R.id.rl);
        tb = (ToggleButton) findViewById(R.id.toggleButton2);
        et = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView4);
        tv2 = (TextView) findViewById(R.id.textView5);
        b1 = (Button) findViewById(R.id.button5);
        b2 = (Button) findViewById(R.id.button22);
        b3 = (Button) findViewById(R.id.button23);
        b4 = (Button) findViewById(R.id.button24);
        b5 = (Button) findViewById(R.id.button25);
        b6 = (Button) findViewById(R.id.button26);
        b7 = (Button) findViewById(R.id.button27);
        b8 = (Button) findViewById(R.id.button28);
        b9 = (Button) findViewById(R.id.button29);
        b10 = (Button) findViewById(R.id.button30);
        b11 = (Button) findViewById(R.id.button31);
        b12 = (Button) findViewById(R.id.button32);
        b13 = (Button) findViewById(R.id.button33);
        b14 = (Button) findViewById(R.id.button34);
        b15 = (Button) findViewById(R.id.button35);
        b16 = (Button) findViewById(R.id.button36);
        b17 = (Button) findViewById(R.id.button37);
        tb.setOnClickListener(this);
        et.setOnClickListener(this);
        tv2.setOnClickListener(this);
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
        et.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        b4.setVisibility(View.INVISIBLE);
        b5.setVisibility(View.INVISIBLE);
        b6.setVisibility(View.INVISIBLE);
        b7.setVisibility(View.INVISIBLE);
        b8.setVisibility(View.INVISIBLE);
        b9.setVisibility(View.INVISIBLE);
        b10.setVisibility(View.INVISIBLE);
        b11.setVisibility(View.INVISIBLE);
        b12.setVisibility(View.INVISIBLE);
        b13.setVisibility(View.INVISIBLE);
        b14.setVisibility(View.INVISIBLE);
        b15.setVisibility(View.INVISIBLE);
        b16.setVisibility(View.INVISIBLE);
        b17.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == tb.getId()) {
            if (tb.isChecked()) {
                et.setText("");
                tv2.setText("");
                flag=0;
                s1="";
                s="";
                rl.setBackgroundColor(Color.LTGRAY);
                et.setVisibility(View.VISIBLE);
                tv2.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                b2.setVisibility(View.VISIBLE);
                b3.setVisibility(View.VISIBLE);
                b4.setVisibility(View.VISIBLE);
                b5.setVisibility(View.VISIBLE);
                b6.setVisibility(View.VISIBLE);
                b7.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                b12.setVisibility(View.VISIBLE);
                b13.setVisibility(View.VISIBLE);
                b14.setVisibility(View.VISIBLE);
                b15.setVisibility(View.VISIBLE);
                b16.setVisibility(View.VISIBLE);
                b17.setVisibility(View.VISIBLE);
            } else {
                rl.setBackgroundResource(R.drawable.thinking);
                et.setVisibility(View.INVISIBLE);
                tv2.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                b2.setVisibility(View.INVISIBLE);
                b3.setVisibility(View.INVISIBLE);
                b4.setVisibility(View.INVISIBLE);
                b5.setVisibility(View.INVISIBLE);
                b6.setVisibility(View.INVISIBLE);
                b7.setVisibility(View.INVISIBLE);
                b8.setVisibility(View.INVISIBLE);
                b9.setVisibility(View.INVISIBLE);
                b10.setVisibility(View.INVISIBLE);
                b11.setVisibility(View.INVISIBLE);
                b12.setVisibility(View.INVISIBLE);
                b13.setVisibility(View.INVISIBLE);
                b14.setVisibility(View.INVISIBLE);
                b15.setVisibility(View.INVISIBLE);
                b16.setVisibility(View.INVISIBLE);
                b17.setVisibility(View.INVISIBLE);
            }
        }
        if (v.getId() == b1.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b1.getText().toString());
        }
        if (v.getId() == b2.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b2.getText().toString());
        }
        if (v.getId() == b3.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b3.getText().toString());
        }
        if (v.getId() == b5.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b5.getText().toString());
        }
        if (v.getId() == b6.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b6.getText().toString());
        }
        if (v.getId() == b7.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b7.getText().toString());
        }
        if (v.getId() == b9.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b9.getText().toString());
        }
        if (v.getId() == b10.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b10.getText().toString());
        }
        if (v.getId() == b11.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b11.getText().toString());
        }
        if (v.getId() == b14.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b14.getText().toString());
        }
        if (v.getId() == b15.getId()) {
            tv2.setText("");
            et.setText(et.getText().toString() + b15.getText().toString());
        }
        if (v.getId() == b16.getId()) {
            if (et.getText().toString().equals("")&& s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                flag=1;
                tv2.setText("");
            }
            else if(!et.getText().toString().equals("")&&s!="")
            {
                Toast.makeText(this, "Only 2 numbers at a time!", Toast.LENGTH_SHORT).show();
            }
            else if(s1=="+"||s1=="-"||s1=="*"||s1=="/"||s1=="%")
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s = et.getText().toString();
                i = Integer.parseInt(s);
                et.setText("");
                s1 = "+";
            }
        }
        if (v.getId() == b17.getId()) {
            if (et.getText().toString().equals("")&&s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                flag=1;
                tv2.setText("");
            }
            else if(!et.getText().toString().equals("")&&s!="")
            {
                Toast.makeText(this, "Only 2 numbers at a time!", Toast.LENGTH_SHORT).show();
            }
            else if(s1=="+"||s1=="-"||s1=="*"||s1=="/"||s1=="%")
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s = et.getText().toString();
                i = Integer.parseInt(s);
                et.setText("");
                s1 = "-";
            }
        }
        if (v.getId() == b4.getId()) {
            if (et.getText().toString().equals("")&& s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                flag=1;
                tv2.setText("");
            }
            else if(!et.getText().toString().equals("")&&s!="")
            {
                Toast.makeText(this, "Only 2 numbers at a time!", Toast.LENGTH_SHORT).show();
            }
            else if(s1=="+"||s1=="-"||s1=="*"||s1=="/"||s1=="%")
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s = et.getText().toString();
                i = Integer.parseInt(s);
                et.setText("");
                s1 = "*";
            }
        }
        if (v.getId() == b8.getId()) {
            if (et.getText().toString().equals("")&&s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                flag=1;
                tv2.setText("");
            }
            else if(!et.getText().toString().equals("")&&s!="")
            {
                Toast.makeText(this, "Only 2 numbers at a time!", Toast.LENGTH_SHORT).show();
            }
            else if(s1=="+"||s1=="-"||s1=="*"||s1=="/"||s1=="%")
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s = et.getText().toString();
                i = Integer.parseInt(s);
                et.setText("");
                s1 = "/";
            }
        }
        if (v.getId() == b12.getId()) {
            if (et.getText().toString().equals("")&&s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                flag=1;
                tv2.setText("");
            }
            else if((!et.getText().toString().equals(""))&&s!="")
            {
                Toast.makeText(this, "Only 2 numbers at a time!", Toast.LENGTH_SHORT).show();
            }
            else if(s1=="+"||s1=="-"||s1=="*"||s1=="/"||s1=="%")
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s = et.getText().toString();
                i = Integer.parseInt(s);
                et.setText("");
                s1 = "%";

            }
        }
        if (v.getId() == b13.getId()) {
            if (et.getText().toString().equals("")&&s=="") {
                Toast.makeText(this, "Enter number first!", Toast.LENGTH_SHORT).show();
                tv2.setText("");
            }
            else if(et.getText().toString().equals(""))
                Toast.makeText(this, "Enter second number now!", Toast.LENGTH_SHORT).show();
            else {
                s2 = et.getText().toString();
                i1 = Integer.parseInt(s2);
                et.setText("");
                if (s1 == "+")
                    result = i + i1;
                else if (s1 == "-")
                    result = i - i1;
                else if (s1 == "*")
                    result = i * i1;
                else if (s1 == "/")
                    result = i / i1;
                else if (s1 == "%")
                    result = i % i1;
                else if(s1=="")
                    result=i1;
                tv2.setText("The result is:  " + result);
                s1="";
                s="";
                s2="";
            }
            }
        }
    }

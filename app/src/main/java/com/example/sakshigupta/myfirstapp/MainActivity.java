package com.example.sakshigupta.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
EditText myet;
    TextView mytv;
    CheckBox mycb;
    Button mybtn;
    Switch myswt;
    RadioButton  myrb;
    ImageButton myib;
    ImageView myiv;
    StringBuilder sb = new StringBuilder();

    int width;
    int height;
    String rbstatus= "off";
    String cbstatus="off";
    String swtstatus= "off";
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        sb= new StringBuilder();
        width = myib.getWidth();
        height = myib.getHeight();

       // sb.append("the width is:"+width+" the height is :"+height);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mytv  = (TextView) findViewById(R.id.tv);
         myet = findViewById(R.id.et);

         mybtn = findViewById(R.id.btn);
         mycb = findViewById(R.id.cb);
          myswt = findViewById(R.id.swt);
         myrb = findViewById(R.id.rb);
         myiv = findViewById(R.id.iv);
         myib = findViewById(R.id.ib);

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textobtained = myet.getText().toString();
                mytv.setText("the text you entered is  "+ textobtained);
            }
        });


//
//        ViewTreeObserver vto = myib.getViewTreeObserver();
//        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//            @Override
//            public void onGlobalLayout() {
//                 width = myib.getWidth();
//                 height = myib.getHeight();
//                sb.append("the width is:"+width+" the height is :"+height);
//
//            }
//        });

        myrb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            rbstatus=isChecked?"on":"off";
            Toast.makeText(getApplicationContext(), "radiobutton is "+rbstatus,Toast.LENGTH_SHORT ).show();
        });



        myswt.setOnCheckedChangeListener((buttonView, isChecked) -> {
            swtstatus=isChecked?"on":"off";
            Toast.makeText(getApplicationContext(), "switch is "+swtstatus,Toast.LENGTH_SHORT ).show();

        });
        mycb.setOnCheckedChangeListener((buttonView, isChecked) -> {
            cbstatus=isChecked?"on":"off";
            Toast.makeText(getApplicationContext(), "checkbox is "+cbstatus,Toast.LENGTH_SHORT ).show();

        });
        myib.setOnClickListener((View v)->{


               sb.append("switch  "+swtstatus+"\n"+"checkbox "+ cbstatus+"\n" + "radio button "+rbstatus+"\n");
                sb.append("the width is:"+width+" the height is :"+height);
                Toast.makeText(getApplicationContext(), sb.toString(), Toast.LENGTH_LONG).show();
                sb.delete(0,sb.length());





        });







    }
}
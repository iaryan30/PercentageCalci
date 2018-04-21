package com.example.ishani.mathsucks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
TextView totalTextView;
EditText percentageTxt;
EditText numberTxt;
private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalTextView=(TextView) findViewById(R.id.totaltextview);
        percentageTxt=(EditText) findViewById(R.id.percentageTxt);
        numberTxt=(EditText) findViewById(R.id.numberTxt);

        btn= findViewById(R.id.calculate);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage=Float.parseFloat(percentageTxt.getText().toString());
                float dec=percentage/100; //percentage into decimal number
                float total=dec * Float.parseFloat(numberTxt.getText().toString());
                totalTextView.setText(Float.toString(total));


            }
        });

    }

}

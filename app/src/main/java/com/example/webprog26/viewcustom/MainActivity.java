package com.example.webprog26.viewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ValueBar mValueBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ValueSelector valueSelector = (ValueSelector) findViewById(R.id.valueSelector);
        mValueBar = (ValueBar) findViewById(R.id.valueBar);

        Button btnUpdate = (Button) findViewById(R.id.buttonUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueBar.setValue(valueSelector.getValue());
            }
        });
    }
}

package com.popn.PopActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.popn.R;

public class CustomKeywordActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_keyword);

        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case (R.id.back):
                finish();
                break;
        }
    }
}

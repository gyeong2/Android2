package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class Exam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        TextView textView1 = findViewById(R.id.textView1);
        Switch switch1 = findViewById(R.id.switch1);

        CompoundButton.OnCheckedChangeListener listener1 = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    textView1.setText("Power On");
                } else {
                    textView1.setText("Power Off");
                }
            }
        };
        switch1.setOnCheckedChangeListener(listener1);

        TextView textView2 = findViewById(R.id.textView2);
        RadioGroup radioGroup1 = findViewById(R.id.RadioGroup);

        RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton1) {
                    textView2.setText(getString(R.string.one));
                } else if (checkedId == R.id.radioButton2) {
                    textView2.setText(getString(R.string.two));
                } else if (checkedId == R.id.radioButton3) {
                    textView2.setText(getString(R.string.three));
                }
            }
        };
        radioGroup1.setOnCheckedChangeListener(listener2);
    }
}
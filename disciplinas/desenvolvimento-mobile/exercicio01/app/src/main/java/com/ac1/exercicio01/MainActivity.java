package com.ac1.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.ac1.exercicio01.entitys.Policy;

public class MainActivity extends AppCompatActivity {

    EditText id;
    EditText name;
    EditText age;
    TextView policyCalc;
    RadioGroup sex;
    RadioButton sexValue;
    EditText carValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculatePolice(View view) {
        policyCalc = (TextView) findViewById(R.id.policyValue);
        id = (EditText) findViewById(R.id.editTextId);
        name = findViewById(R.id.editTextName);
        age = findViewById(R.id.editTextAge);
        carValue = findViewById(R.id.editTextCarValue);
        sex = findViewById(R.id.radioSex);
        int selectId = sex.getCheckedRadioButtonId();
        sexValue = findViewById(selectId);
        Policy policy = new Policy(Long.parseLong(
                id.getText().toString()),
                name.getText().toString(),
                Integer.parseInt(age.getText().toString()),
                sexValue.getText().toString().charAt(0),
                Double.parseDouble(carValue.getText().toString())
        );
        policyCalc.setText("R$: " + policy.calculateValue());
    }
}
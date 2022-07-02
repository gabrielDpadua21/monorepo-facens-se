package com.example01.aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ra;
    EditText name;
    AutoCompleteTextView courseEdit;
    Spinner courseSpinner;
    String[] coursesType;
    CheckBox checkMonitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseEdit = (AutoCompleteTextView) findViewById(R.id.editTextCourse);
        courseSpinner = (Spinner) findViewById(R.id.spinnerCourses);
        ra = (EditText) findViewById(R.id.editTextRa);
        name = (EditText) findViewById(R.id.editTextName);
        courseEdit.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                boolean status = false;
                if(actionId == EditorInfo.IME_ACTION_SEND) {
                    btnSaveClick(null);
                    status = true;
                }
                return status;
            }
        });

        coursesType = getResources().getStringArray(R.array.courses_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesType);
        courseEdit.setAdapter(adapter);
        courseSpinner.setAdapter(adapter);
    }

    public void btnSaveClick(View view) {

        if(ra.getText().toString().isEmpty() || name.getText().toString().isEmpty() || courseEdit.getText().toString().isEmpty()) {
            Toast.makeText(this, "Erro ao cadastrar curso, preencha todos os campos", Toast.LENGTH_LONG).show();
            return;
        }

        Toast.makeText(this, "Curso: " + courseEdit.getText().toString() + ", Salvo com sucesso", Toast.LENGTH_LONG).show();
    }

    public void isMonitor(View view) {
        checkMonitor = (CheckBox) findViewById(R.id.checkBoxMonitor);

        if(checkMonitor.isChecked()) {
            Toast.makeText(this, "O aluno e monitor", Toast.LENGTH_LONG).show();
            return;
        }

        Toast.makeText(this, "O Aluno não e monitor", Toast.LENGTH_LONG).show();
    }

    public void radioClick(View view) {
        RadioGroup groupSex = (RadioGroup) findViewById(R.id.radioGroupSex);
        int selectId = groupSex.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectId);
        Toast.makeText(this, radioButton.getText(), Toast.LENGTH_LONG).show();
    }
}
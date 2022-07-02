package com.exemples.project02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.exemples.project02.entity.Question;

public class MainActivity extends AppCompatActivity {

    TextView question01;
    TextView question02;
    TextView question03;
    TextView area01;
    TextView area02;
    TextView area03;
    Spinner answers01;
    Spinner answers02;
    Spinner answers03;
    TextView result;
    int counter = 0;
    Question q1 = new Question("Qual a função do if?", "Area: Algoritimos", 1, new String[]{"Realizar um loop", "Realizar uma condição", "Atribuir uma variavel", "Somar um valor"});
    Question q2 = new Question("Qual dessas opções não é de orientação a objetos?", "Area: OO", 2, new String[]{"Herança", "Polimorfismo", "Função pura", "Encapsulamento"});
    Question q3 = new Question("O que é uma função pura?", "Area: Programação Funcional", 3, new String[]{"Não retorna nenhum valor", "Não possui parametros", "Chama outra função", "Não gera efeitos colaterais"});

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question01 = (TextView) findViewById(R.id.textViewQuestion01);
        question01.setText(q1.getTitle());
        area01 = (TextView) findViewById(R.id.textViewArea01);
        area01.setText(q1.getArea());
        answers01 = (Spinner) findViewById(R.id.spinnerAnswers01);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, q1.getAnswres());
        answers01.setAdapter(adapter1);

        question02 = (TextView) findViewById(R.id.textViewQuestion02);
        question02.setText(q2.getTitle());
        area02 = (TextView) findViewById(R.id.textViewArea02);
        area02.setText(q2.getArea());
        answers02 = (Spinner) findViewById(R.id.spinnerAnswers02);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, q2.getAnswres());
        answers02.setAdapter(adapter2);

        question03 = (TextView) findViewById(R.id.textViewQuestion03);
        question03.setText(q3.getTitle());
        area03 = (TextView) findViewById(R.id.textViewArea03);
        area03.setText(q3.getArea());
        answers03 = (Spinner) findViewById(R.id.spinnerAnswers03);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, q3.getAnswres());
        answers03.setAdapter(adapter3);
    }

    public void checkQuestion01(View view) {
        answers01.getSelectedItemPosition();
        if(answers01.getSelectedItemPosition() == q1.getCorrectAnswer()) {
            counter++;
        }
    }

    public void checkQuestion02(View view) {
        answers02.getSelectedItemPosition();
        if(answers02.getSelectedItemPosition() == q2.getCorrectAnswer()) {
            counter++;
        }
    }

    public void checkQuestion03(View view) {
        answers03.getSelectedItemPosition();
        if(answers03.getSelectedItemPosition() == q3.getCorrectAnswer()) {
            counter++;
        }
    }

    public void btnSave(View view) {
        checkQuestion01(view);
        checkQuestion02(view);
        checkQuestion03(view);
        result = (TextView) findViewById(R.id.textViewResult);
        result.setText(String.valueOf(counter));
        Button save = (Button) findViewById(R.id.btnSend);
        save.setEnabled(false);

    }

    public void btnClean(View view) {
        result = (TextView) findViewById(R.id.textViewResult);
        counter = 0;
        result.setText("");
        Button save = (Button) findViewById(R.id.btnSend);
        save.setEnabled(true);
    }
}
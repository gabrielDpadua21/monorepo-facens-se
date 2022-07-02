package com.padua.tech.app_guia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locals extends AppCompatActivity {

    private Button btnZoo;
    private Button btnPark;
    private Button btnGuarden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locals);

        btnGuarden = (Button) findViewById(R.id.btnGuardem);
        btnPark = (Button) findViewById(R.id.btnPark);
        btnZoo = (Button) findViewById(R.id.btnZoo);

        btnGuarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails("Jardim Botánico",
                        "Melhor jardin botanico de São Paulo",
                        "geo:-23.462394710945013,-47.43703998056763",
                        "https://turismo.sorocaba.sp.gov.br/visite/jardim-botanico-irmaos-vilas-boas/",
                        "tel:0153235-1130",
                        R.drawable.jardim
                );
            }
        });

        btnPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails("Parque Natural Chico Mendes",
                        "Melhor Parque Natural de São Paulo",
                        "geo:-23.474958619452796,-47.41246433508058",
                        "https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/",
                        "tel:1532281256",
                        R.drawable.parque
                );
            }
        });

        btnZoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetails("Zoologico",
                        "Melhor zoologico de São Paulo",
                        "geo:-23.503885303640907,-47.43738487622028",
                        "https://www.sorocaba.sp.gov.br/zoologico/",
                        "tel:0153227-5454",
                        R.drawable.zoo
                );
            }
        });
    }

    public void openDetails(String name, String description, String locale, String url, String phone, int image) {
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("name", name);
        intent.putExtra("description", description);
        intent.putExtra("locale", locale);
        intent.putExtra("url", url);
        intent.putExtra("phone", phone);
        intent.putExtra("image", image);
        startActivity(intent);
    }
}
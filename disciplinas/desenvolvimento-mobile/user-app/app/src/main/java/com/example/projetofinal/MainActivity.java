package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projetofinal.adapters.UsuarioAdapter;
import com.example.projetofinal.models.Usuario;
import com.example.projetofinal.services.ListUserAsync;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Usuario> listUser;
    RecyclerView userRecycler;
    UsuarioAdapter userAdpter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listUser = new ArrayList<>();
        userRecycler = (RecyclerView) findViewById(R.id.recyclerUsuario);
    }

    @Override
    protected void onResume() {
        super.onResume();
        searchUser();
    }

    public void searchUser() {
        new ListUserAsync("GET", MainActivity.this).execute("api/user", "");
    }

    public void deleteUser(String id) {
        new ListUserAsync("DELETE", MainActivity.this).execute("api/user/"+id, "");
    }

    public void setListUser(ArrayList<Usuario> usuarios) {
        this.listUser = usuarios;
    }

    public void setupRecyclerUser() {
        LinearLayoutManager layout = new LinearLayoutManager(this);
        userRecycler.setLayoutManager(layout);
        userAdpter = new UsuarioAdapter(listUser);
        userRecycler.setAdapter(userAdpter);
        userRecycler.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
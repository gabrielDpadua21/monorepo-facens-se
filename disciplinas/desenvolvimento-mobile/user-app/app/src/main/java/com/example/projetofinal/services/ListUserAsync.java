package com.example.projetofinal.services;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.projetofinal.MainActivity;
import com.example.projetofinal.models.Usuario;

public class ListUserAsync extends AsyncTask<String,String,String> {
    private String metodo;
    ProgressDialog progressDialog;
    Context context;

    public ListUserAsync(String metodo, Context context){
        this.metodo = metodo;
        this.context = context;
        progressDialog = new ProgressDialog(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Carregando");
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if(metodo.equals("GET")) {
            ((MainActivity)context).setListUser(Usuario.parseArrayList(s));
            ((MainActivity)context).setupRecyclerUser();
            progressDialog.dismiss();
        } else if(s.equals("OK")) {
            Toast.makeText(context, "Operação realizada com sucesso!!!", Toast.LENGTH_SHORT).show();
            progressDialog.dismiss();
            ((MainActivity)context).searchUser();
        }
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... strings) {
        String data = ServiceApi.getService(strings[0], strings[1]);
        return data;
    }
}

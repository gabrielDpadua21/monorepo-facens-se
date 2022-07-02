package com.example.projetofinal.adapters;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofinal.MainActivity;
import com.example.projetofinal.R;
import com.example.projetofinal.holders.UsuarioHolder;
import com.example.projetofinal.models.Usuario;

import java.util.ArrayList;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioHolder>
{
    private final ArrayList<Usuario> usuarios;
    public UsuarioAdapter(ArrayList<Usuario>usuarios){
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public UsuarioHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UsuarioHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_listagem_usuario,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioHolder holder, int position) {
        holder.txtNome.setText(usuarios.get(position).getNome());
        holder.txtEmail.setText(usuarios.get(position).getEmail());

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(view.getContext());
                alert.setMessage("Deseja excluir este item?");
                alert.setTitle("Atenção");
                alert.setNegativeButton("Não", null);
                alert.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((MainActivity)holder.itemView.getContext())
                                .deleteUser(usuarios.get(holder.getAdapterPosition()).getId().toString());
                    }
                });
                alert.show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return usuarios != null ? usuarios.size() : 0;
    }
}

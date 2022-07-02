package com.example.projetofinal.adapters;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofinal.CadCourseActivity;
import com.example.projetofinal.MainActivity;
import com.example.projetofinal.R;
import com.example.projetofinal.holders.CourseHolder;
import com.example.projetofinal.models.Course;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseHolder>{
    private final ArrayList<Course> courses;
    public CourseAdapter(ArrayList<Course>courses){
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_listagem_course,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseHolder holder, int position) {
        holder.txtName.setText(courses.get(position).getName());
        holder.txtMobility.setText(courses.get(position).getMobility());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(holder.itemView.getContext(), CadCourseActivity.class);
                i.putExtra("id",courses.get(holder.getAdapterPosition()).getId());
                holder.itemView.getContext().startActivity(i);
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setMessage("Deseja Excluir esse item?");
                alert.setTitle("Atenção");
                alert.setNegativeButton("Não",null);
                alert.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)holder.itemView.getContext())
                                .excluirCourse(courses.get(
                                        holder.getAdapterPosition()).getId()+"");
                    }
                });
                alert.show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return courses != null ? courses.size() : 0;
    }
}

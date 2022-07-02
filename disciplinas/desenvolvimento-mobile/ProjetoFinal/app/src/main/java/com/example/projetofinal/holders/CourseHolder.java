package com.example.projetofinal.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetofinal.R;

public class CourseHolder extends RecyclerView.ViewHolder {
    public TextView txtName;
    public TextView txtMobility;

    public CourseHolder(@NonNull View itemView) {
        super(itemView);
        txtName = (TextView)itemView.findViewById(R.id.textName);
        txtMobility = (TextView) itemView.findViewById(R.id.textMobility);
    }
}

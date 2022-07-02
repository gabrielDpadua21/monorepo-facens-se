package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projetofinal.adapters.CourseAdapter;
import com.example.projetofinal.models.Course;
import com.example.projetofinal.services.ListCourseAsync;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Course> listCourses;
    RecyclerView courseRecycler;
    CourseAdapter courseAdapter;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listCourses = new ArrayList<>();
        courseRecycler = (RecyclerView) findViewById(R.id.recyclerCourse);
        progressDialog = new ProgressDialog(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
        buscarCourses();
    }

    public void buscarCourses() {
        new ListCourseAsync("GET",MainActivity.this).execute("api/course","");
    }
    public void excluirCourse(String id){
        new ListCourseAsync("DELETE",MainActivity.this)
                                                   .execute("api/course/"+id,"");
    }

    public void addCourseClick(View v){
        Intent i = new Intent(MainActivity.this, CadCourseActivity.class);
        startActivity(i);
    }

    public void setListaCourse(ArrayList<Course> courses){
        this.listCourses = courses;
    }

    public void setupRecyclerCourses(){
        LinearLayoutManager layout = new LinearLayoutManager(this);
        courseRecycler.setLayoutManager(layout);
        courseAdapter = new CourseAdapter(listCourses);
        courseRecycler.setAdapter(courseAdapter);

        courseRecycler.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }
}
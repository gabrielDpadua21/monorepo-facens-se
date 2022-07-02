package com.example.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.projetofinal.models.Course;
import com.example.projetofinal.services.CadCourseAsync;

public class CadCourseActivity extends AppCompatActivity {
    int id = 0;
    Course course;
    TextView txtName, txtMobility;

    public Course getCourse(){
        return  course;
    }
    public void setCourse(Course course){
        this.course = course;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_course);
        txtMobility = findViewById(R.id.txtMobility);
        txtName = findViewById(R.id.txtName);
        if(getIntent().hasExtra("id")){
            id = getIntent().getIntExtra("id",0);
            new CadCourseAsync("GET", CadCourseActivity.this).execute("api/course/" +id,"");
        }
        else
            course = new Course();
    }
    public void carregarCampos(){
        txtName.setText(course.getName());
        txtMobility.setText(course.getMobility());
    }

    public void btnSalvarClick(View v){
        course.setId(id);
        course.setName(txtName.getText().toString());
        course.setMobility(txtMobility.getText().toString());

        if(id > 0){
            new CadCourseAsync("PUT", CadCourseActivity.this)
                    .execute("api/course/" + id,Course.parseJson(course));
        }
        else{
           new CadCourseAsync("POST", CadCourseActivity.this)
                    .execute("api/course",Course.parseJson(course));
        }
    }
}
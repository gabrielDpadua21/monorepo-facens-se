package com.example.projetofinal.models;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Course {
    private Integer id;
    private String name;
    private String mobility;

    public Course() {
    }

    public Course(Integer id, String name, String mobility) {
        this.id = id;
        this.name = name;
        this.mobility = mobility;
    }

    public static Course parseObject(String json){
        Course course = new Course();
        try{
            JSONObject obj = new JSONObject(json);
            course.setName(obj.getString("name"));
            course.setMobility(obj.getString("mobility"));

            return course;
        }
        catch (Exception ex){
            return course;
        }
    }

    public static String parseJson(Course course){
        JSONObject obj = new JSONObject();
        try{
            obj.put("id",course.getId());
            obj.put("name",course.getName());
            obj.put("mobility",course.getMobility());
            return obj.toString();
        }
        catch (Exception ex){
            return "";
        }
    }

    public static ArrayList<Course> parseArrayList(String json){
        ArrayList<Course> courses = new ArrayList<>();
        try{
            JSONArray array = new JSONArray(json);
            for(int i = 0; i < array.length(); i++){
                Course course = new Course();
                JSONObject obj = array.getJSONObject(i);
                course.setId(Integer.valueOf(obj.getString("id")));
                course.setName(obj.getString("name"));
                course.setMobility(obj.getString("mobility"));
                courses.add(course);
            }
            return courses;
        }
        catch (Exception ex){
            return null;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }
}

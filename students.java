package com.springdemo.demo;

public class students {
    private Long id;
    private String name;
    private String surname;
    private String father_name;
    private String lang_prog;
    private int year_experience;
    private String course;

    public students(Long id, String name, String surname, String father_name, int year_experience, String course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.father_name = father_name;
        this.lang_prog = lang_prog;
        this.year_experience = year_experience;
        this.course = course;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getLang_prog() {
        return lang_prog;
    }

    public void setLang_prog(String lang_prog) {
        this.lang_prog = lang_prog;
    }

    public int getYear_experience() {
        return year_experience;
    }

    public void setYear_experience(int year_experience) {
        this.year_experience = year_experience;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

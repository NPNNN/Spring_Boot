package org.nk.restapi.dto;

public class Person {
    private String Name;
    private String city;
    private String gender;
    private int age;
    private String education;

    public Person(String name, String city, String gender, int age, String education) {
        Name = name;
        this.city = city;
        this.gender = gender;
        this.age = age;
        this.education = education;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                '}';
    }
}

package edu.uncc.gradesapp.models;

public class Grade {
    public double hours;
    public String letterGrade, name, number, owner_id, docId, semName;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getSemName() {
        return semName;
    }

    public void setSemName(String semName) {
        this.semName = semName;
    }

    @Override
    public String toString(){
        return "Grade{" +
                "hours=" + hours +
                ", letterGrade=' " + letterGrade + '\''+
                ", name=' " + name + '\''+
                ", semName=' " + semName + '\''+
                ", number=' " + number + '\''+
                ", owner_id=' " + owner_id + '\''+
                '}';
    }
}

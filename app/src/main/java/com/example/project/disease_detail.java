package com.example.project;

public class disease_detail {
    String disease_name;
    String disease_cause;
    String disease_cure;
    String disease_id;

    public disease_detail() {
    }

    public disease_detail(String disease_name, String disease_cause, String disease_cure , String disease_id) {

        this.disease_name = disease_name;
        this.disease_cause = disease_cause;
        this.disease_cure = disease_cure;
        this.disease_id = disease_id;

    }

    public String getDisease_name() {
        return disease_name;
    }

    public void setDisease_name(String disease_name) {
        this.disease_name = disease_name;
    }

    public String getDisease_cause() {
        return disease_cause;
    }

    public void setDisease_cause(String disease_cause) {
        this.disease_cause = disease_cause;
    }

    public String getDisease_cure() {
        return disease_cure;
    }

    public void setDisease_cure(String disease_cure) {
        this.disease_cure = disease_cure;
    }

    public String getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(String disease_id) {
        this.disease_id = disease_id;
    }
}

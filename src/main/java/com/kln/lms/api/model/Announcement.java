package com.kln.lms.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String ann_id;
    private String title;
    private String description;

    public String getAnnId() {
        return ann_id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
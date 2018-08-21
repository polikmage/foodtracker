package org.mpo.foodtracker.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    private Date feedingDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;


    public Food(){}

    public Food(String name, String description, Date feedingDate, Date dateCreated) {
        //this.id = id;
        this.name = name;
        this.description = description;
        this.feedingDate = feedingDate;
        this.dateCreated = dateCreated;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFeedingDate() {
        return feedingDate;
    }

    public void setFeedingDate(Date feedingDate) {
        this.feedingDate = feedingDate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }





    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", feedingDate=" + feedingDate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

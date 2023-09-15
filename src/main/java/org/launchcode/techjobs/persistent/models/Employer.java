package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank.")
    @Size(max = 150)
    private String location;

    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    // no arg constructor
    public Employer(){

    }


    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

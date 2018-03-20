package lt.perlaikymas.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lt.perlaikymas.Model.Util.Util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Supplier {

    @Id
    @GeneratedValue
    private long id;

    private String title;

    private String city;

    private long companyCode;

    private int rating;


    @ManyToMany(mappedBy = "suppliers")
    @JsonIgnore
    private Set<Util> services = new HashSet<>();

    public Supplier(){
    	
    }

    public Supplier(String title, String city, long companyCode, int rating) {
        this.title = title;
        this.city = city;
        this.companyCode = companyCode;
        this.rating = rating;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(long companyCode) {
        this.companyCode = companyCode;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Set<Util> getService() {
        return services;
    }

    public void setServices(Set<Util> services) {
        this.services = services;
    }
}

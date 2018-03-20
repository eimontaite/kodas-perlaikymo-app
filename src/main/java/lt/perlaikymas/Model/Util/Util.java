package lt.perlaikymas.Model.Util;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lt.perlaikymas.Model.Supplier;
import lt.perlaikymas.Model.Util.Util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Util {

    @Id
    @GeneratedValue

    private String title;

    private long price;

    private String description;

    private String image;


    //Set because MtM requires such; see Supplier model
    @ManyToMany
    private Set<Supplier> suppliers = new HashSet<>();

    //required constructor
    public Util() {
    }

    public Util(String title, long price, String description, String image) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public Set<Supplier> getSupplier() {
        return suppliers;
    }

    public void setSupplier(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}

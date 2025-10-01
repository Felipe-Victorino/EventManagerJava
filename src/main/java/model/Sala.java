package model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    private int maxCapacity;

    public Sala(){

    }

    public long getId() {return id;}
    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getMaxCapacity() {return maxCapacity;}

    public void setName(String name) {this.name = name;}
    public void setDescription(String description) {this.description = description;}
    public void setMaxCapacity(int maxCapacity) {this.maxCapacity = maxCapacity;}
}
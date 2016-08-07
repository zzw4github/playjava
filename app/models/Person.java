package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person extends Model{
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String pwd;
    @Id
    @Constraints.Min(10)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    public String getPwd() {
        return this.pwd;
    }

    public static Finder<Long, Person> find = new Finder<Long,Person>(Person.class);
}
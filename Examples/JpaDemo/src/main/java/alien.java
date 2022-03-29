import javax.persistence.*;

@Entity() // three layer class name, entity name
@Table(name = "Alien_table")
public class alien
{
    @Id
    private int id;
    @Embedded
    private AlienName name;
    private String spec;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AlienName getName() {
        return name;
    }

    public void setName(AlienName name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Colour='" + spec + '\'' +
                '}';
    }
}

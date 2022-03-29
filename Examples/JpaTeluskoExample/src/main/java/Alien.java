import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{
    @Id
    private int id;
    private String name;
    private String spec;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

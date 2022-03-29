import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name="VEHICLE")
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_ID")
    private int vehicleId;

    @Column(name = "VEHICLE_NAME")
    private String vehicleName;

    @ManyToMany
    private Collection<UserDetails> user =  new ArrayList<>();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Collection<UserDetails> getUser() {
        return user;
    }

    public void setUser(Collection<UserDetails> user) {
        this.user = user;
    }
}

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VEHICLE_ID")
    private int vehicleId;
    @Column(name="VEHICLE_NAME")
    private String vehicleName;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserDetails user;

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

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                ", user=" + user +
                '}';
    }
}

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "PHONESIM")
public class Phone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Integer id;

    @Column(name = "NAME")
    private String no;

    @OneToOne
    @JoinColumn(name = "EMP_ID")
    private Employee emp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

}

package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Orders {
    private String date;
    @Id
    private String oId;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "orders")
    private List<Order_Detail> order_detailList = new ArrayList<>();

}

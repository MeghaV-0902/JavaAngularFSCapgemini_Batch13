package com.pack.coll;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stock
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stid;
    private String stname;

    @ElementCollection
    private List<StockDetails> stockDetails = new ArrayList<>();

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public List<StockDetails> getStockDetails() {
        return stockDetails;
    }

    public void setStockDetails(List<StockDetails> stockDetails) {
        this.stockDetails = stockDetails;
    }
}

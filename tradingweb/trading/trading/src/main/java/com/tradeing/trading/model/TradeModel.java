package com.tradeing.trading.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "trade")
public class TradeModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private int quantity;
    private int price;
    private String currency;
    private String buy_sell;
    private String asset_type;
    private String origin_country;

}

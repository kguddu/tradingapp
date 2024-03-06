package com.tradeing.trading.repository;

import com.tradeing.trading.model.TradeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRepo extends JpaRepository<TradeModel,Integer> {

    List <TradeModel> findAll();
}

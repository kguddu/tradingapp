package com.tradeing.trading.service;

import com.tradeing.trading.model.TradeModel;
import com.tradeing.trading.repository.TradeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TradeService {
     @Autowired
     private TradeRepo tradeRepo;

     public TradeModel createTrade(TradeModel tradeModel){
          TradeModel saveAll= tradeRepo.save(tradeModel);
          return saveAll;

     }

     public List <TradeModel> getAllTrade(TradeModel tradeModel){
         List<TradeModel> getAll= tradeRepo.findAll();
         return getAll;
     }
}

package com.tradeing.trading.controller;


import com.tradeing.trading.model.TradeModel;
import com.tradeing.trading.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TradeController {

    @Autowired
    private TradeService tradeService;

   @PostMapping("/create")
    public TradeModel createTrade(@RequestBody TradeModel tradeModel){
              TradeModel  saveAll= tradeService.createTrade(tradeModel);
              return saveAll;
    }

    @GetMapping("/view")
    public List <TradeModel> getAllTrade(@RequestBody TradeModel tradeModel){
     List < TradeModel> getAll= tradeService.getAllTrade(tradeModel);
     return  getAll;
    }

}

package com.techelevator.controller;

import com.techelevator.dao.AuctionDao;
import com.techelevator.model.Auction;
import com.techelevator.model.AuctionListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AuctionController {

    @Autowired
    private AuctionDao dao;

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<AuctionListDto> getAuctions() {
        return dao.getAll();
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction getAuction(@PathVariable int id) {
        return dao.getAuctionById(id);
    }


}

package com.techelevator.controller;

import com.techelevator.dao.AuctionDao;
import com.techelevator.model.Auction;
import com.techelevator.model.CreateAuctionDto;
import com.techelevator.model.ListAuctionDto;
import com.techelevator.model.UpdateAuctionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AuctionController {

    @Autowired
    private AuctionDao dao;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction createAuction(@RequestBody CreateAuctionDto dto) {
        return dao.createAuction(dto);
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<ListAuctionDto> getAuctions() {
        return dao.getAll();
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.GET)
    public Auction getAuction(@PathVariable int id) {
        return dao.getAuctionById(id);
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.PUT)
    public Auction updateAuction(@RequestBody UpdateAuctionDto dto) {
        return dao.updateAuction(dto);
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.DELETE)
    public void deleteAuctionById(@PathVariable int id) {dao.deleteAuctionById(id);}


}

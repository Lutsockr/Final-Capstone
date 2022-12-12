package com.techelevator.controller;

import com.techelevator.dao.BidDao;
import com.techelevator.model.Bid;
import com.techelevator.model.CreateBidDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//@PreAuthorize("isAuthenticated()")
public class BidController {

    @Autowired
    private BidDao dao;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/bids", method = RequestMethod.POST)
    public Bid createBid(@RequestBody CreateBidDto dto) {
        return dao.createBid(dto);
    }

    @RequestMapping(path = "/bids/{id}", method = RequestMethod.GET)
    public Bid getBidById(@PathVariable int id) {
        return dao.getBidById(id);
    }
}

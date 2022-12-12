package com.techelevator.controller;

import com.techelevator.dao.AuctionTypeDao;
import com.techelevator.model.AuctionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
//@PreAuthorize("isAuthenticated()")
public class AuctionTypeController {


    @Autowired
    private AuctionTypeDao dao;

    @RequestMapping(path = "/auctiontypes", method = RequestMethod.GET)
    public List<AuctionType> getAuctionTypes() {
        return dao.getAll();
    }
}

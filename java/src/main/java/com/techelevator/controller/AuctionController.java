package com.techelevator.controller;

import com.techelevator.dao.AuctionDao;
import com.techelevator.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
//@PreAuthorize("isAuthenticated()")
public class AuctionController {

    @Autowired
    private AuctionDao dao;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction createAuction(@RequestBody CreateAuctionDto dto) {
        return dao.createAuction(dto);
    }

//    @PreAuthorize("permitAll")
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
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        return dao.updateAuction(dto);
    }

    @RequestMapping(path = "/auctions/{id}", method = RequestMethod.DELETE)
    public void deleteAuctionById(@PathVariable int id) {
        dao.deleteAuctionById(id);
    }


}

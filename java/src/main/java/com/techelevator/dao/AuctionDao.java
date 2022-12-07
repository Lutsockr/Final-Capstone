package com.techelevator.dao;

import com.techelevator.model.Auction;
import com.techelevator.model.AuctionListDto;

import java.util.List;

public interface AuctionDao {

    List<AuctionListDto> getAll();

    Auction getAuctionById(int id);

    void deleteAuctionById(int id);


}

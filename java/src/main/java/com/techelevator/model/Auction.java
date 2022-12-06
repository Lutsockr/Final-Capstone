package com.techelevator.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Auction {

    private int id;
    private User owner;
    private String title;
    private String description;
    private BigDecimal startingPrice;
    private Bid winningBid;
    private AuctionType auctionType;
    private Date startDate;
    private Date endDate;
    private List<Bid> bids;
}

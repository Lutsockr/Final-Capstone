package com.techelevator.dao;

import com.techelevator.model.AuctionListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcAuctionDao implements AuctionDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AuctionListDto> getAll() {
        List<AuctionListDto> auctions = new ArrayList<>();
        String sql = "SELECT auction_id, title, users.username, image_path, starting_price, end_date " +
                "FROM auction " +
                "JOIN users ON owner_id = users.user_id";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            auctions.add(mapRowToAuctionListDto(results));
        }

        return auctions;
    }

    private AuctionListDto mapRowToAuctionListDto(SqlRowSet rs) {
        AuctionListDto auctionListDto = new AuctionListDto();
        auctionListDto.setId(rs.getInt("auction_id"));
        auctionListDto.setTitle(rs.getString("title"));
        auctionListDto.setOwnerName(rs.getString("username"));
        auctionListDto.setImagePath(rs.getString("image_path"));
        auctionListDto.setStartingPrice(rs.getBigDecimal("starting_price"));
        auctionListDto.setEndDate(rs.getTimestamp("end_date"));
        return auctionListDto;
    }
}

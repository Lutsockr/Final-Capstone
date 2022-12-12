package com.techelevator.dao;

import com.techelevator.model.AuctionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcAuctionTypeDao implements AuctionTypeDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<AuctionType> getAll() {
        List<AuctionType> auctionTypes = new ArrayList<>();
        String sql = "SELECT auction_type_id, name FROM auction_type";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            auctionTypes.add(mapRowToAuctionType(results));
        }

        return auctionTypes;
    }

    private AuctionType mapRowToAuctionType(SqlRowSet rs) {
        AuctionType auctionType = new AuctionType();
        auctionType.setId(rs.getInt("auction_type_id"));
        auctionType.setName(rs.getString("name"));
        return auctionType;
    }


}

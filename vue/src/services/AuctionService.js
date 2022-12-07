import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {
  getAuctions(){
    return http.get('/auctions');
  },
  getAuctionById(auctionID){
    return http.get(`/auctions/${auctionID}`)
  },
  addAuction(auction) {
    return http.post('/auctions', auction)
  }
  
}
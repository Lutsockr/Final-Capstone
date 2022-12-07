import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {
  getAuction(){
    return http.get('/auctions');
  },
  getAuctionsById(auctionID){
    return http.get(`/auctions/${auctionID}`)
  },
  
}
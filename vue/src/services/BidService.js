import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {
    placeBid(bid) {
        return http.post('/bids', bid)
    },

    getBidById(bidId) {
        return http.get(`/bids/${bidId}`)
    },

    getBidsByUserId(userId) {
        return http.get(`/bids/user/${userId}`)
    },
    deleteBidById(bidId) {
        return http.delete(`/bids/${bidId}`)
    }

}

import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:9000"
});

export default {
  getAuction(){
    return http.get('/auctions');
  },

  login(user) {
    return axios.post('/login', user)
  },

  register(user) {
    return axios.post('/register', user)
  }

}

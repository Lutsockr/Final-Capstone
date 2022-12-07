<template>
  <form v-on:submit.prevent>
    <div class="field">
      <label for="title">Title</label>
      <input type="text" name="title" v-model="auction.title" />
    </div>
    <div class="field">
      <label for="price">Price</label>
      <input type="number" name="price" v-model="auction.price" />
    </div>
    <div class="field">
      <label for="details">Details</label>
      <input type="text" name="details" v-model="auction.details" /> 
    </div>
    <div class="actions">
      <button type="submit" v-on:click="saveAuction()">Save Auction</button>
    </div>
  </form>
</template>

<script> 
import auctionService from '../services/AuctionService';

export default {
  name: "create-topic",
  data() {
    return {
      auction: {
        title: "",
        price: "",
        details: "",
      }
    };
  },
  methods: {
    saveAuction() {
      auctionService.addAuction(this.auction).then(response => {
          if(response.status === 201) {
            this.$router.push({ name: 'home'});
          }
        
      })
    }
  }
};
</script>
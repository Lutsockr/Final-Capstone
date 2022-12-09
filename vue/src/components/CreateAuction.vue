<template>
  <form v-on:submit.prevent>
    <div class="field">
      <label for="title">Title</label>
      <input type="text" name="title" v-model="auction.title" />
    </div>
    <div class="field">
      <label for="description">Description</label>
      <input type="text" name="description" v-model="auction.description" /> 
    </div>
    <div class="field">
      <label for="startingPrice">Starting Price</label>
      <input type="number" name="startingPrice" v-model="auction.startingPrice" />
    </div>
    <div class="field">
      <label for="auctionType">Auction Type</label>
      <input type="text" name="auctionType" v-model="auction.auctionType" />
    </div>
    <div class="field">
      <label for="endDate">End Date</label>
      <input type="datetime-local" name="endDate" v-model="auction.endDate" />
    </div>
    <div class="field">
      <label for="imagePath">Image Url</label>
      <input type="url" name="imagePath" v-model="auction.imagePath" />
    </div>
    <div class="actions">
      <button type="submit" v-on:click="saveAuction()">Save Auction</button>
    </div>
  </form>
</template>

<script> 
import auctionService from '../services/AuctionService';

export default {
  name: "create-auction",
  data() {
    return {
      auction: {
        title: "",
        description: "",
        startingPrice: 0,
        auctionType: 0,
        ownerId: 1,
        endDate: "",
        imagePath: "",
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
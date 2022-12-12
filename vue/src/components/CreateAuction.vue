<template>
<div>
  <form v-on:submit.prevent class="createAuctionForm">
    <label for="title">Title: </label>
    <div class="field">
      <input type="text" name="title" v-model="auction.title" />
    </div>
    <label for="description">Description: </label>
    <div class="field">
      <textarea id="textBox" type="text" name="description" v-model="auction.description" /> 
    </div>
    <label for="startingPrice">Starting Price: </label>
    <div class="field">
      <input type="text" name="startingPrice" v-model="auction.startingPrice" />
    </div>
    <label for="auctionType">Auction Type: </label>
    <div class="field">
      <input type="text" name="typeId" v-model="auction.auctionType.id" />
    </div>
    <label for="endDate">End Date: </label>
    <div class="field">
      <input type="datetime-local" name="endDate" v-model="auction.endDate" />
    </div>
    <label for="imagePath">Image Url: </label>
    <div class="field">
      <input type="url" name="imagePath" v-model="auction.imagePath" />
    </div>
    <div class="actions">
      <button type="submit" v-on:click="saveAuction()">Save Auction</button>
    </div>
   
  </form>

</div>
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
<style>
.createAuctionForm{
  text-align: center;
}

#textBox {
  max-width: 15vw;
  max-height: 750px;
}
div.field{
  padding: 10px;
  
}
form{
  justify-content: stretch;
  border-color: #344;
  border-radius: 0px;
  border-style: solid;
  background-color:  #333;
  margin-left: auto;
  margin-right: auto;
  margin-top: 10vw;
  color: white;
  padding: 15px;
  width: 20vw;
  border-width: 10px;
  border-color: brown;
}
div.logo img{
  display: flex;
  justify-content: center;
  width: 100px;
}
</style>
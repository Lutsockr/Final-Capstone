<template>
  <div>
        <div class="a" v-bind:key="auctions.id">
            <h1 class="title">{{ auctions.title }}</h1>
            <img height="200px" v-bind:src="auctions.imagePath" >
            <p> Price: $ {{ auctions.startingPrice}}</p>
            <p> Details: {{ auctions.details }} </p>
            <p> Buyout Price: $ {{ auctions.buyout }} </p>
            <p class="seller"> Seller: {{auctions.ownerName}} </p>
        </div>
  </div>
</template>

<script>
import auctionService from '../services/AuctionService'

export default {
    name: "individual-auction",
    data(){
            return{
                auctions: [],
                previewImage: null
            }
        },
    created() {
        auctionService.getAuctions().then(response => {
            this.auctions = response.data;
        })
    },
}
</script>

<style>

.a {
    text-align: center;
}

</style>
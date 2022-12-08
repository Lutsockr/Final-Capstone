<template>
  <div>
        <div class="a" v-bind:key="auction.id">
            <h1 class="title">Name of Item: {{ auction.title }}</h1>
            <h2>This auction will end at {{ auction.endDate }} </h2>
            <img height="200px" v-bind:src="auction.imagePath" >
            <p> Price: $ {{ auction.startingPrice}}</p>
            <p> Details: {{ auction.description }} </p>
            <p> Buyout Price: $ {{ auction.buyout }} </p>
            <p class="seller"> Seller: {{auction.owner.username}} </p>
            <p> Current bids: {{auction.bids.bidAmount }} </p>
        </div>
  </div>
</template>

<script>
import auctionService from '../services/AuctionService'

export default {
    name: "individual-auction",
       props: {
            'auctionId' : Number
        },
    data(){
            return{
                auction: {
                   



                },
                previewImage: null
            }
        },
    created() {
        auctionService.getAuctionById(this.$route.params.id).then(response => {
            this.auction = response.data;
        })
    },
}
</script>

<style>

.a {
    text-align: center;
}

</style>
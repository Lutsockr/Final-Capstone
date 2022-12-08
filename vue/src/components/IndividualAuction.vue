<template>
  <div>
        <div class="a" v-bind:key="auction.id">
            <h1 class="title">Name of Item: {{ auction.title }}</h1>
            <h2>This auction will end in:</h2>
<h3> {{ timeRemaining.returnDifference + " Days and " + timeRemaining.returnDifferenceFloored + " Hours" }} </h3>
            <img height="200px" v-bind:src="auction.imagePath" >
            <p> Starting Bid Price: $ {{ auction.startingPrice}}</p>
            <p> Details: {{ auction.description }} </p>
            <p> Buyout Price: $ {{ auction.buyout }} </p>
            <p class="seller"> Seller: {{auction.owner.username}} </p>
            <table>
            <tr> 
                <th>Bidder</th>
                <th>Bid Amount</th>
            </tr>
            <tr v-for="bid in auction.bids" v-bind:key="bid.id">
                    <td> {{bid.username}} </td>
                    <td> {{bid.bidAmount}}</td>
                </tr>
            <!-- <div v-for="bid in auction.bids" v-bind:key="bid.id"> 
                <tr>
                    <td> {{bid.username}} </td>
                    <td> {{bid.bidAmount}}</td>
                </tr>
            </div> -->
            
            </table>
        
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
    computed: {
        timeRemaining(){
            var endDate = new Date(this.auction.endDate).getTime();
            var startDate = new Date(this.auction.startDate).getTime();
            var difference = (Math.abs(endDate - startDate) / (1000*60*60*24));
            var returnDifference = Math.floor(difference);
            var returnDifferenceFloored = ((difference - Math.floor(difference)) * 24).toFixed(2);
            let daysWord = "Days";
            let hoursWord = "Hours";
            return {
                returnDifference, daysWord,
                returnDifferenceFloored, hoursWord
            }
        }
    }
}
</script>

<style>

.a {
    text-align: center;
    display: inline-block;
    justify-content: center;
    
}

</style>
<template>
  <div class="create-bid">
      <button>Bid +$1</button>
      <button>Bid +$5</button>
      <button>Bid +$10</button>
      <button>Bid +$20</button>
  </div>
</template>

<script>
//import bidService from '../services/BidService'

export default {
    name: "create-bid",
    data() {
        return {
            bid: {
                "auctionId": 0,
                "userId": 0,
                "bidAmount": 0
            }
        }
    }
}
</script>

<style>

</style>
<template>
  <div>
    <h1>Auction</h1>
    <individual-auction />
    <!-- v-bind:auctionID="parseInt(route.params.auctionID)"  -->
  </div>
</template>

<script>
import IndividualAuction from "../components/IndividualAuction";

export default {
  components: {
    IndividualAuction
  }
};
</script>
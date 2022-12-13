<template>
<div class="pin"> 
<h1 class="page_title"> List of Auctions </h1>
<card-format />
</div>
</template>

<script>
import CardFormat from './CardFormat.vue'
import AuctionService from '../services/AuctionService'

export default {
  components: { CardFormat },
  methods: {
     deleteTopic(id) {
      AuctionService.deleteAuction(id).then(response =>{
        if(response.status === 200){
        this.getAuctions();
        }
      })
    }

  }


}

</script>

<style>
.page_title{
text-align: center;

}
.pin{
  background-image: url(https://static8.depositphotos.com/1570716/1049/i/950/depositphotos_10495668-stock-photo-cork-board-background.jpg)
}
</style>
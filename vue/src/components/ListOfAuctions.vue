<template>
<div> 
<h1 class="page_title"> List of Auctions </h1>
<card-format />
</div>
</template>

<script>
import CardFormat from './CardFormat.vue'
export default {
  components: { CardFormat },


}
</script>

<style>
.page_title{
text-align: center;
}
</style>
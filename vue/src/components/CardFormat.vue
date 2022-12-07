<template>
<div class = 'a'>
    <div>

        <div class="card a"
            v-for="auction in auctions"
            v-bind:key="auction.id"  
        >
            <h1 class="title">{{ auction.title }}</h1>
<!-- 
      <div>
      <img src: previewImage class="uploading-image" />
      <input type="file" accept="image/png" @change=uploadImage>
    </div> -->
            <img height="200px" v-bind:src="auction.imagePath" >
            <p> Price: $ {{ auction.startingPrice}}</p>
            <p class="seller"> Seller: {{auction.ownerName}} </p>
        </div>

  <!-- <div>
       <img href src: previewImage class="uploading-image" />
      <input type="file" accept="image/png" @change=uploadImage>
  </div> -->

  </div>

  
</div>
</template>

<script>
import auctionService from '../services/AuctionService';
export default {
        name:'imageUpload',
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
        methods:{
            uploadImage(e){
                const image = e.target.files[0];
                const reader = new FileReader();
                reader.readAsDataURL(image);
                reader.onload = e =>{
                    this.previewImage = e.target.result;
                    console.log(this.previewImage);
                };
            }
        }
     }  // missing closure added
</script>

<style>

.uploading-image{
     display:flex;
   }

.card{
   border-radius: 10px;
    border: 2px solid black;
    width: auto;
    height: 400px;
    margin: 20px;
    background-color: aqua;
    
}
h1{
    text-align: center;
}
.seller{
text-align: left;


}
.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}

.a {
    display: flex;
    display: inline-block;
   
}

.uploading-image {
    display: flex;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}


</style>
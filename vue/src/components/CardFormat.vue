<template>
<div class = 'a'>
    <div>

        <div class="card"
            v-for="auction in auctions"
            v-bind:key="auction.id"  
        >
            <h1 class="title">{{ auction.title }}</h1>
<!-- 
      <div>
      <img src: previewImage class="uploading-image" />
      <input type="file" accept="image/png" @change=uploadImage>
    </div> -->

            <p> Price: $</p>
            <p> Details: </p>
            <p class="seller"> Seller: </p>
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
    background-color: blue;
    
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
}

.uploading-image {
    display: flex;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}


</style>
<template>
<div>
<div>
  <div class="card">
      
      <h1 class="title">Example 1</h1>
      <img style="width:200px" class="center" href src="../img/Bike.jpg">
      <p> Price: $</p>
      <p> Details: </p>
      <div>
      <p class="seller"> Seller: </p>
      </div>
      
  </div>
  </div>
  <div class="card">
      
      <h1 class="title">Example 2</h1>
      <img style="width:200px" class="center" href src="../img/Bike.jpg">
      <p> Price: $</p>
      <p> Details: </p>
      <div>
      <p class="seller"> Seller: </p>
      </div>
      
  </div>
  <div class="card">
      
      <h1 class="title">Example 3</h1>
      <img style="width:200px" class="center" href src="../img/Bike.jpg">
      <p> Price: $</p>
      <p> Details: </p>
      <div>
      <p class="seller"> Seller: </p>
      </div>
      
  </div>
</div>
</template>

<script>
export default {

}
</script>

<style>
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

</style>
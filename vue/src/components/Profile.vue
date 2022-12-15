<template>
    <div class="profile-main">
        <h1 class="profile-title" > Profile </h1>
         <div class="contact-info">
         <h1 style="color:white"> {{ this.$store.state.user.username }}'s Profile </h1>
         <div class="profile-box">
         <h2 >Contact Info</h2>
         <h2>Username: {{this.$store.state.user.username}}</h2>
         <h2>Name: {{this.$store.state.user.name}}</h2>
         <h2>Address: {{this.$store.state.user.address}}</h2>
         <h2>Phone Number: {{this.$store.state.user.phoneNumber}}</h2>
         </div>
         </div>
        
    </div>
</template>
<script>
export default {
name: 'profile'
  
}
</script>
<style scoped>

div
{
    /* width: 600px;
    height: 100px;
    background: pink;
    cursor: url(https://cdn.custom-cursor.com/packs/3743/neon-money-pack.png) 25 15, auto; */
    
    color:black;
}
.profile-title{
color: black;
}
h2{
    
    display: flex;
    flex-direction: column;
}
.profile-box{
    color: #639f7e;
    background-color: black;
    width:  400px;
    justify-content: center;
    margin-left: auto;
    margin-right: auto;
    margin-top: 200px;
    border: solid;
    border-width: 20px;
    border-radius: 20%;
}

</style>
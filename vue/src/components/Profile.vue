<template>
    <div class="profile-main">
        <h1 class="profile" style="color:white"> Profile </h1>
         <div class="contact-info">
         <h1 style="color:white"> {{ this.$store.state.user.username }}'s Profile </h1>
         <h2 >Contact Info<br>Username: {{this.$store.state.user.username}}<br>Name: {{this.$store.state.user.name}}<br>Address: {{this.$store.state.user.address}}<br>Phone Number: {{this.$store.state.user.phoneNumber}}</h2>
     
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
    
    color:white;
}
.profile{
color: white
}
h2{
    float:left
}

</style>
<template>
  <div id="app">
    <div class="topnav" id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home | </router-link>
      <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login | </router-link>
      <router-link v-bind:to="{ name: 'register' }" v-if="$store.state.token == ''">Register</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <router-link v-bind:to="{ name: 'create' }" v-if="$store.state.token != ''">Create Auction</router-link>
      
    </div>
    <router-view />
    
  </div>
</template>
<style scoped>
.topnav {
  background-color: #333;
  overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
  background-color: #04AA6D;
  color: white;
}

</style>


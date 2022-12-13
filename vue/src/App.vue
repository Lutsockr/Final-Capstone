<template>
  <div id="app">
    <div class="topnav" id="nav">
      <router-link class="active" v-bind:to="{ name: 'home' }">Home</router-link>
      <router-link v-bind:to="{ name: 'login' }" v-if="$store.state.token == ''">Login | </router-link>
      <router-link v-bind:to="{ name: 'register' }" v-if="$store.state.token == ''">Register</router-link>
      <router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
      <router-link v-bind:to="{ name: 'create' }" v-if="$store.state.token != ''">Create Auction</router-link>
      <router-link v-bind:to="{ name: 'bids' }" v-if="$store.state.token != ''">Bids</router-link>
      
    </div>
    <router-view />
    
  </div>
</template>
<style scoped>
.topnav {
  background-color: #333;
  box-shadow: 5px 5px;
  overflow: hidden;
  width: 100vw;
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
  background-color: rgb(red, green, blue);
  color: white;
}

</style>
<style>
@keyframes colorChange {
  0% {
    background: #ff0000;
  }
  14% {
    background: #ffa500;
  }
  28% {
    background: #ffff00;
  }
  42% {
    background: lime;
  }
  56% {
    background: cyan;
  }
  70% {
    background: #0000ff;
  }
  84% {
    background: #4b0082;
  }
  100% {
    background: #ff0000;
  }

}
@keyframes textColorChange {
  0% {
    color: lime;
  }
  14% {
    color: cyan;
  }
  28% {
    color: #0000ff;
  }
  42% {
    color: #4b0082;
  }
  56% {
    color: #ff0000;
  }
  70% {
    color: #ffa500;
  }
  84% {
    color: #ffff00;
  }
  100% {
    color: lime;
  }

}
html {
  background-image: url(https://img.cgaxis.com/2021/01/dark_oak_wood_33_14_diffuse.jpg)
}
div.topnav {
  animation: colorChange 20s;
  animation-timing-function: ease-in-out;
  animation-iteration-count: infinite;
  animation-play-state: running;
   position: fixed; /* Set the navbar to fixed position */
  top: 0; /* Position the navbar at the top of the page */
 
}
div.topnav a{
  animation: textColorChange 20s;
  animation-timing-function: ease-in-out;
  animation-iteration-count: infinite;
  animation-play-state: running;
}
</style>

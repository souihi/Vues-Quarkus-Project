<template>
  <div class="navBarHome">
    <nav>
      <div class="navbar">
        <a href="" class="logo">
          AIRBNB
        </a>
        <div class="search-bar">
          <div class="field has-addons">
            <div class="control">
              <input class="input" type="text" placeholder="Find room">
            
              <div class="search">  
                <div>
                  <div class="wrapperImage">
                  </div> 
                </div>
              </div>
            
            </div>
            <div class="control">
              <a class="button is-info">
                Search
              </a>
            </div>
        </div>
        </div>
        <div class="buttons">
         <router-link :to =" {name:'Connexion'}" class="button is-warning"> Se connecter </router-link> 
        <router-link :to="{name : 'Inscription'}" class="button is-success">Inscription</router-link>
        </div>
      </div>
    </nav>
  </div>
</template>

<script>

//IMPORT COMPONENTS
export default {
name: 'NavBarHome'
}
</script>

<style lang="scss"> 
.navBarHome{
  //NAVBAR
  $primary-color: #a8a8a8;
  $secondary-color: #ecf0f1;
  .navbar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 10px;
  background-color: $secondary-color;
  margin-bottom: 40px; 
//SEARCHBAR
.control{
  position: relative;
  .search{
    position: absolute;
    top:100%;
    width: 100%;
    
    background-color: #ecf0f1;
    .containerAirbnbSearch{
      display: flex;
      align-items: center;
      padding: 10px;
      &:hover{
        background-color: #ffffff;
      }
      .wrapperImage{
        height: 60px;
        width: 60px;
        margin-right: 20px;
        border-radius: 25%;
        overflow: hidden;
        img{
          height: 100%;
          width: auto;
        }
      }
    }
  }
}
.logo:hover {
    animation: logo-animation 0.5s cubic-bezier(0.46, 0.01, 1, 1);
}

@keyframes logo-animation {
    21% {
        transform: rotate(15deg);
    }

    40% {
        transform: rotate(-10deg);
    }

    60% {
        transform: rotate(5deg);
    }

    80% {
        transform: rotate(-5deg);
    }

    to {
        transform: rotate(0deg);
    }
}

  .search-bar {
    display: flex;
  }

  .search-bar input[type="text"] {
    padding: 5px;
    border: none;
    border-radius: 3px;
  }

  .search-bar button {
    padding: 5px 10px;
    background-color: $secondary-color;
    background-color: $primary-color;
    border: none;
    border-radius: 3px;
    margin-left: 5px;
  }

  .buttons {
    display: flex;
  }

  .button {
    padding: 8px 12px;
    text-decoration: none;
    border: none;
    border-radius: 3px;
    margin-left: 5px;
  }
  //######
  }
}
</style>
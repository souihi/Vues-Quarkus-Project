<template>
    <div class="navBarUser">
        <nav class="navbar " role="navigation" aria-label="main navigation">
    <div class="navbar-brand">
      <a class="navbar-item" href="#">
        <img src="logo.png" alt="Logo">
      </a>
      <a role="button" class="navbar-burger" aria-label="menu" aria-expanded="false" @click="toggleMenu">
        <span aria-hidden="true"></span>
        <span aria-hidden="true"></span>
        <span aria-hidden="true"></span>
      </a>
    </div>
    <div class="navbar-menu" :class="{ 'is-active': isMenuActive }">
      <div class="navbar-start">
        <a class="navbar-item" href="#">Accueil</a>
        <div class="navbar-item has-dropdown is-hoverable">
          <a class="navbar-link">
            Mes annonces
          </a>
          <div class="navbar-dropdown">
            <router-link :to="{name: 'AddAnnonce'}" class="navbar-item"> Déposer une annonce</router-link>
          </div>
        </div>
      </div>
      <div class="navbar-end">
        <div class="navbar-item has-dropdown is-hoverable">
          <a class="navbar-link">
            Mon compte
          </a>
          <div class="navbar-dropdown">
            <a class="navbar-item" href="#">Profil</a>
            <a class="navbar-item" href="#">Paramètres</a>
            <hr class="navbar-divider">
            <a class="navbar-item" href="#">Déconnexion</a>
          </div>
        </div>
      </div>
    </div>
  </nav>
    </div>
    
</template>

<script>
 
export default {
  
    name:'NavBarUser'
}
</script>

<style lang="scss" scoped>

</style>
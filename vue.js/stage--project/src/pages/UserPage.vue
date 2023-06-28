<template>
   <div class="user-page">
    <nav-bar-user/>
    <produit-card/>
  </div>
  
</template>

<script>
import NavBarUser from '../components/NavBarUser.vue'
import ProduitCard from '../components/ProduitCard.vue'

export default {
  components: { NavBarUser, ProduitCard },
    name : 'UserPage',
}
</script>

<style>

</style>
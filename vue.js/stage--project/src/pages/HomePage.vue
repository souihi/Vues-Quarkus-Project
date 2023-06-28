<template>
  <div class="homePage">
    <nav-bar-home/>
    <airbnb-card/>
    <footer-page/>
  </div>
</template>

<script>
import NavBarHome from '../components/NavBarHome.vue';
import AirbnbCard from '../components/AirbnbCard.vue';
import FooterPage from '../components/FooterPage.vue';

export default {
  components: { NavBarHome, AirbnbCard, FooterPage },
    name : 'HomePage',
   
};
</script>

<style scoped>

</style>
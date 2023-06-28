<template>
  <div class="airbnb--row">
    <h2 class="title">
        Nos salles
    </h2>
    <div class="wrapper--card">
      <AirbnbCard v-for="(card, index) in tabAirbnb " :infoAirbnb="card" :key="index"/>
    </div>
  </div>

</template>

<script>
import AirbnbCard from './AirbnbCard.vue';
export default {
  name: "AirbnbRow",
  components:{
    AirbnbCard,
  },
  props:{
    tabAirbnb : {
     type : Array,
     required: true
  }}
}
</script>

<style lang="scss">
.airbnb--row{
  padding-left: 50px;
  padding-right: 50px;
  
  .titel{
    font-size: 2rem;
  }
    .wrapper--card{
        display: flex;
        justify-content: space-between;
        margin-bottom: 40px;
    }
    
}
</style>
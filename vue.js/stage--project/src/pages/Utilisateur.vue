<template>
    <div class="utilisateur">
        <nav-bar-admin/>
      <div class="card" v-for="(userTab, index) in users" :key="index">
        <div class="card-content">
          <div class="media">
            <div class="media-left">
              <figure class="image is-48x48">
                <img  alt="User Avatar">
              </figure>
            </div>
            <div class="media-content">
              <p class="title is-4">{{userTab.firstName}} {{ userTab.lastName }}</p>
              <p class="subtitle is-6">{{userTab.email}}</p>
            </div>
            <RouterLink :to="{path: '/AdminPage/Utilisateur/' +userTab.id+'/edit' }" class="button is-info is-small" >
              Editer
            </RouterLink>
          </div>
          <div class="content">
            <p>{{userTab.phoneNumber}}</p>
            <p>{{userTab.roleId}}</p>
            <p>{{userTab.id}}</p>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
import NavBarAdmin from '../components/NavBarAdmin.vue';
import { getUser } from '../api/Users.js';

  export default {
  components: { NavBarAdmin, },
    name:'Utili--sateur',
    data() {
      return {
        users: [],
      };
    },
    methods:{
      async loadUser() { //Méthode afin d'afficher les utilisateurs 
      try {
        this.users = await getUser();
        console.log(this.users);
      } catch (error) {
          console.error(error);
          throw error;
      }
    },
    },
    mounted(){// Je monte la fonction loader
      this.loadUser();
    }
  };
  </script>
  
  <style lang="scss" scoped>
  .card {
    margin-bottom: 1.5rem;
  }
  </style>
  
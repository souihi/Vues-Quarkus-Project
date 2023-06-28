<template>
  <div class="inscription">
    <div class="container">
      <h1 class="title">Formulaire d'inscription</h1>
      <form @submit.prevent="submitForm">
        <div class="field">
          <label class="label" for="first_name">Prénom:</label>
          <div class="control">
            <input class="input" type="text" id="first_name"  v-model="userData.firstName" required />
          </div>
        </div>
        <div class="field">
          <label class="label" for="last_name" >Nom:</label>
          <div class="control">
            <input class="input" type="text" id="last_name" v-model="userData.lastName" required />
          </div>
        </div>
        <div class="field">
          <label class="label" for="email">Email:</label>
          <div class="control">
            <input class="input" type="email" id="email" v-model="userData.email" required />
          </div>
        </div>
        <div class="field">
          <label class="label" for="password">Mot de passe:</label>
          <div class="control">
            <input class="input" type="password" id="password"  v-model="userData.password" required />
          </div>
        </div>
        <div class="field">
          <label class="label" for="phone_number">Numéro de téléphone:</label>
          <div class="control">
            <input class="input" type="tel" id="phone_number" v-model="userData.phoneNumber" required />
          </div>
        </div>
        <div class="field">
          <div class="control">
            <router-link :to="{ name: 'UserPage' }">
              <button class="button is-primary"  @click="createUser" type="submit">
                S'inscrire
              </button>
            </router-link>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
import { postUsers } from '@/api/Users';
export default {
  name: "Inscr--iption",
  data(){
    return{
      users:[],
      userData: {
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        phoneNumber: "",
      },
    };
  },
  methods:{
    async createUser() {
      try {
        const newUser = await postUsers(this.userData); // Enregistrer le nouvel utilisateur renvoyé par postUsers
        this.users.push(newUser); // Ajouter le nouvel utilisateur à la liste des utilisateurs
        this.userData.firstName = ""; // Vider les champs
        this.userData.lastName = "";
        this.userData.email = "";
        this.userData.password = "";
        this.userData.phoneNumber = "";
        this.userData.email = "";
        alert("Sucess");
      } catch (error) {
        console.error(error);
        throw error;
      }
    },
  }
};
</script>

<style lang="scss">
.inscription {
  display: grid;
  padding: 50px;
}
</style>
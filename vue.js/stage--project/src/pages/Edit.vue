<template>
  <div class="edit">
    <div class="container">
      <h1 class="title">Mise à jour</h1>
      <form>
        <div class="field">
          <label class="label" for="first_name">Prénom: </label>
          <div class="control">
            <input
              class="input"
              type="text"
              id="first_name"
              v-model="userData.firstName"
              required
            />
          </div>
          <div class="control">
            <input
              class="input"
              type="text"
              placeholder=""
              v-model="userData.id"
              disabled
            />
          </div>
        </div>
        <div class="field">
          <label class="label" for="last_name">Nom:</label>
          <div class="control">
            <input
              class="input"
              type="text"
              id="last_name"
              v-model="userData.lastName"
              required
            />
          </div>
        </div>
        <div class="field">
          <label class="label" for="email">Email:</label>
          <div class="control">
            <input
              class="input"
              type="email"
              id="email"
              v-model="userData.email"
              required
            />
          </div>
        </div>
        <div class="field">
          <label class="label" for="password">Mot de passe:</label>
          <div class="control">
            <input
              class="input"
              type="password"
              id="password"
              v-model="userData.password"
              required
            />
          </div>
        </div>
        <div class="field">
          <label class="label" for="phone_number">Numéro de téléphone:</label>
          <div class="control">
            <input
              class="input"
              type="tel"
              id="phone_number"
              v-model="userData.phoneNumber"
              required
            />
          </div>
        </div>
        <div class="field">
          <div class="control">
            <button class="button is-primary" @click="updateUser" type="submit">
              Mettre à jour
            </button>

            <button class="button is-danger" @click="deleteUser" type="submit">
              Supprimer 
            </button>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
// IMPORT API
import { putUsers, getUser, deleteUsers } from "../api/Users";
export default {
  name: "Edi-t",
  data() {
    return {
      users: [],
      userData: {
        id: "",
        firstName: "",
        lastName: "",
        email: "",
        password: "",
        phoneNumber: "",
      },
    };
  },
  mounted() {
    this.userId = this.$route.params.userId; // Récuperation de l'id de la page
    console.log(this.userId);
    this.loadUser();
  },
  methods: {
    //Affiche les users
    async loadUser() {
      try {
        this.users = await getUser();
        console.log(this.users);
        const userId = parseInt(this.userId); // Convertir l'ID en nombre entier
        const user = this.users.find((u) => u.id === userId); // Rechercher l'utilisateur correspondant à l'ID
        if (user) {
          //si l'user existe alors les données sont envoyés dans le user Data afin de les récuprer dans le vmodel
          this.userData = {
            firstName: user.firstName,
            lastName: user.lastName,
            email: user.email,
            password: user.password,
            phoneNumber: user.phoneNumber,
          };
        } else {
          console.error(`Utilisateur avec l'ID ${this.userId} introuvable.`);
        }
      } catch (error) {
        console.error(error);
        throw error;
      }
    },
    // Fonction de MAJ de l'user
    async updateUser() {
      try {
        const updateUser = await putUsers(this.userId, this.userData); // Dans mon post je met l'id de la page ainsi que les données que je veux modifier
        console.log(updateUser);
      } catch (error) {
        console.error(error);
        throw error;
      }
    },
    // Fonction supprimer l'user
    async deleteUser(){
      try {
        const delUser = await deleteUsers(this.userId);
        console.log(delUser)
      } catch (error) {
        console.error(error);
        throw error;
      }
    }
  },
};
</script>

<style>
</style>
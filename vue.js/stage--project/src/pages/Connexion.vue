<template>
  <div class="connexion">
    <div class="container">
    <h1 class="title">Formulaire de connexion</h1>
    <form @submit.prevent="submitForm">
      <div class="field">
        <label class="label" for="email">Email:</label>
        <div class="control">
          <input class="input" type="email" id="email"  required>
        </div>
      </div>
      <div class="field">
        <label class="label" for="password">Mot de passe:</label>
        <div class="control">
          <input class="input" type="password" id="password"  required>
        </div>
      </div>
      <div class="field">
        <div class="control has-text-centered">
          <router-link :to="{name : 'AdminPage'}">
          <button class="button is-primary" type="submit">Se connecter</button>
        </router-link>
        </div>
      </div>
    </form>
  </div>
  
  </div>
</template>

<script>
export default {
name : 'Conn--exion'
}
</script>

<style lang="scss">
.connexion{
    display: grid;
    padding: 200px;
}
</style>
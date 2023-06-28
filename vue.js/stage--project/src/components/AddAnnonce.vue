<template>
  <nav-bar-user/>
    <div class="addAnnonce">
    
      <div class="field">
        <label class="label">Nom de l'espace</label>
        <div class="control">
          <input class="input" type="text" name="spaceName" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Description de l'espace</label>
        <div class="control">
          <textarea class="textarea" name="spaceDescription" required></textarea>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Adresse de l'espace</label>
        <div class="control">
          <input class="input" type="text" name="spaceAddress" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Ville de l'espace</label>
        <div class="control">
          <input class="input" type="text" name="spaceCity" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Pays de l'espace</label>
        <div class="control">
          <input class="input" type="text" name="spaceCountry" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Code postal de l'espace</label>
        <div class="control">
          <input class="input" type="text" name="spaceZipCode" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Capacité de l'espace</label>
        <div class="control">
          <input class="input" type="number" name="spaceCapacity" required>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Type d'espace</label>
        <div class="control">
          <div class="select">
            <select name="spaceType" required>
              <option disabled selected>Choisissez le type d'espace</option>
              <option value="salle de réunion">Salle de réunion</option>
              <option value="bureau">Bureau</option>
              <option value="espace de coworking">Espace de coworking</option>
              <!-- Ajoutez d'autres options si nécessaire -->
            </select>
          </div>
        </div>
      </div>
  
      <div class="field">
        <label class="label">Équipements disponibles</label>
        <div class="control">
          <div class="select" multiple>
            <select name="spaceAmenities[]" required>
              <option disabled selected>Sélectionnez les équipements disponibles</option>
              <option value="WiFi">WiFi</option>
              <option value="imprimante">Imprimante</option>
              <option value="café">Café</option>
              <!-- Ajoutez d'autres options si nécessaire -->
            </select>
          </div>
        </div>
      </div>
  
      <!-- Ajoutez d'autres champs si nécessaire -->
  
      <div class="field">
        <div class="control">
          <button class="button is-primary" type="submit">Ajouter l'annonce</button>
        </div>
      </div>
    </div>
</template>
<script>
import NavBarUser from './NavBarUser.vue'
export default{
  components: { NavBarUser },
    name : 'AddAnnonce',
}
</script>
<style lang="scss" scooped>
.addAnnonce{
  display: grid;
  padding: 200px;
  justify-content: center;
}
</style>
  
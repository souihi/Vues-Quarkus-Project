import { createApp } from 'vue'
import App from './App.vue'

import { createRouter, createWebHistory } from 'vue-router';
import HomePage from './pages/HomePage.vue';
import Connexion from './pages/Connexion.vue';
import Inscription from './pages/Inscription.vue';
import AdminPage from './pages/AdminPage.vue';
import Utilisateur from './pages/Utilisateur.vue';
import Produit from './pages/Produit.vue';
import UserPage from './pages/UserPage.vue';
import AddAnnonce from './components/AddAnnonce.vue';
import Edit from './pages/Edit.vue'
const routes = [
  { path: '/',  component: HomePage ,name: 'HomePage' },
  {name : 'Connexion', path : '/Connexion', component:Connexion},
  {name : 'Inscription', path : '/Inscription',component: Inscription},
  {name : 'AdminPage', path : '/AdminPage', component : AdminPage },
  {name : 'Utilisateur', path : '/AdminPage/Utilisateur', component : Utilisateur},
  {name : 'Produit', path : '/AdminPage/Produit', component : Produit},
  {name : 'UserPage', path : '/UserPage', component : UserPage},
  {name : 'AddAnnonce', path : '/AddAnnonce', component : AddAnnonce},
  {name : 'Edit', path : '//AdminPage/Utilisateur/:userId/Edit', component : Edit},

]

const router = createRouter({
  history: createWebHistory(),
  routes
});

const VueApp = createApp(App)

VueApp.use(router)

VueApp.mount('#app');
<template>
  <nav-bar-admin/>
  <produit-row/>
</template>

<script>
//IMPORT BDD
// import BDDV2 from '../BDDV2.js'
// import {onMounted,ref, watch} from 'vue'

import NavBarAdmin from '@/components/NavBarAdmin.vue';
import ProduitRow from '@/components/ProduitRow.vue';
// import { onUnmounted, ref } from 'vue';
export default {
    name:'Prod--uit',
    components:{
    NavBarAdmin,
    ProduitRow,
    }
}
//     setup(){
//         class Database {
//         constructor(data) {
//             this.data = data;
//         }

//         getAllUsers() {
//             return this.data[0].users;
//         }

//         getAllRoles() {
//             return this.data[0].roles;
//         }

//         getAllSpaces() {
//             return this.data[0].spaces;
//         }

//         getAllBookings() {
//             return this.data[0].bookings;
//         }

//         getAllData() {
//             return this.data[0];
//         }
//         }

//         // Utilisation de la classe Database avec les données "info"
//         const database = new Database(BDDV2);
//         let allProduit = [];
//         allProduit.push(database);
//         console.log(allProduit.getAllBookings());
//     }
// }

</script>

<style>

</style>
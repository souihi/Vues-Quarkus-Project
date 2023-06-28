<template>
<div id="app">
<router-view></router-view>
</div>
</template>

<script>
export default {
  name: 'App',
}
</script>

<style>
@import url('./style/reset.css');
@import url('https://fonts.googleapis.com/css2?family=Roboto%3Awght%40300%3B400%3B700&display=swap');
@import url('https://cdn.jsdelivr.net/npm/bulma@0.9.4/css/bulma-rtl.min.css');
#app {
  font-family: 'Roboto', sans-serifs;
  padding: 0px,30px;

}
</style>

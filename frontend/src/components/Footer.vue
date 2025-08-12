<template>
  <footer>
    <p>&copy; {{ new Date().getFullYear() }} Vue-Spring Application. All rights reserved.</p>
  </footer>
</template>

<script>
export default {
  name: 'Footer'
}
</script>

<style scoped>
footer {
  background-color: #2c3e50;
  color: white;
  padding: 1rem;
  text-align: center;
  margin-top: auto;
}
</style>
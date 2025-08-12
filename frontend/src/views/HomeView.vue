<template>
  <div class="home">
    <h1>Welcome to Vue-Spring App</h1>
    <p>This is a single-page application built with Vue.js and Spring Boot</p>

    <div class="api-demo">
      <button @click="fetchMessage">Call Spring API</button>
      <p v-if="message">{{ message }}</p>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'HomeView',
  data() {
    return {
      message: null
    };
  },
  methods: {
    async fetchMessage() {
      try {
        const response = await axios.get('/api/hello');
        this.message = response.data;
      } catch (error) {
        console.error('Error fetching message:', error);
        this.message = 'Failed to fetch data';
      }
    }
  }
}
</script>

<style scoped>
.home {
  padding: 20px;
}

.api-demo {
  margin-top: 40px;
  padding: 20px;
  background-color: #e8f4fd;
  border-radius: 8px;
}

button {
  padding: 10px 20px;
  background-color: #3498db;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 1rem;
}

button:hover {
  background-color: #2980b9;
}
</style>
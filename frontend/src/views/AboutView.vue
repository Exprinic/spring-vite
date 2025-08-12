<template>
  <div class="about">
    <h1>About This Project</h1>
    <p>This is a demonstration of a Spring Boot + Vue.js application with the following features:</p>

    <ul>
      <li>Frontend-backend separation</li>
      <li>Vue Router for client-side routing</li>
      <li>Axios for API communication</li>
      <li>No file extension in URLs</li>
      <li>Proper handling of page refreshes</li>
    </ul>

    <div class="tech-stack">
      <h2>Technology Stack</h2>
      <div class="tech-cards">
        <div class="tech-card">
          <h3>Frontend</h3>
          <p>Vue.js 3</p>
          <p>Vue Router</p>
          <p>Axios</p>
        </div>
        <div class="tech-card">
          <h3>Backend</h3>
          <p>Spring Boot 3</p>
          <p>Spring Web MVC</p>
        </div>
        <div class="tech-card">
          <h3>Tooling</h3>
          <p>IntelliJ IDEA</p>
          <p>Maven</p>
          <p>npm</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'AboutView'
};
</script>

<style scoped>
.about {
  max-width: 800px;
  margin: 0 auto;
  padding: 20px;
  text-align: left;
}

ul {
  margin: 20px 0;
  padding-left: 20px;
}

li {
  margin-bottom: 10px;
}

.tech-stack {
  margin-top: 40px;
}

.tech-cards {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  margin-top: 20px;
}

.tech-card {
  flex: 1;
  min-width: 200px;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  background-color: #f5f5f5;
}

.tech-card h3 {
  margin-top: 0;
  color: #42b983;
  border-bottom: 1px solid #ddd;
  padding-bottom: 10px;
}
</style>
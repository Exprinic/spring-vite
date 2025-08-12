import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'

// 配置 axios 基础路径
axios.defaults.baseURL = '/api'

const app = createApp(App)
app.use(router)
app.mount('#app')
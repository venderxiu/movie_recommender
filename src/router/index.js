import Vue from 'vue'
import VueRouter from 'vue-router'
import Login from '../components/Login.vue'
import MovieList from '../components/movie/recommend.vue'
import Classify from '../components/movie/classification.vue'
import HotRecommendList from '../components/movie/hotRecommendList.vue'
import ForYouRecommendList from '../components/movie/forYouRecommendList.vue'
import Home from '../components/home.vue'
import SearchList from '../components/movie/seachList.vue'

Vue.use(VueRouter)

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

const routes = [{
		path: '/',
		redirect: '/login'
	},
	{
		path: '/login',
		component: Login
	},
	{
		path: '/home',
		component: Home,
		children: [{
				path: '/movieList',
				component: MovieList
			},
			{
				path: '/classification',
				component: Classify
			},
			{
				path: '/hotRecommendList',
				component: HotRecommendList
			},
			{
				path: '/forYouRecommendList',
				component: ForYouRecommendList
			},
			{
				path: '/searchList',
				component: SearchList
			}
		]
	}
]

const router = new VueRouter({
	routes
})

export default router

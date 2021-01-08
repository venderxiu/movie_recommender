<template>
	<el-container>
		<el-aside width="200px">
			<el-menu :default-active = "activeIndex" class="el-menu-demo" mode="vertical" @select="handleSelect">
				<el-menu-item index="/movieList">
					<i class="el-icon-message"></i>首页
				</el-menu-item>
				<el-menu-item index="/classification">
					<template slot="title"><i class="el-icon-menu"></i>分类</template>
				</el-menu-item>
			</el-menu>
		</el-aside>
		<el-container>
			<el-header>
				<el-header style="text-align: right; font-size: 12px">
					<el-row>
						<el-col :span="3" style="color: black; font-size: 24px;">
							电影推荐
						</el-col>
						<el-col :span="5" :offset="3">
							<el-input placeholder="搜索电影" prefix-icon="el-icon-search" v-model="input">
							</el-input>
						</el-col>
							<el-col :span="1">
								<el-button icon="el-icon-search" circle @click="searchFilm('/searchList')"></el-button>
							</el-col>
							<el-col :span="12">
								<!-- <el-button type="text" class="button" @click="login('/login')">登录</el-button> -->
								<span>欢迎 {{username}}</span>
							</el-col>
					</el-row>
						<el-row>
							<el-divider style="width: 100%;"></el-divider>
						</el-row>
				</el-header>
			</el-header>
			<el-main style="margin-top: 10px;">
				<router-view></router-view>
			</el-main>
		</el-container>
	</el-container>
</template>

<script>
	export default {
		name: "App",
		data() {
			return {
				activeIndex: '/movieList',
				input: '',
				username:''
			};
		},
		methods: {
			handleSelect(key,keyPath){
				// console.log(key);
				// console.log(keyPath);
				this.$router.push(key);
			},
			login(path) {
				//跳转到登录注册界面
				this.$router.push(path);
			},
			searchFilm(path){
				//获取input栏里面的数据,this.input
				console.log(this.input);
				//搜索，将结果传到searchList界面
				//先判断一下input是否为空
				if(this.input != ''){
					this.$router.push({path:path,query:{searchInput :this.input}});
				}
				//再决定是否跳转
				//加载到下面的列表
			}
		},
		created() {
			console.log(this.$route.query.username);
			this.username = this.$route.query.username;
			
		}
	}
</script>

<style scoped>
	.el-header {
		text-align: center;
		margin-top: 10px;
	}
</style>

<template>
	<el-container>
		<el-header>
			<el-card>
				<el-radio-group v-model="radio" style="float: left; width: 100%;" @change="onclick(radio)">
					<el-row style="margin-left: 5px; width: 100%;">
						<el-col :span="2">
							<el-radio label="Action">动作</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Adventure">冒险</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Animation">动画</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Children">儿童</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Comedy">喜剧</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Crime">犯罪</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Documentary">纪录片</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Drama">戏剧</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Western">西方</el-radio>
						</el-col>
					</el-row>
					<el-row style="margin-left: 5px; width: 100%;">
						<el-col :span="2">
							<el-radio label="Fantasy">玄幻</el-radio>
						</el-col>
						<el-col :span="3">
							<el-radio label="Film-Noir">黑色电影</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Horror">恐怖片</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Musical">音乐剧</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Mystery">悬疑</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Romance">浪漫</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Sci-Fi">科幻</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="Thriller">惊悚</el-radio>
						</el-col>
						<el-col :span="2">
							<el-radio label="War">战争</el-radio>
						</el-col>
					</el-row>
				</el-radio-group>
			</el-card>
		</el-header>
		<el-main>
			<el-row>
				<br />
			</el-row>
			<el-row>
				<div class="block" v-for="fit in fits" :key="fit">
					<div class="block" v-for="url in urls" :key="url">
						<el-col :span="4">
							<el-row>
								<el-image style="width: 130px; height: 160px" :src="require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
							</el-row>
							<el-row>
								<span class="demonstration" style="margin-top: 15dp; text-align: center;">{{ url.title }}</span>
							</el-row>
							<el-row></el-row>
						</el-col>
					</div>
				</div>
			</el-row>
			<el-row>
				<div class="block" align="center">
					<!-- <span class="demonstration">大于 7 页时的效果</span> -->
					<el-pagination 
					layout="prev, next, total" 
					:total="total" 
					prev-text="上一页" 
					next-text="下一页" 
					style="margin: 15px 0px;"
					:page-size="pagesize"
					:current-page="pageNow"
					@current-change="findPage"
					@size-change="findSize"
					>
					</el-pagination>
				</div>
			</el-row>
		</el-main>
	</el-container>
</template>
<script>
	export default {
		data() {
			return {
				radio: 'Action',
				answer:[],
				fits: ['cover'],
				urls: [],
				total: 0,
				pagesize: 6,
				pageNow:1
			}
		},
		methods: {
			onclick(radio){
				//获取value值
				//然后将这个值传到后台，去获取movielist列表
				console.log(radio);
				this.$http.post("http://localhost:8082/moviedemo/movies/typeByPage?type="+this.radio+"&now="+this.pageNow+"&size="+ this.pagesize).then(res => {
					this.total = res.data.typeTotal;
					this.urls = res.data.typeMovies;
					console.log(this.totalHot);
					console.log(this.urls);
				});
			},
			findPage(page){
				this.pageNow = page;
				this.$http.post("http://localhost:8082/moviedemo/movies/typeByPage?type="+this.radio+"&now="+this.pageNow+"&size="+ this.pagesize).then(res => {
					this.total = res.data.typeTotal;
					this.urls = res.data.typeMovies;
					console.log(this.totalHot);
					console.log(this.urls);
				});
				//再执行操作
			}
		},
		created() {
			//分类，一开始加载Action类的，因为Action默认选中
			console.log("hello");
			this.$http.post("http://localhost:8082/moviedemo/movies/typeByPage?type="+this.radio+"&now="+this.pageNow+"&size="+ this.pagesize).then(res => {
				this.total = res.data.typeTotal;
				this.urls = res.data.typeMovies;
				console.log(this.totalHot);
				console.log(this.urls);
			});
		}
	}
</script>

<style scoped>
	.el-row {
		margin-bottom: 20px;

		&:last-child {
			margin-bottom: 0;
		}
	}

	.bg-purple-dark {
		background: #99a9bf;
	}

	.bg-purple {
		background: #d3dce6;
	}

	.bg-purple-light {
		background: #e5e9f2;
	}


	.row-bg {
		padding: 10px 0;
		background-color: #f9fafc;
	}
	.text {
		font-size: 14px;
	}

	.item {
		padding: 18px 0;
	}

	.box-card {
		width: 100%;
		height: 115px;

	}
</style>

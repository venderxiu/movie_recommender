<template>
	<div class="demo-image" align="center">
		<el-row style="text-align: left;">
			<el-col :span="3">
				<el-button circle="" icon="el-icon-back" @click="back('/movieList')"></el-button>
			</el-col>
		</el-row>
		<el-row>
			<span style="font-size: 20px;">搜索结果</span>
			<el-divider></el-divider>
		</el-row>
		<el-row>
			<div class="block" v-for="fit in fits" :key="fit">
				<div class="block" v-for="url in urls" :key="url">
					<el-col :span="4" >
						<el-row>
							<el-image style="width: 130px; height: 160px" :src="require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
						</el-row>
						<el-row>
							<span class="demonstration" style="margin-top: 15dp;">{{ url.title }}</span>
						</el-row>
						<el-row></el-row>
					</el-col>
				</div>
			</div>
		</el-row>
		<el-row>
			<div class="block">
				<!-- <span class="demonstration">大于 7 页时的效果</span> -->
				<el-pagination layout="prev,next, total" 
				:total="total" 
				prev-text="上一页" 
				next-text="下一页" 
				style="margin: 15px 0px;"
				:page-size="pagesize"
				 :current-page="pageNow"
				@current-change="findPage" 
				@size-change="findSize">
				</el-pagination>
			</div>
		</el-row>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				// 到时候，把url改成对象，存名字和图片
				fits: ['cover'],
				urls: [],
				total: 0,
				pagesize: 6,
				pageNow:1
			}
		},
		methods:{
			back(path){
				this.$router.push(path);
			},
			findPage(page){
				this.pageNow = page;
				this.$http.post("http://localhost:8082/moviedemo/movies/selectKeyWords?title="+this.$route.query.searchInput+"&now="+this.pageNow+"&rows="+ this.pagesize).then(res => {
					this.urls = res.data.searchResult;
				});
			}
		},
		created() {
			//点进来的时候就初始化列表
			//先从数据库读取列表
			//再显示
			console.log(this.$route.query.username);
			this.$http.post("http://localhost:8082/moviedemo/movies/selectKeyWords?title="+this.$route.query.searchInput+"&now="+this.pageNow+"&rows="+ this.pagesize).then(res => {
				this.total = res.data.totalSearch;
				this.urls = res.data.searchResult;
				console.log(this.total);
				console.log(this.urls);
			});
		}
		
	}
</script>

<style>
</style>

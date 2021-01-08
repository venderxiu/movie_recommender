<template>
<div class="demo-image" align="center">
		<el-row>
			<span style="font-size: 20px;">热门推荐</span>
			<el-divider></el-divider>
		</el-row>
		<el-row>
			<div class="block" v-for="fit in fits" :key="fit">
				<div class="block" v-for="url in urls" :key="url">
					<el-col :span="4">
						<el-row>
							<el-image style="width: 130px; height: 160px" :src="require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
						</el-row>
						<el-row>
							<!-- <span class="demonstration" style="margin-top: 15dp;">{{ url.title }}</span> -->
							{{url.title}}
						</el-row>
						<el-row>
							<br />
						</el-row>
					</el-col>
				</div>
			</div>
		</el-row>
		<el-row>
			<div class="block">
				<el-pagination 
				layout="prev, next, total" 
				:total="total" 
				prev-text="上一页" 
				next-text="下一页" 
				style="margin: 15px 0px;"
				:page-size="pagesize"
				:current-page="pageNow"
				@current-change="findPage"
				>
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
				total:0,
				pagesize:6,
				pageNow:1
			}
		},
		methods:{
			findPage(page){
				console.log(page);
				this.pageNow = page;
				this.$http.post("http://localhost:8082/moviedemo/scorecount/findHotsByPage?now="+this.pageNow+"&size="+ this.pagesize).then(res => {
					this.total = res.data.hotTotal;
					this.urls = res.data.hotMovies;
					console.log(this.totalHot);
					console.log(this.urls);
				});
			}
		},
		created() {
			//点进来的时候就初始化列表
			//先从数据库读取列表
			this.$http.post("http://localhost:8082/moviedemo/scorecount/findHotsByPage?now="+this.pageNow+"&size="+ this.pagesize).then(res => {
				this.total = res.data.hotTotal;
				this.urls = res.data.hotMovies;
				console.log(this.totalHot);
				console.log(this.urls);
			});
			//再显示
		}
	}
</script>

<style>
</style>

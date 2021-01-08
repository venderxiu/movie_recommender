<template>
<div class="demo-image" align="center">
		<el-row>
			<span style="font-size: 20px;">为你推荐</span>
			<el-divider></el-divider>
		</el-row>
		<el-row>
			<div class="block" v-for="fit in fits" :key="fit">
				<div class="block" v-for="url in urls" :key="url">
					<el-row>
						<el-col :span="4">
							<el-row>
								<el-image style="width: 130px; height: 160px" :src="require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
							</el-row>
							<el-row>
								<span class="demonstration" style="margin-top: 15dp;">{{ url.title }}</span>
							</el-row>
						</el-col>
					</el-row>
				</div>
			</div>
		</el-row>
		<el-row>
			<div class="block">
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
				this.pageNow = page;
				// this.$http.get("http://localhost:8181/recommender/individuation?userid="+1).then(res => {
				// 	this.totalForYou = res.data.hotTotal;
				// 	this.urls1 = res.data.hotMovies;
				// 	console.log(this.totalForYou);
				// 	console.log(this.urls1);
				// });	
			}
		},
		created() {
			//点进来的时候就初始化列表
			//先从数据库读取列表
			//再显示
			//为你推荐
			//这里你写一下方法,userid写死一个
			// //传一下,movieList的size，做一下分页
			//需要userid,pageNow,pagesize
			// this.$http.get("http://localhost:8181/recommender/individuation?userid="+1).then(res => {
			// 	this.totalForYou = res.data.hotTotal;
			// 	this.urls1 = res.data.hotMovies;
			// 	console.log(this.totalForYou);
			// 	console.log(this.urls1);
			// });
		}
	}
</script>

<style>
</style>

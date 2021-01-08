<template>
	<!-- 热门推荐 -->
	<div class="demo-image" align="center">
		<el-row>
			<span style="font-size: 20px;">热门推荐</span>
			<el-divider></el-divider>
		</el-row>
		<el-row>
			<el-col :span="2" offset="22">
				<el-button type="text" style="font-size: 18px;color: black;" @click="moreHot('/hotRecommendList')"> >>查看更多</el-button>
			</el-col>
		</el-row>
		<el-row>
			<div class="block" v-for="fit in fits" :key="fit">
				<div class="block" v-for="url in urls" :key="url">
					<el-col :span="5" :offset="1">
						<el-row>
							<el-image style="width: 130px; height: 160px" :src = "require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
						</el-row>
						<el-row>
							<span class="demonstration" style="margin-top: 15dp;">{{ url.title }}</span>
						</el-row>
						<el-row>
							<br />
						</el-row>
					</el-col>
				</div>
			</div>
		</el-row>
		<div class="block">
			<!-- <span class="demonstration">大于 7 页时的效果</span> -->
			<el-pagination layout="total" :total="totalHot" prev-text="上一页" next-text="下一页" style="margin: 15px 0px;">
			</el-pagination>
		</div>
		<el-row>
			<span style="font-size: 20px;">为你推荐</span>
			<el-divider></el-divider>
		</el-row>
		<el-row>
			<el-col :span="2" offset="22">
				<el-button type="text" style="font-size: 18px;color: black;" @click="moreRecommend('/forYouRecommendList')"> >>查看更多</el-button>
			</el-col>
		</el-row>
		<el-row>
			<div class="block" v-for="fit in fits" :key="fit">
				<div class="block" v-for="url in urls1" :key="url">
					<el-col :span="5" :offset="1">
						<el-row>
							<el-image style="width: 130px; height: 160px" :src="require('@/assets/'+url.cover+'.jpg')" :fit="fit"></el-image>
						</el-row>
						<el-row>
							<span class="demonstration" style="margin-top: 15dp;">{{ url.title }}</span>
						</el-row>
						<el-row>
							<br/>
						</el-row>
					</el-col>
				</div>
			</div>
		</el-row>
		<el-row>
			<div class="block">
				<!-- <span class="demonstration">大于 7 页时的效果</span> -->
				<el-pagination layout="total" :total="totalForYou"  style="margin: 15px 0px;">
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
				urls1: [],
				totalHot:0,
				totalForYou:0,
			}
		},
		methods: {
			moreHot(route) {
				this.$router.push(route);
			},
			moreRecommend(route) {
				this.$router.push(route);
			}
		},
		created() {
			//热门推荐
			this.$http.post("http://localhost:8082/moviedemo/scorecount/findHotsByPage?now="+1+"&size="+ 4).then(res => {
				this.totalHot = res.data.hotTotal;
				this.urls = res.data.hotMovies;
				console.log(this.totalHot);
				console.log(this.urls);
			});
			//为你推荐
			//这里你写一下方法,userid写死一个
			// //传一下,movieList的size，做一下分页
			// this.$http.get("http://localhost:8181/recommender/individuation?userid="+1).then(res => {
			// 	this.totalForYou = res.data.hotTotal;
			// 	this.urls1 = res.data.hotMovies;
			// 	console.log(this.totalForYou);
			// 	console.log(this.urls1);
			// });
			//初始化的时候，直接加载列表
		}
	}
</script>

<style>
</style>

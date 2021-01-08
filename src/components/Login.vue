<template>
	<div>
		<el-card class="box-card">
			<el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
				<el-form-item label="用户名" prop="username">
					<el-input v-model="ruleForm.username" placeholder="请输入用户名"></el-input>
				</el-form-item>
				<el-form-item label="密码" prop="pass">
					<el-input type="password" v-model="ruleForm.pass" autocomplete="off" placeholder="请输入密码"></el-input>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
					<el-button @click="resetForm('ruleForm')">重置</el-button>
				</el-form-item>
			</el-form>
		</el-card>
	</div>
</template>

<script>
	export default {
		data() {
			var validateUsername = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请输入用户名'));
				} else {
					if (this.ruleForm.pass !== '') {
						this.$refs.ruleForm.validateField('pass');
					}
					callback();
				}
			};
			var validatePass = (rule, value, callback) => {
				if (value === '') {
					callback(new Error('请输入密码'));
				} else {
					callback();
				}
			};
			return {
				ruleForm: {
					pass: '',
					username: ''
				},
				rules: {
					pass: [{
						validator: validatePass,
						trigger: 'blur'
					}],
					username: [{
						validator: validateUsername,
						trigger: 'blur'
					}]
				}
			};
		},
		methods: {
			submitForm(formName) {
				const self = this;
				this.$refs[formName].validate((valid) => {
					if (valid) {
						// 选中的选项绑定到了V-model
						//先获取选择的权限
						//值在选中之后，通过@change事件，将他保存到了authority上
						//挂号员，再判断用户名密码是否正确
						if (this.ruleForm.username == '123' & this.ruleForm.pass == '123') {
							// self.$router.push({
							// 	path: '/home'
							// });
							this.$router.push({path:'/home',query:{username :this.ruleForm.username}});
						} else {
							self.$message.error('用户名或密码错误');
							// self.$router.push({
							// 	path: 'docVisiting'
							// });
						}
					} else {
						return false;
					}
				});
			},
			resetForm(formName) {
				this.$refs[formName].resetFields();
			}
		}
	}
</script>

<style scoped>
	.text {
		font-size: 14px;
	}

	.item {
		padding: 18px 0;
	}

	.box-card {
		width: 400px;
		position: absolute;
		left: 50%;
		top: 50%;
		transform: translate(-50%, -50%);
	}
</style>

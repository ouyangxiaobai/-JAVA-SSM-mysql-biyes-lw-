import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import discussjuankuanxinxi from '@/views/modules/discussjuankuanxinxi/list'
    import qiuzhuxinxi from '@/views/modules/qiuzhuxinxi/list'
    import juanzengxinxi from '@/views/modules/juanzengxinxi/list'
    import discussaixinxinxi from '@/views/modules/discussaixinxinxi/list'
    import wangzhangonggao from '@/views/modules/wangzhangonggao/list'
    import storeup from '@/views/modules/storeup/list'
    import users from '@/views/modules/users/list'
    import yonghu from '@/views/modules/yonghu/list'
    import juankuanxinxi from '@/views/modules/juankuanxinxi/list'
    import discussqiuzhuxinxi from '@/views/modules/discussqiuzhuxinxi/list'
    import aixinzhiqu from '@/views/modules/aixinzhiqu/list'
    import messages from '@/views/modules/messages/list'
    import wupinhuishou from '@/views/modules/wupinhuishou/list'
    import discusswangzhangonggao from '@/views/modules/discusswangzhangonggao/list'
    import aixinxinxi from '@/views/modules/aixinxinxi/list'
    import yuanzhu from '@/views/modules/yuanzhu/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
          ,{
	path: '/discussjuankuanxinxi',
        name: '捐款信息评论',
        component: discussjuankuanxinxi
      }
          ,{
	path: '/qiuzhuxinxi',
        name: '求助信息',
        component: qiuzhuxinxi
      }
          ,{
	path: '/juanzengxinxi',
        name: '捐赠信息',
        component: juanzengxinxi
      }
          ,{
	path: '/discussaixinxinxi',
        name: '爱心信息评论',
        component: discussaixinxinxi
      }
          ,{
	path: '/wangzhangonggao',
        name: '网站公告',
        component: wangzhangonggao
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/juankuanxinxi',
        name: '捐款信息',
        component: juankuanxinxi
      }
          ,{
	path: '/discussqiuzhuxinxi',
        name: '求助信息评论',
        component: discussqiuzhuxinxi
      }
          ,{
	path: '/aixinzhiqu',
        name: '爱心支取',
        component: aixinzhiqu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/wupinhuishou',
        name: '物品回收',
        component: wupinhuishou
      }
          ,{
	path: '/discusswangzhangonggao',
        name: '网站公告评论',
        component: discusswangzhangonggao
      }
          ,{
	path: '/aixinxinxi',
        name: '爱心信息',
        component: aixinxinxi
      }
          ,{
	path: '/yuanzhu',
        name: '援助',
        component: yuanzhu
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

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

         import users from '@/views/modules/users/list'
        import dictionary from '@/views/modules/dictionary/list'
        import nba from '@/views/modules/nba/list'
        import nbaCollection from '@/views/modules/nbaCollection/list'
        import nbaLiuyan from '@/views/modules/nbaLiuyan/list'
        import news from '@/views/modules/news/list'
        import papi from '@/views/modules/papi/list'
        import papiCollection from '@/views/modules/papiCollection/list'
        import papiLiuyan from '@/views/modules/papiLiuyan/list'
        import tiyu from '@/views/modules/tiyu/list'
        import tiyuCollection from '@/views/modules/tiyuCollection/list'
        import tiyuLiuyan from '@/views/modules/tiyuLiuyan/list'
        import yishu from '@/views/modules/yishu/list'
        import yishuCollection from '@/views/modules/yishuCollection/list'
        import yishuLiuyan from '@/views/modules/yishuLiuyan/list'
        import yonghu from '@/views/modules/yonghu/list'
        import yule from '@/views/modules/yule/list'
        import yuleCollection from '@/views/modules/yuleCollection/list'
        import yuleLiuyan from '@/views/modules/yuleLiuyan/list'
        import config from '@/views/modules/config/list'
        import dictionaryNba from '@/views/modules/dictionaryNba/list'
        import dictionaryNews from '@/views/modules/dictionaryNews/list'
        import dictionaryPapi from '@/views/modules/dictionaryPapi/list'
        import dictionarySex from '@/views/modules/dictionarySex/list'
        import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
        import dictionaryTiyu from '@/views/modules/dictionaryTiyu/list'
        import dictionaryYishu from '@/views/modules/dictionaryYishu/list'
        import dictionaryYule from '@/views/modules/dictionaryYule/list'





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
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryNba',
        name: 'NBA类型名称',
        component: dictionaryNba
    }
    ,{
        path: '/dictionaryNews',
        name: '新闻类型名称',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryPapi',
        name: 'papi酱视频类型名称',
        component: dictionaryPapi
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型名称',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架名称',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryTiyu',
        name: '体育类型名称',
        component: dictionaryTiyu
    }
    ,{
        path: '/dictionaryYishu',
        name: '艺术类型名称',
        component: dictionaryYishu
    }
    ,{
        path: '/dictionaryYule',
        name: '娱乐类型名称',
        component: dictionaryYule
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/nba',
        name: 'NBA',
        component: nba
      }
    ,{
        path: '/nbaCollection',
        name: 'NBA收藏',
        component: nbaCollection
      }
    ,{
        path: '/nbaLiuyan',
        name: 'NBA留言',
        component: nbaLiuyan
      }
    ,{
        path: '/news',
        name: '新闻信息',
        component: news
      }
    ,{
        path: '/papi',
        name: 'papi酱视频',
        component: papi
      }
    ,{
        path: '/papiCollection',
        name: 'papi酱视频收藏',
        component: papiCollection
      }
    ,{
        path: '/papiLiuyan',
        name: 'papi酱视频留言',
        component: papiLiuyan
      }
    ,{
        path: '/tiyu',
        name: '体育',
        component: tiyu
      }
    ,{
        path: '/tiyuCollection',
        name: '体育收藏',
        component: tiyuCollection
      }
    ,{
        path: '/tiyuLiuyan',
        name: '体育留言',
        component: tiyuLiuyan
      }
    ,{
        path: '/yishu',
        name: '艺术',
        component: yishu
      }
    ,{
        path: '/yishuCollection',
        name: '艺术收藏',
        component: yishuCollection
      }
    ,{
        path: '/yishuLiuyan',
        name: '艺术留言',
        component: yishuLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yule',
        name: '娱乐',
        component: yule
      }
    ,{
        path: '/yuleCollection',
        name: '娱乐收藏',
        component: yuleCollection
      }
    ,{
        path: '/yuleLiuyan',
        name: '娱乐留言',
        component: yuleLiuyan
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

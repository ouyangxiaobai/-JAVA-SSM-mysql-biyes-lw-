
var projectName = '爱心互助及物品回收管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '网站公告',
	url: './pages/wangzhangonggao/list.html'
}, 
{
	name: '爱心信息',
	url: './pages/aixinxinxi/list.html'
}, 
{
	name: '求助信息',
	url: './pages/qiuzhuxinxi/list.html'
}, 
{
	name: '物品回收',
	url: './pages/wupinhuishou/list.html'
}, 
{
	name: '捐款信息',
	url: './pages/juankuanxinxi/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmx24z8/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"网站公告","menuJump":"列表","tableName":"wangzhangonggao"}],"menu":"网站公告管理"},{"child":[{"buttons":["新增","查看","修改","删除","求助申请","爱心值"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","审核","查看评论","新增","修改","删除"],"menu":"爱心信息","menuJump":"列表","tableName":"aixinxinxi"}],"menu":"爱心信息管理"},{"child":[{"buttons":["查看","审核","删除"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"求助信息","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息管理"},{"child":[{"buttons":["查看"],"menu":"援助","menuJump":"列表","tableName":"yuanzhu"}],"menu":"援助管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"物品回收","menuJump":"列表","tableName":"wupinhuishou"}],"menu":"物品回收管理"},{"child":[{"buttons":["审核","查看"],"menu":"爱心支取","menuJump":"列表","tableName":"aixinzhiqu"}],"menu":"爱心支取管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"捐款信息","menuJump":"列表","tableName":"juankuanxinxi"}],"menu":"捐款信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"网站公告列表","menuJump":"列表","tableName":"wangzhangonggao"}],"menu":"网站公告模块"},{"child":[{"buttons":["查看","爱心捐赠","查看评论"],"menu":"爱心信息列表","menuJump":"列表","tableName":"aixinxinxi"}],"menu":"爱心信息模块"},{"child":[{"buttons":["查看","查看评论","援助"],"menu":"求助信息列表","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息模块"},{"child":[{"buttons":["查看","爱心支取"],"menu":"物品回收列表","menuJump":"列表","tableName":"wupinhuishou"}],"menu":"物品回收模块"},{"child":[{"buttons":["查看","查看评论","新增","修改","删除"],"menu":"捐款信息列表","menuJump":"列表","tableName":"juankuanxinxi"}],"menu":"捐款信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"捐赠信息","menuJump":"列表","tableName":"juanzengxinxi"}],"menu":"捐赠信息管理"},{"child":[{"buttons":["查看","新增","修改","删除","查看评论","援助"],"menu":"求助信息","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息管理"},{"child":[{"buttons":["查看"],"menu":"爱心支取","menuJump":"列表","tableName":"aixinzhiqu"}],"menu":"爱心支取管理"},{"child":[{"buttons":["支付","查看"],"menu":"捐款信息","menuJump":"列表","tableName":"juankuanxinxi"}],"menu":"捐款信息管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"网站公告列表","menuJump":"列表","tableName":"wangzhangonggao"}],"menu":"网站公告模块"},{"child":[{"buttons":["查看","爱心捐赠","查看评论"],"menu":"爱心信息列表","menuJump":"列表","tableName":"aixinxinxi"}],"menu":"爱心信息模块"},{"child":[{"buttons":["查看","查看评论","援助"],"menu":"求助信息列表","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息模块"},{"child":[{"buttons":["查看","爱心支取"],"menu":"物品回收列表","menuJump":"列表","tableName":"wupinhuishou"}],"menu":"物品回收模块"},{"child":[{"buttons":["查看","查看评论","新增","修改","删除"],"menu":"捐款信息列表","menuJump":"列表","tableName":"juankuanxinxi"}],"menu":"捐款信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

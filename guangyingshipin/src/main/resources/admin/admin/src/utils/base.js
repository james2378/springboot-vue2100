const base = {
    get() {
        return {
            url : "http://localhost:8080/guangyingshipin/",
            name: "guangyingshipin",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/guangyingshipin/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "光影视频平台"
        } 
    }
}
export default base

package dyangx.www.config;

import com.jfinal.config.*;
import com.jfinal.template.Engine;
import dyangx.www.controller.HelloController;

/**
 * Created by DYang on 2018/7/30
 */
public class ConfigYou extends JFinalConfig {

    //Jfinal 常量配置，如视图模板
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }
    // 路由配置
    @Override
    public void configRoute(Routes routes) {
        routes.setBaseViewPath("/you");
        routes.add("/helloo",HelloController.class);
    }
    // 引擎模板
    @Override
    public void configEngine(Engine me) {
    }

    // 插件配置，如数据库连接
    @Override
    public void configPlugin(Plugins plugins) {
    }
    //拦截器配置
    @Override
    public void configInterceptor(Interceptors interceptors) {
    }
    //处理器配置
    @Override
    public void configHandler(Handlers handlers) {
    }
}

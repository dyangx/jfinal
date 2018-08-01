package dyangx.www.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * Created by DYang on 2018/7/30
 */
public class HelloController extends Controller {

    @ActionKey("/youu")
    public void index(){
        renderText("Hello,You !");
    }
}

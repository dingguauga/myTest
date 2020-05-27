package string.replace;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Test {
    public static void main(String[] args) throws ScriptException {
//        String str="([type]==4&&[cost]>2000)||([type]==5&&[cost]>2000)||([type]==6&&[cost]>1000)";
        String str="";
        String type="1";
        String cost="5005.1";

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        engine.put("type", 4);
        engine.put("cost", cost);
        Boolean result = (Boolean) engine.eval(str);




//        String str = "(a >= 0 && a <= 5)";
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("js");
//        engine.put("a", 4);
//        Object result = engine.eval(str);
        System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);


    }
}

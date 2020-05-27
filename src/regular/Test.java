package regular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String str = "[沈建](15535687329822517)([冯旺](15613415859658035))(注意看看)21321312312(1)";
        Pattern p = Pattern.compile("(?<=\\()\\d+(?=\\))");
//        Pattern p = Pattern.compile("(\\()([0-9a-zA-Z\\.\\/\\=])*(\\))");
        Matcher m = p.matcher(str);
        //存放dingTalkid
        List<String> dingTalkIds = new ArrayList<>();
        while(m.find()){
            String group = m.group();
            dingTalkIds.add(group);
            System.out.println(group);
        }
        Map<String,String> userMap = new HashMap<>();
        userMap.put("15535687329822517","研发中心-技术研发部-沈建");
        userMap.put("15613415859658035","研发中心-技术研发部-冯旺");

        for(String dingTalkId : dingTalkIds){
            String userName = userMap.get(dingTalkId);
//            str = str.replaceAll("(?<=\\()"+dingTalkId+"+(?=\\))", userName);
            if(null!=userName){
                str = str.replaceAll("(?<=\\()"+dingTalkId+"+(?=\\))", userName);
            }

        }

        System.out.println(str);

    }
}

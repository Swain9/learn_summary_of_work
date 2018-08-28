package com.catt.resteasy.bo;

import com.catt.resteasy.util.JsonUtil;

/**
 * @author zhangmaolin
 * @version 0.0.1
 * @since 2018-08-16 14:34
 */
public class Test {

    public static void main(String[] args) {
        String s = "{\"vsiList\":[{\"neId\":\"352\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"},{\"neId\":\"362\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"},{\"neId\":\"372\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"}],\"vsiBindTpList\":[{\"neId\":\"352\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"},{\"neId\":\"362\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"},{\"neId\":\"372\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"}]}";

        VplsRequest vpls = JsonUtil.jsonToObj(s, VplsRequest.class);

        System.out.println(vpls);

        System.out.println("==========");

        String json = JsonUtil.objToJson(vpls);

        System.out.println(json);


        String s1 = "{\"status\":\"1\",\"useTime\":\"5507\",\"scriptList\":[{\"neId\":\"\",\"script\":\"\"}],\"detailList\":[{\"neId\":\"\",\"detail\":\"\"}],\"vsiList\":[{\"neId\":\"352\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"},{\"neId\":\"362\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"},{\"neId\":\"372\",\"vsiName\":\"vplsad1\",\"rd\":\"10.10.1.1:1\",\"rtIn\":\"100:1\",\"rtOut\":\"100:1\"}],\"vsiBindTpList\":[{\"neId\":\"352\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"},{\"neId\":\"362\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"},{\"neId\":\"372\",\"vsiName\":\"vplsad1\",\"tpName\":\"GigabitEthernet0/0/0\",\"ip\":\"\",\"mask\":\"\",\"vlan\":\"\",\"description\":\"\"}]}";
    }
}

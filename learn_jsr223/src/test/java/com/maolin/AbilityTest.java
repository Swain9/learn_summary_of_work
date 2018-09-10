package com.maolin;

import com.maolin.decorator.BaseDecorator;
import com.maolin.decorator.Component;
import com.maolin.decorator.SlaveDecorator;
import com.maolin.decorator.VlanDecorator;
import com.maolin.decorator.AbilityEnum;
import com.maolin.decorator.AbilityType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmaolin
 * @date 2018-09-10 09:49
 * @since 0.0.1
 */
public class AbilityTest {
    private List<AbilityType> list = new ArrayList<AbilityType>();

    @Before
    public void before(){
        AbilityType type1 = new AbilityType();
        type1.setSlave(true);
        type1.setVlan(true);
        type1.setAbilityEnum(AbilityEnum.SCRIPT_CLOSE_DHCP_RELAY_INTERFACE);
        list.add(type1);

        AbilityType type2 = new AbilityType();
        type2.setSlave(false);
        type2.setVlan(true);
        type2.setAbilityEnum(AbilityEnum.SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL);
        list.add(type2);

        AbilityType type3 = new AbilityType();
        type3.setSlave(true);
        type3.setVlan(false);
        type3.setAbilityEnum(AbilityEnum.SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL_E1);
        list.add(type3);

        AbilityType type4 = new AbilityType();
        type4.setSlave(false);
        type4.setVlan(false);
        type4.setAbilityEnum(AbilityEnum.SCRIPT_COLLECT_ALL_L2VC_INTERFACE);
        list.add(type4);
    }


    @Test
    public void test(){

        boolean hasVlan = false;
        boolean hasSlave = false;

        Component base = new BaseDecorator();
        Component vlan = new VlanDecorator(base, hasVlan);
        Component slave = new SlaveDecorator(vlan, hasSlave);

        List<AbilityType> ability = slave.getAbility(list);

        System.out.println(ability.size());
        System.out.println(ability.get(0).getAbilityEnum());
    }


}

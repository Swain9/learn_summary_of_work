package com.maolin.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * <PRE>
 * 单个设备的能力枚举
 * </PRE>
 * <B>项	       目：</B>研发中心公共-综合网管
 * <B>技术支持：</B>广东凯通科技股份有限公司 (c)
 * @version   <B>V1.0 2017年3月21日</B>
 * @author    <B><a href="mailto:landingdong@gdcattsoft.com"> 蓝鼎栋 </a></B>
 * @since     <B>JDK1.6</B>
 */
public enum AbilityEnum {
	TEST_NEW_MODE(0, "TEST_NEW_MODE", "测试新模式"),
	/*-------------------网络设备发现用到的能力---------------------*/
	SCRIPT_COLLECT_LOOPBACK(0, "SCRIPT_COLLECT_LOOPBACK", "采集loopback地址"),
	SCRIPT_COLLECT_SYSTEM_MAC(0, "SCRIPT_COLLECT_SYSTEM_MAC", "采集设备系统MAC"),
	SCRIPT_COLLECT_MODEL(0, "SCRIPT_COLLECT_MODEL", "采集设备型号"),
	SCRIPT_COLLECT_INTERFACE(0, "SCRIPT_COLLECT_INTERFACE", "采集设备所有接口基本信息，主要是物理类型、虚拟类型、trunk接口的IP"),
	SCRIPT_COLLECT_INTERFACE_PW_INFO(0, "SCRIPT_COLLECT_INTERFACE_PW_INFO", "采集设备所有接口PW信息"),
	SCRIPT_COLLECT_VIRTUAL_INTERFACE(0, "SCRIPT_COLLECT_VIRTUAL_INTERFACE", "采集设备虚拟接口信息，二层、三层虚拟接口"),
	SCRIPT_COLLECT_LLDP_NEIGHBOR(0, "SCRIPT_COLLECT_LLDP_NEIGHBOR", "采集LLDP邻居信息"),
	SCRIPT_COLLECT_SYSNAME(0, "SCRIPT_COLLECT_SYSNAME", "采集系统名称"),
	SCRIPT_TELNET_DCN_VPN(0, "SCRIPT_TELNET_DCN_VPN", "命令行telnet DCN-VPN"),
	SCRIPT_TELNET(0, "SCRIPT_TELNET", "命令行普通telnet"),
	SCRIPT_SSH(0, "SCRIPT_SSH", "命令行普通SSH"),
	SCRIPT_SSH_DCN_VPN(0, "SCRIPT_SSH_DCN_VPN", "命令行SSH DCN-VPN"),
	SCRIPT_COLLECT_LOOP_INFO(0, "SCRIPT_COLLECT_LOOP_INFO", "采集设备环号信息"),
	SCRIPT_COLLECT_DCN_INFO(0, "SCRIPT_COLLECT_DCN_INFO", "采集设备DCN相关信息"),
	SCRIPT_COLLECT_VPN_ARP(0, "SCRIPT_COLLECT_VPN_ARP", "采集设备的VPN的ARP相关信息"),
	/*------------------------------------------------------------*/
	
	/*-------------------L2VPN用到的能力---------------------*/
	SCRIPT_CREATE_L2VPN(0, "SCRIPT_CREATE_L2VPN", "创建L2 VPN"), 
	SCRIPT_CREATE_L2VPN_WITH_SLAVE(0, "SCRIPT_CREATE_L2VPN_WITH_SLAVE", "创建L2 VPN 带主备"), 
	SCRIPT_CREATE_L2VPN_WITH_VLAN(0, "SCRIPT_CREATE_L2VPN_WITH_VLAN", "创建L2VPN带VLAN"), 
	SCRIPT_CREATE_L2VPN_WITH_VLAN_SLAVE(0, "SCRIPT_CREATE_L2VPN_WITH_VLAN_SLAVE", "创建L2VPN带主备和VLAN"), 
	SCRIPT_CREATE_L2VPN_SWITCH(0, "SCRIPT_CREATE_L2VPN_SWITCH", "创建L2VPN交换"),
	SCRIPT_CREATE_L2VPN_SWITCH_WITH_SLAVE(0, "SCRIPT_CREATE_L2VPN_SWITCH_WITH_SLAVE", "创建L2VPN交换带主备"),
	
	SCRIPT_DELETE_L2VPN(0, "SCRIPT_DELETE_L2VPN", "删除L2 VPN"), 
	SCRIPT_DELETE_L2VPN_WITH_SLAVE(0, "SCRIPT_DELETE_L2VPN_WITH_SLAVE", "删除L2 VPN 带主备"), 
	SCRIPT_DELETE_L2VPN_WITH_VLAN(0, "SCRIPT_DELETE_L2VPN_WITH_VLAN", "删除L2VPN 带VLAN"), 
	SCRIPT_DELETE_L2VPN_WITH_VLAN_SLAVE(0, "SCRIPT_DELETE_L2VPN_WITH_VLAN_SLAVE", "删除L2VPN带VLAN和主备"), 
	SCRIPT_DELETE_L2VPN_SWITCH(0, "SCRIPT_DELETE_L2VPN_SWITCH", "淡出L2VPN交换"),
	SCRIPT_DELETE_L2VPN_SWITCH_WITH_SLAVE(0, "SCRIPT_DELETE_L2VPN_SWITCH_WITH_SLAVE", "删除L2VPN交换带主备"),
	
	/*------------------------------------------------------------*/
	/*-------------------下面是新版L2隧道业务用到的能力---------------------*/
	//创建
	SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ", "创建MPLS 2层隧道业务，没有备"), 
	SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_VLAN(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_VLAN", "创建MPLS 2层隧道业务，没有备,有VLAN"), 
	SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE", "创建MPLS 2层隧道业务带主备"), 
	SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN", "创建MPLS 2层隧道业务带主备,有VLAN"), 
	
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ", "创建静态MPLS 2层隧道业务，没有备"), 
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_VLAN(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_VLAN", "创建静态MPLS 2层隧道业务，没有备,有VLAN"), 
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE", "创建静态MPLS 2层隧道业务带主备"), 
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN", "创建静态MPLS 2层隧道业务带主备,有VLAN"), 
	
	SCRIPT_CREATE_MPLS_L2_TUNNEL_SWITCH_BIZ(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_SWITCH_BIZ", "创建MPLS 2层隧道交换业务，没有备"),
	SCRIPT_CREATE_MPLS_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE", "创建MPLS 2层隧道交换业务带主备"),
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ", "创建静态MPLS 2层隧道交换业务，没有备"),
	SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE(0, "SCRIPT_CREATE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE", "创建静态MPLS 2层隧道交换业务带主备"),
	
	//删除
	SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ", "删除MPLS 2层隧道业务，没有备"), 
	SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_VLAN(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_VLAN", "删除MPLS 2层隧道业务，没有备,有VLAN"), 
	SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE", "删除MPLS 2层隧道业务带主备"), 
	SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN", "删除MPLS 2层隧道业务带主备,有VLAN"), 
	
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ", "删除静态MPLS 2层隧道业务，没有备"), 
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_VLAN(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_VLAN", "删除静态MPLS 2层隧道业务，没有备,有VLAN"),
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE", "删除静态MPLS 2层隧道业务带主备"), 
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_BIZ_WITH_SLAVE_VLAN", "删除静态MPLS 2层隧道业务带主备,有VLAN"), 
	
	SCRIPT_DELETE_MPLS_L2_TUNNEL_SWITCH_BIZ(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_SWITCH_BIZ", "删除MPLS 2层隧道交换业务，没有备"),
	SCRIPT_DELETE_MPLS_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE(0, "SCRIPT_DELETE_MPLS_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE", "删除MPLS 2层隧道交换业务带主备"),
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ", "删除静态MPLS 2层隧道交换业务，没有备"),
	SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE(0, "SCRIPT_DELETE_MPLS_STATIC_L2_TUNNEL_SWITCH_BIZ_WITH_SLAVE", "删除静态MPLS 2层隧道交换业务带主备"),
	
	/*------------------------------------------------------------*/
	
	/*-------------------L3VPN用到的能力---------------------*/
	SCRIPT_CREATE_L3VPN_BIND(0, "SCRIPT_CREATE_L3VPN_BIND", "创建L3VPN绑定"), 
	SCRIPT_CREATE_L3VPN_BIND_WITH_VLAN(0, "SCRIPT_CREATE_L3VPN_BIND_WITH_VLAN", "创建L3VPN绑定带VLAN"), 
	SCRIPT_CREATE_L3VPN_BIND_WITH_RELAY(0, "SCRIPT_CREATE_L3VPN_BIND_WITH_RELAY", "创建L3VPN绑定带RELAY"), 
	SCRIPT_CREATE_L3VPN_BIND_WITH_VLAN_AND_RELAY(0, "SCRIPT_CREATE_L3VPN_BIND_WITH_VLAN_AND_RELAY", "创建L3VPN绑定带VLAN和RELAY"), 
	SCRIPT_DELETE_L3VPN_BIND(0, "SCRIPT_DELETE_L3VPN_BIND", "删除L3VPN绑定"), 
	SCRIPT_DELETE_L3VPN_BIND_WITH_VLAN(0, "SCRIPT_DELETE_L3VPN_BIND_WITH_VLAN", "删除L3VPN绑定带VLAN"), 
	SCRIPT_DELETE_L3VPN_BIND_WITH_RELAY(0, "SCRIPT_DELETE_L3VPN_BIND_WITH_RELAY", "删除L3VPN绑定带RELAY"), 
	SCRIPT_DELETE_L3VPN_BIND_WITH_VLAN_AND_RELAY(0, "SCRIPT_DELETE_L3VPN_BIND_WITH_VLAN_AND_RELAY", "删除L3VPN绑定带VLAN和RELAY"), 
	SCRIPT_CREATE_VPN_INSTANCE(0, "SCRIPT_CREATE_VPN_INSTANCE", "创建VPN实例"), 
	SCRIPT_DELETE_VPN_INSTANCE(0, "SCRIPT_DELETE_VPN_INSTANCE", "删除VPN实例"), 
	SCRIPT_CREATE_VPN_STATIC_ROUTE(0, "SCRIPT_CREATE_VPN_STATIC_ROUTE", "创建VPN实例静态路由"), 
	SCRIPT_DELETE_VPN_STATIC_ROUTE(0, "SCRIPT_DELETE_VPN_STATIC_ROUTE", "删除VPN实例静态路由"), 
	/*------------------------------------------------------------*/
	
	/*-------------------SNMP用到的能力---------------------*/
	SNMP_CPU_PERF_ALL_AVG(0, "SNMP_CPU_PERF_ALL_AVG", "SNMP采集CPU性能所有平均"), 
	SNMP_CPU_PERF_ONE_MINUTE_AVG(0, "SNMP_CPU_PERF_ONE_MINUTE_AVG", "SNMP采集CPU性能一分钟平均"), 
	SNMP_CPU_PERF_FIVE_MINUTE_AVG(0, "SNMP_CPU_PERF_FIVE_MINUTE_AVG", "SNMP采集CPU性能五分钟平均"), 
	SNMP_ENTITY_MEMORY_USAGE_PERCENT(0, "SNMP_ENTITY_MEMORY_USAGE_PERCENT", "SNMP采集实体内容使用百分比"), 
	SNMP_DEV_MEMORY_SIZE(0, "SNMP_DEV_MEMORY_SIZE", "SNMP采集内存大小"), 
	SNMP_DEV_MEMORY_FREE_SIZE(0, "SNMP_DEV_MEMORY_FREE_SIZE", "SNMP采集空闲内存大小"), 
	SNMP_DEV_MEMORY_RAW_SLICE_USED_SIZE(0, "SNMP_DEV_MEMORY_RAW_SLICE_USED_SIZE", ""), 
	/*------------------------------------------------------------*/
	
	/*-------------------Y1731和RFC2544用到的能力---------------------*/
	SCRIPT_CREATE_Y1731_SEND(0, "SCRIPT_CREATE_Y1731_SEND", "创建Y1731发送端"), 
	SCRIPT_CREATE_Y1731_RECEIVE(0, "SCRIPT_CREATE_Y1731_RECEIVE", "创建Y1731接收端"), 
	SCRIPT_DELETE_Y1731_SEND(0, "SCRIPT_DELETE_Y1731_SEND", "删除Y1731发送端"), 
	SCRIPT_DELETE_Y1731_RECEIVE(0, "SCRIPT_DELETE_Y1731_RECEIVE", "删除Y1731接收端"), 
	SCRIPT_CREATE_RFC2544_SEND(0, "SCRIPT_CREATE_RFC2544_SEND", "创建RFC2544发送端"),
	SCRIPT_CREATE_RFC2544_REFLECTOR(0, "SCRIPT_CREATE_RFC2544_REFLECTOR", "创建RFC2544反射端"),
	SCRIPT_DELETE_RFC2544_SEND(0, "SCRIPT_DELETE_RFC2544_SEND", "删除RFC2544发送端"), 
	SCRIPT_DELETE_RFC2544_REFLECTOR(0, "SCRIPT_DELETE_RFC2544_REFLECTOR", "删除RFC2544反射端"), 
	SCRIPT_COLLECT_Y1731_ONEWAY_DELAY(0, "SCRIPT_COLLECT_Y1731_ONEWAY_DELAY", "采集Y1731单边时延"), 
	SCRIPT_COLLECT_Y1731_SINGLE_LOSS(0, "SCRIPT_COLLECT_Y1731_SINGLE_LOSS", "采集Y1731单边丢包"),
	SCRIPT_COLLECT_RFC2544_THROUGHPUT(0, "SCRIPT_COLLECT_RFC2544_THROUGHPUT", "采集RFC2544吞吐量"),
	SCRIPT_COLLECT_RFC2544_LOSS(0, "SCRIPT_COLLECT_RFC2544_LOSS", "采集RFC2544丢包"),
	SCRIPT_COLLECT_RFC2544_DELAY(0, "SCRIPT_COLLECT_RFC2544_DELAY", "采集RFC2544时延"),
	SCRIPT_COLLECT_Y1731_TWOWAY_DELAY(0, "SCRIPT_COLLECT_Y1731_TWOWAY_DELAY", "采集Y1731双向时延"),  
	SCRIPT_COLLECT_Y1731_DUAL_LOSS(0, "SCRIPT_COLLECT_Y1731_DUAL_LOSS", "采集Y1731双向丢包"),  
	/*------------------------------------------------------------*/
	
	/*-------------------其他能力---------------------*/
	SCRIPT_CREATE_CSG_BASE_CONFIG(0, "SCRIPT_CREATE_CSG_BASE_CONFIG", "新CSG上线的时候，下发CSG基础配置"),
	SCRIPT_CREATE_ASG_BASE_CONFIG(0, "SCRIPT_CREATE_ASG_BASE_CONFIG", "新CSG上线的时候，下发ASG基础配置"),
	SCRIPT_CONFIG_LINK_INTERFACE_WITH_LOOP(0, "SCRIPT_CONFIG_LINK_INTERFACE_WITH_LOOP", "新CSG上线的时候，下发链路的端口，同时下发环号"),
	SCRIPT_CONFIG_LINK_INTERFACE(0, "SCRIPT_CONFIG_LINK_INTERFACE", "新CSG上线的时候，下发CSG配置链路的端口"),
	SCRIPT_ENABLE_PORT(0, "SCRIPT_ENABLE_PORT", "使能端口"),
	SCRIPT_UNABLE_PORT(0, "SCRIPT_UNABLE_PORT", "关闭端口"), 
	SCRIPT_COLLECT_LOOPBACK0_INFO(0, "SCRIPT_COLLECT_LOOPBACK0_INFO", "采集loopback0信息"), 
	SCRIPT_COLLECT_LOOPBACK1_INFO(0, "SCRIPT_COLLECT_LOOPBACK1_INFO", "采集loopback1信息"), 
	SCRIPT_COLLECT_INTERFACE_BRIEF(0, "SCRIPT_COLLECT_INTERFACE_BRIEF", "采集端口简要信息"),
	SCRIPT_COLLECT_OSPF_PEER_BRIEF(0, "SCRIPT_COLLECT_OSPF_PEER_BRIEF", "采集OSPF邻居简要"),
	SCRIPT_COLLECT_VERSION(0, "SCRIPT_COLLECT_VERSION", "采集设备版本"),
	SCRIPT_COLLECT_RUN_CONFIG_OSPF(0, "SCRIPT_COLLECT_RUN_CONFIG_OSPF", "采集运行时配置的OSPF信息"), 
	SCRIPT_UPDATE_BANDWIDTH_TEMPLATE(0, "SCRIPT_UPDATE_BANDWIDTH_TEMPLATE", "更新设备配置的带宽模板"), 
	SCRIPT_COLLECT_PW_INFO(0, "SCRIPT_COLLECT_PW_INFO", "采集PW VC信息"), 
	SCRIPT_COLLECT_BFD_INFO(0, "SCRIPT_COLLECT_BFD_INFO", "采集BFD信息"), 
	
	//ping能力
	SCRIPT_PING(0, "SCRIPT_PING", "ping功能"), 
	SCRIPT_PING_DCN_VPN(0, "SCRIPT_PING_DCN_VPN", "ping DCN VPN"), 
	SCRIPT_PING_VC(0, "SCRIPT_PING_VC", "ping VC"), 
	SCRIPT_PING_LSP_IP(0, "SCRIPT_PING_LSP_IP", "SCRIPT_PING_LSP_IP"), 
	SCRIPT_PING_LSP_TUNNEL(0, "SCRIPT_PING_LSP_TUNNEL", "SCRIPT_PING_LSP_TUNNEL"), 
	SCRIPT_PING_VRF(0, "SCRIPT_PING_VRF", "SCRIPT_PING_VRF"), 
	SCRIPT_PING_VPLS_VSI(0, "SCRIPT_PING_VPLS_VSI", "PING VPLS VSI"), 
	
	//traceroute能力
	SCRIPT_TRACEROUTE_LSP_IP(0, "SCRIPT_TRACEROUTE_LSP_IP", "SCRIPT_TRACEROUTE_LSP_IP"), 
	SCRIPT_TRACE_ROUTE(0, "SCRIPT_TRACE_ROUTE", "SCRIPT_TRACE_ROUTE"), 
	SCRIPT_TRACE_ROUTE_WITH_SRC(0, "SCRIPT_TRACE_ROUTE_WITH_SRC", "SCRIPT_TRACE_ROUTE_WITH_SRC"), 
	SCRIPT_TRACEROUTE_LSP_TE_TUNNEL_PRIMARY(0, "SCRIPT_TRACEROUTE_LSP_TE_TUNNEL_PRIMARY", "路由跟踪LSP_TE_TUNNEL主路径"),
	SCRIPT_TRACEROUTE_LSP_TE_TUNNEL_SLAVE(0, "SCRIPT_TRACEROUTE_LSP_TE_TUNNEL_SLAVE", "路由跟踪LSP_TE_TUNNEL备路径"), 
	SCRIPT_TRACEROUTE_LSP_TE_TUNNEL(0, "SCRIPT_TRACEROUTE_LSP_TE_TUNNEL", "路由跟踪LSP_TE_TUNNEL在用路径"),
	SCRIPT_TRACEROUTE_PW(0, "SCRIPT_TRACEROUTE_PW", "PW的路由信息"),
	SCRIPT_TRACEROUTE_VRF(0, "SCRIPT_TRACEROUTE_VRF", "VRF的路由信息"),
	
	SCRIPT_COLLECT_MPLS_LDP(0, "SCRIPT_COLLECT_MPLS_LDP", "采集MPLS_LDP信息"),
	SCRIPT_COLLECT_MPLS_TE_TETUNNEL_INTERFACE(0, "SCRIPT_COLLECT_MPLS_TE_TETUNNEL_INTERFACE", "采集MPLS_TE_TUNNEL相关接口信息"),
	SCRIPT_COLLECT_MPLS_TE_TETUNNEL_INTERFACE_BRIEF(0, "SCRIPT_COLLECT_MPLS_TE_TETUNNEL_INTERFACE_BRIEF", "采集MPLS_TE_TUNNEL相关接口信息简要"),
	SCRIPT_COLLECT_CONFIG_INFO(0, "SCRIPT_COLLECT_CONFIG_INFO", "采集设备全量配置信息"), 

	SCRIPT_QUERY_FILE_LIST(0, "SCRIPT_QUERY_FILE_LIST", "采集设备的文件列表"), 
	SCRIPT_FTP_PUT_FILE(0, "SCRIPT_FTP_PUT_FILE", "从设备上推送文件到FTP服务器"),  
	SCRIPT_COLLECT_ROUTING_TABLE(0, "SCRIPT_COLLECT_ROUTING_TABLE", "采集路由表信息"), 
	SCRIPT_COLLECT_MPLS_ROUTING_TABLE(0, "SCRIPT_COLLECT_MPLS_ROUTING_TABLE", "采集MPLS的路由表"), 
	SCRIPT_COLLECT_EXPLICIT_PATH(0, "SCRIPT_COLLECT_EXPLICIT_PATH", "查询显示路径"), 
	SCRIPT_COLLECT_TE_TETUNNEL_VERBOSE(0, "SCRIPT_COLLECT_TE_TETUNNEL_VERBOSE", "采集TE TUNNEL的详细信息"), 
	
	SCRIPT_COLLECT_TE_REVERSE_LSP(0, "SCRIPT_COLLECT_TE_REVERSE_LSP", "采集反向TE LSP信息"),  
	SCRIPT_COLLECT_DEV_LOG(0, "SCRIPT_COLLECT_DEV_LOG", "采集设备上面的日志信息"), 
	SCRIPT_MPLS_STATIC_LABEL_AVAILABLE(0, "SCRIPT_MPLS_STATIC_LABEL_AVAILABLE", "采集MPLS可用的静态标签"),
	SCRIPT_MPLS_TUNNEL_STATIC_LABEL_AVAILABLE(0, "SCRIPT_MPLS_TUNNEL_STATIC_LABEL_AVAILABLE", "采集MPLS TUNNEL可用的静态标签"),
	
	SCRIPT_COLLECT_OSPF(0, "SCRIPT_COLLECT_OSPF", "采集OSPF信息"), 
	SCRIPT_COLLECT_ISIS(0, "SCRIPT_COLLECT_ISIS", "采集ISIS信息"), 
	SCRIPT_COLLECT_MPLS_LSP(0, "SCRIPT_COLLECT_MPLS_LSP", "采集MPLS_LSP信息"), 
	SCRIPT_COLLECT_MPLS(0, "SCRIPT_COLLECT_MPLS", "采集MPLS信息"), 
	SCRIPT_COLLECT_BGP(0, "SCRIPT_COLLECT_BGP", "采集BGP信息"), 
	
	SCRIPT_PORT_LOOPBACK_LOCAL(0, "SCRIPT_PORT_LOOPBACK_LOCAL", "端口环回"),
	SCRIPT_PORT_LOOPBACK_LOCAL_E1(0, "SCRIPT_PORT_LOOPBACK_LOCAL_E1", "E1口端口环回"),
	SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL(0, "SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL", "关闭端口环回"), 
	SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL_E1(0, "SCRIPT_CLOSE_PORT_LOOPBACK_LOCAL_E1", "关闭E1口端口环回"), 
	SCRIPT_QUERY_PORT_LOOPBACK_LOCAL(0, "SCRIPT_QUERY_PORT_LOOPBACK_LOCAL", "查询单个端口的端口环号状态"), 
	SCRIPT_QUERY_ALL_PORT_LOOPBACK_LOCAL(0, "SCRIPT_QUERY_ALL_PORT_LOOPBACK_LOCAL", "查询所有端口的端口环号状态"), 
	
	SCRIPT_COLLECT_L2VC_INTERFACE(0, "SCRIPT_COLLECT_L2VC_INTERFACE", "采集MPLS L2VC接口信息"),
	SCRIPT_COLLECT_STATIC_L2VC_INTERFACE(0, "SCRIPT_COLLECT_STATIC_L2VC_INTERFACE", "采集MPLS静态L2VC接口信息"), 
	SCRIPT_COLLECT_ALL_L2VC_INTERFACE(0, "SCRIPT_COLLECT_ALL_L2VC_INTERFACE", "采集所有的(包括静态)MPLS L2VC接口信息"), 
	SCRIPT_COLLECT_RFC2544_STATISTICS(0, "SCRIPT_COLLECT_RFC2544_STATISTICS", "采集RFC2544统计"), 
	SCRIPT_UPDATE_PORT_BANDWIDTH(0, "SCRIPT_UPDATE_PORT_BANDWIDTH", "更新端口带宽"), 
	SCRIPT_COLLECT_TUNNEL_POLICY(0, "SCRIPT_COLLECT_TUNNEL_POLICY", "采集tunnel-policy信息"), 
	SCRIPT_COLLECT_TE_TUNNEL_POLICY_BAND(0, "SCRIPT_COLLECT_TE_TUNNEL_POLICY_BAND", "查询TE TUNNEL和policy的绑定信息"), 
	SCRIPT_COLLECT_VPN_INSTANCE(0, "SCRIPT_COLLECT_VPN_INSTANCE", "查询VPN实例信息"), 
	SCRIPT_COLLECT_VPN_STATIC_ROUTE(0, "SCRIPT_COLLECT_VPN_STATIC_ROUTE", "查询VPN静态路由"), 
	
	SCRIPT_CONFIG_INTERFACE(0, "SCRIPT_CONFIG_INTERFACE", "创建配置接口信息"),
	SCRIPT_CONFIG_INTERFACE_WITH_VLAN(0, "SCRIPT_CONFIG_INTERFACE_WITH_VLAN", "创建配置接口信息，带vlan"),
	
	SCRIPT_COLLECT_INTERFACE_DETAIL(0, "SCRIPT_COLLECT_INTERFACE_DETAIL", "采集端口详情"),
	SCRIPT_COLLECT_ROUTE_POLICY_PRIORITY(0, "SCRIPT_COLLECT_ROUTE_POLICY_PRIORITY", "采集路由策略优先级"),
	SCRIPT_CREATE_TUNNEL_POLICY(0, "SCRIPT_CREATE_TUNNEL_POLICY", "创建tunnel-policy"),
	SCRIPT_COLLECT_TRAP_MIB_NODE(0, "SCRIPT_COLLECT_TRAP_MIB_NODE", "查询trap mib节点信息"),

	/*-------------------LDP对等体的能力---------------------*/
	SCRIPT_COLLECT_LDP_PEER(0, "SCRIPT_COLLECT_LDP_PEER", "查询LDP对等体信息"),
	SCRIPT_CREATE_LDP_PEER(0, "SCRIPT_CREATE_LDP_PEER", "创建LDP对等体"),

	/*-------------------VPLS全网型---------------------*/
	SCRIPT_CREATE_VPLS(0,"SCRIPT_CREATE_VPLS","全网型业务开通"),
	SCRIPT_DELETE_VPLS(0,"SCRIPT_DELETE_VPLS","全网型业务删除"),
	SCRIPT_CREATE_VPLS_PORT_WITH_VLAN(0,"SCRIPT_CREATE_VPLS_PORT_WITH_VLAN","全网型业务开通，端口绑定，带VLAN"),
	SCRIPT_CREATE_VPLS_PORT(0,"SCRIPT_CREATE_VPLS_PORT","全网型业务开通，端口绑定，不带VLAN"),
	SCRIPT_DELETE_VPLS_PORT_WITH_VLAN(0,"SCRIPT_DELETE_VPLS_PORT_WITH_VLAN","全网型业务删除，端口解绑，带VLAN"),
	SCRIPT_DELETE_VPLS_PORT(0,"SCRIPT_DELETE_VPLS_PORT","全网型业务删除，端口解绑，不带VLAN"),

	/*-------------------业务发现用到的能力---------------------*/
	SCRIPT_QUERY_ALL_ARP(0, "SCRIPT_QUERY_ALL_ARP", "查询所有的ARP信息"),
	SCRIPT_QUERY_JZ_INTERFACE(0, "SCRIPT_QUERY_JZ_INTERFACE", "查询所有基站l3层信息"),
	SCRIPT_QUERY_JZ_L2_INTERFACE(0, "SCRIPT_QUERY_JZ_L2_INTERFACE", "查询所有基站l2层信息"),
	SCRIPT_QUERY_DHCP_INFO(0, "SCRIPT_QUERY_DHCP_INFO", "查询dhcp信息"),
	SCRIPT_QUERY_BIZ_INFO(0, "SCRIPT_QUERY_BIZ_INFO", "查询落地端信息"),
	
	/*-------------------DHCP上线用到的能力---------------------*/
	SCRIPT_CONFIG_DHCP_RELAY_INTERFACE(0, "SCRIPT_CONFIG_DHCP_RELAY_INTERFACE", "配置DHCP中继的接口"),
	SCRIPT_CLOSE_DHCP_RELAY_INTERFACE(0, "SCRIPT_CLOSE_DHCP_RELAY_INTERFACE", "关闭接口的DHCP中继"),
	SCRIPT_COLLECT_INTERFACE_DHCP_INFO(0, "SCRIPT_COLLECT_INTERFACE_DHCP_INFO", "采集接口的DHCP信息"),
	SCRIPT_CONFIG_SNMP(0, "SCRIPT_CONFIG_SNMP", "配置SNMP"),
	SCRIPT_CONFIG_TELNET_USER(0, "SCRIPT_CONFIG_TELNET_USER", "配置TELNET用户"),
	SCRIPT_CONFIG_SSH_USER(0, "SCRIPT_CONFIG_SSH_USER", "配置SSH用户"),
	SCRIPT_CREATE_CSG_CONFIG_WHEN_CSGCPE_CONN(0, "SCRIPT_CREATE_CSG_CONFIG_WHEN_CSGCPE_CONN", "创建新的CSG和CPE连线的时候，下发CSG配置"), 
	SCRIPT_CREATE_CPE_CONFIG_WHEN_CSGCPE_CONN(0, "SCRIPT_CREATE_CPE_CONFIG_WHEN_CSGCPE_CONN", "创建新的CSG和CPE连线的时候，下发CPE配置，不带创建loopback"), 
	SCRIPT_CREATE_CPE_CONFIG_WHEN_CSGCPE_CONN_WITH_LOOPBACK(0, "SCRIPT_CREATE_CPE_CONFIG_WHEN_CSGCPE_CONN_WITH_LOOPBACK", "创建新的CSG和CPE连线的时候，下发CPE配置,带创建loopback"),
	SCRIPT_CONFIG_LOOPBACK_ADDRESS(0, "SCRIPT_CONFIG_LOOPBACK_ADDRESS", "配置loopback地址"),
	SCRIPT_DELETE_PORT_ADDRESS(0, "SCRIPT_DELETE_PORT_ADDRESS", "删除端口地址"),
	SCRIPT_CREATE_MPLS_L2_TUNNEL_WITH_SLAVE_VLAN_NO_QOS(0, "SCRIPT_CREATE_MPLS_L2_TUNNEL_WITH_SLAVE_VLAN_NO_QOS", "创建MPLS 2层隧道业务带主备,有VLAN，没有QOS"), 
	SCRIPT_CREATE_MPLS_L2L3_VIRTUAL_INTERFACE(0, "SCRIPT_CREATE_MPLS_L2L3_VIRTUAL_INTERFACE", "创建MPLS L2 L3虚拟接口"), 
	/*------------------------------------------------------------*/
	
	
	/*-------------------专线业务用到的能力---------------------*/
	SCRIPT_QUERY_QOS_INFO(0, "SCRIPT_QUERY_QOS_INFO", "查询qos"),
	SCRIPT_QUERY_SWITCH_INFO(0, "SCRIPT_QUERY_SWITCH_INFO", "查询switch"),
	
	/*--------------------------------------------------*/
	
	/*-------------------下面是VPWS-VPLS隧道业务用到的能力---------------------*/
	//创建接入端
	SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_NOVLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_NOVLAN_NOSLAVE", "接入端、动态、无VLAN、无备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_NOVLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_NOVLAN_SLAVE", "接入端、动态、无VLAN、有备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_VLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_VLAN_NOSLAVE", "接入端、动态、有VLAN、无备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_VLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_DYNAMIC_VLAN_SLAVE", "接入端、动态、有VLAN、有备"), 
	
	SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_NOVLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_NOVLAN_NOSLAVE", "接入端、静态、无VLAN、无备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_NOVLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_NOVLAN_SLAVE", "接入端、静态、无VLAN、有备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_VLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_VLAN_NOSLAVE", "接入端、静态、有VLAN、无备"), 
	SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_VLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_AC_STATIC_VLAN_SLAVE", "接入端、静态、有VLAN、有备"), 
	
	//创建交换端
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_DYNAMIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_DYNAMIC_NOSLAVE", "交换端、A端动态、Z端动态、无备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_DYNAMIC_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_DYNAMIC_SLAVE", "交换端、A端动态、Z端动态、有备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_STATIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_STATIC_NOSLAVE", "交换端、A端动态、Z端静态、无备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_STATIC_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_DYNAMIC_Z_STATIC_SLAVE", "交换端、A端动态、Z端静态、有备"),

	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_DYNAMIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_DYNAMIC_NOSLAVE", "交换端、A端静态、Z端动态、无备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_DYNAMIC_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_DYNAMIC_SLAVE", "交换端、A端静态、Z端动态、有备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_STATIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_STATIC_NOSLAVE", "交换端、A端静态、Z端静态、无备"),
	SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_STATIC_SLAVE(0, "SCRIPT_VPWS_BIZ_CREATE_SWITCH_A_STATIC_Z_STATIC_SLAVE", "交换端、A端静态、Z端静态、有备"),
	
	//删除接入端
	SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_NOVLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_NOVLAN_NOSLAVE", "接入端、动态、无VLAN、无备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_NOVLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_NOVLAN_SLAVE", "接入端、动态、无VLAN、有备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_VLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_VLAN_NOSLAVE", "接入端、动态、有VLAN、无备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_VLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_DYNAMIC_VLAN_SLAVE", "接入端、动态、有VLAN、有备"), 
	
	SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_NOVLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_NOVLAN_NOSLAVE", "接入端、静态、无VLAN、无备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_NOVLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_NOVLAN_SLAVE", "接入端、静态、无VLAN、有备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_VLAN_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_VLAN_NOSLAVE", "接入端、静态、有VLAN、无备"), 
	SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_VLAN_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_AC_STATIC_VLAN_SLAVE", "接入端、静态、有VLAN、有备"), 
	
	//删除交换端
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_DYNAMIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_DYNAMIC_NOSLAVE", "交换端、A端动态、Z端动态、无备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_DYNAMIC_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_DYNAMIC_SLAVE", "交换端、A端动态、Z端动态、有备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_STATIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_STATIC_NOSLAVE", "交换端、A端动态、Z端静态、无备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_STATIC_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_DYNAMIC_Z_STATIC_SLAVE", "交换端、A端动态、Z端静态、有备"),

	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_DYNAMIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_DYNAMIC_NOSLAVE", "交换端、A端静态、Z端动态、无备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_DYNAMIC_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_DYNAMIC_SLAVE", "交换端、A端静态、Z端动态、有备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_STATIC_NOSLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_STATIC_NOSLAVE", "交换端、A端静态、Z端静态、无备"),
	SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_STATIC_SLAVE(0, "SCRIPT_VPWS_BIZ_DELETE_SWITCH_A_STATIC_Z_STATIC_SLAVE", "交换端、A端静态、Z端静态、有备"),

	//VPLS相关脚本
	SCRIPT_CREATE_VPLS_LDP_DYNAMIC_PEER(0, "SCRIPT_CREATE_VPLS_LDP_DYNAMIC_PEER", "VPLS LDP动态对等体"),
	SCRIPT_CREATE_VPLS_LDP_STATIC_PEER(0, "SCRIPT_CREATE_VPLS_LDP_STATIC_PEER", "VPLS LDP静态对等体"),
	SCRIPT_CREATE_VSI_LDP_PEER_NPE(0, "SCRIPT_CREATE_VSI_LDP_PEER_NPE", "VPLS VSI LDP动态对等体NPE"),
	SCRIPT_CREATE_VSI_LDP_PEER_NPE_STATIC(0, "SCRIPT_CREATE_VSI_LDP_PEER_NPE_STATIC", "VPLS VSI LDP静态对等体NPE"),
	
	SCRIPT_DELETE_VPLS_LDP_DYNAMIC_PEER(0, "SCRIPT_DELETE_VPLS_LDP_DYNAMIC_PEER", "VPLS LDP动态对等体"),
	SCRIPT_DELETE_VPLS_LDP_STATIC_PEER(0, "SCRIPT_DELETE_VPLS_LDP_STATIC_PEER", "VPLS LDP静态对等体"),
	SCRIPT_DELETE_VSI_LDP_PEER_NPE(0, "SCRIPT_DELETE_VSI_LDP_PEER_NPE", "VPLS VSI LDP动态对等体NPE"),
	SCRIPT_DELETE_VSI_LDP_PEER_NPE_STATIC(0, "SCRIPT_DELETE_VSI_LDP_PEER_NPE_STATIC", "VPLS VSI LDP静态对等体NPE"),
	/*------------------------------------------------------------*/
	;
	
	
	
	private final static Map<String, AbilityEnum> nameEnumMap = new HashMap<String, AbilityEnum>();
	private final static Map<Integer, AbilityEnum> idEnumMap = new HashMap<Integer, AbilityEnum>();
	static{
		AbilityEnum[] values = values();
		for(AbilityEnum value : values){
			nameEnumMap.put(value.getName().toLowerCase(), value);//统一转换成小写
			idEnumMap.put(value.id, value);
		}
	}
	/** name 能力的英文名称 */
	private String name;
	
	/** id 枚举存储的ID */
	private int id;
	
	/** value 能力的中文名称 */
	private String value;

	private AbilityEnum(int id, String name, String value) {
		this.name = name;
		this.id = id;
		this.value = value;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getValue(){
		return value;
	}
	
	public static AbilityEnum getEnumByName(String name){
		if(name != null){
			return nameEnumMap.get(name.toLowerCase());//统一转换成小写
		}else{
			return null;
		}
	}
	
	public static AbilityEnum getEnumById(int id){
		return idEnumMap.get(id);
	}
	
	/**
	 * 能力字典码
	 * @return
	 */
	public String getDictCode(){
		return name;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(" [").append("id").append("=").append(id).append("]");
		sb.append(" [").append("name").append("=").append(name).append("]");
		sb.append(" [").append("value").append("=").append(value).append("]");
		return sb.toString();
	}
}

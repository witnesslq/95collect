/**
 * <p>Description:system resources center</p>
 * <p>Company: dhcc.com</p>
 * @author afunms
 * @project afunms
 * @date 2006-08-06
 */

package com.afunms.initialize;

import java.util.Hashtable;
import java.util.List;
import java.util.Set;


public class ResourceCenter
{
    private Hashtable managerMap;
    private Hashtable ajaxManagerMap;
    private Hashtable menuMap;  // �˵�
    private Hashtable actionMap;
    private String sysPath="E:\\project\\idctest\\WebRoot\\";    //ϵͳ·��
    private String appServer;  //ϵͳ������
    private String jndi;       //���ݿ����ӳ�JNDI
    private String snmpversion="v2+v1";       //snmp�汾
    private Hashtable chartStorage;
    private Hashtable monitorMap;    
    private Set showMoidsSet; //��Ҫ����������ʾ��ָ��    
    private int perThreadNodes; //ÿ���̴߳��������Ӷ���ĸ���    
    private int maxThreads;    //����߳���    
    private boolean logInfo;   //�Ƿ��ӡ������Ϣ
    private boolean logError;  //�Ƿ��ӡ������Ϣ
    private boolean startPolling;   //�Ƿ�������ѯ
    private List serviceList;
    private int pollingThreadInterval; //�߳�����ʱ��ʱ��                
    private boolean hasDiscovered; //���ֹ����� 
    private int ipIdleDays;     //IP���е�����
    private Hashtable alarmHashtable;//��Ÿ澯��
    private Hashtable cfgHash;
    
    private static ResourceCenter instance = new ResourceCenter();    
    
    //new add
    private Hashtable hardware;
    
    /**
     * ָ��仯��Ϣ����
     */
    private Hashtable indicatorsChangeInfoHash = new Hashtable();
    
	public Hashtable getHardware() {
		return hardware;
	}

	public void setHardware(Hashtable hardware) {
		this.hardware = hardware;
	}
        
	public Hashtable getIndicatorsChangeInfoHash() {
		return indicatorsChangeInfoHash;
	}

	public void setIndicatorsChangeInfoHash(Hashtable indicatorsChangeInfoHash) {
		this.indicatorsChangeInfoHash = indicatorsChangeInfoHash;
	}

	public static ResourceCenter getInstance()
    {
        return instance;
    }
   
    private ResourceCenter()
    {    
    	logInfo = true;
    	logError = true;
    	ipIdleDays = 30; //Ĭ��Ϊ30��
    	chartStorage = new Hashtable();
    }
     
    
    
    public void setAlarmHashtable(Hashtable alarmHashtable) {
    	
    	this.alarmHashtable = alarmHashtable;
    } 
    public Hashtable getAlarmHashtable() {
    	return  alarmHashtable;
    }  
    
    public Hashtable getAjaxManagerMap() {
		return ajaxManagerMap;
	}

	public void setAjaxManagerMap(Hashtable ajaxManagerMap) {
		this.ajaxManagerMap = ajaxManagerMap;
	}
    	
    public String getAppServer() 
    {
		return appServer;
    }
	
	public void setAppServer(String appServer) 
	{
		this.appServer = appServer;
	}
	
	public String getJndi() 
	{
		return jndi;
	}
	
	public void setJndi(String jndi) 
	{
		this.jndi = jndi;
	}
	
	public String getSnmpversion() 
	{
		return snmpversion;
	}
	
	public void setSnmpversion(String snmpversion) 
	{
		this.snmpversion = snmpversion;
	}
	
	public boolean isLogError() 
	{
		return logError;
	}
	
	public void setLogError(boolean logError) 
	{
		this.logError = logError;
	}
	
	public boolean isLogInfo() 
	{
		return logInfo;
	}
	
	public void setLogInfo(boolean logInfo) 
	{
		this.logInfo = logInfo;
	}
	
	public String getSysPath() 
	{
		return sysPath;
	}
	
	public void setSysPath(String sysPath) 
	{
		this.sysPath = sysPath;
	}
      
    public void setActionMap(Hashtable actionMap)
    {
        this.actionMap = actionMap;
    }

    public Hashtable getActionMap()
    {
        return actionMap;
    }

    public void setManagerMap(Hashtable managerMap)
    {
        this.managerMap = managerMap;
    }

    public Hashtable getManagerMap()
    {
        return managerMap;
    }  
    
    public void setChartStorage(Hashtable chartStorage)
    {
    	this.chartStorage = chartStorage; 
    }
    
    public Hashtable getChartStorage()
    {
    	return chartStorage;
    }

	public Hashtable getMonitorMap() {
		return monitorMap;
	}

	public void setMonitorMap(Hashtable monitorMap) {
		this.monitorMap = monitorMap;
	}

	public static void setInstance(ResourceCenter instance) {
		ResourceCenter.instance = instance;
	}

	public int getPerThreadNodes() {
		return perThreadNodes;
	}

	public void setPerThreadNodes(int perThreadNodes) {
		this.perThreadNodes = perThreadNodes;
	}
	
	public void setShowMoidsSet(Set showMoidsSet)
	{
		this.showMoidsSet = showMoidsSet;
	}
	
	public Set getShowMoidsSet()
	{
		return showMoidsSet;
	}

	public boolean isStartPolling() 
	{
		return startPolling;
	}

	public void setStartPolling(boolean startPolling) 
	{
		this.startPolling = startPolling;
	}
	
	public List getServiceList() 
	{
		return serviceList;
	}
	
	public void setServiceList(List serviceList) 
	{
		this.serviceList = serviceList;
	}
	
	public int getPollingThreadInterval() 
	{
		return pollingThreadInterval;
	}

	public void setPollingThreadInterval(int pollingThreadInterval) 
	{
		this.pollingThreadInterval = pollingThreadInterval;
	}
	
	public int getMaxThreads() 
	{
		return maxThreads;
	}

	public void setMaxThreads(int maxThreads) 
	{
		this.maxThreads = maxThreads;
	}

	public boolean hasDiscovered() 
	{
		return hasDiscovered;
	}

	public void setHasDiscovered(boolean hasDiscovered) 
	{
		this.hasDiscovered = hasDiscovered;
	}

	public int getIpIdleDays() {
		return ipIdleDays;
	}

	public void setIpIdleDays(int ipIdleDays) {
		this.ipIdleDays = ipIdleDays;
	}
	/**
	 * @return the menuMap
	 */
	public Hashtable getMenuMap() {
		return menuMap;
	}

	/**
	 * @param menuMap the menuMap to set
	 */
	public void setMenuMap(Hashtable menuMap) {
		this.menuMap = menuMap;
	}
	public Hashtable getCfgHash() {
		return cfgHash;
	}

	public void setCfgHash(Hashtable cfgHash) {
		this.cfgHash = cfgHash;
	}
}
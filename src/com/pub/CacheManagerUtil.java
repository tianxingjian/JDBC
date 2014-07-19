package com.pub;

import net.sf.ehcache.CacheManager;

public class CacheManagerUtil {
	
	private CacheManager cacheManager;
	private static CacheManagerUtil instance;
	private static String confFileName = "ehcache.xml";
	
	private CacheManagerUtil(){
	}
	
	public synchronized static CacheManagerUtil getInstance(){
		if(instance == null){
			instance = new CacheManagerUtil();
		}
		return instance;
	}
	
	public CacheManager getCacheManager(){
		if(cacheManager == null){
			synchronized(this){
				String fileName = this.getClass().getResource("/").getPath() + confFileName;
				System.out.println(fileName);
				cacheManager = new CacheManager(fileName);
			}
		}
		return cacheManager;
	}
}

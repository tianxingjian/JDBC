package spring.db.impl;



import java.util.Random;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.springframework.cache.ehcache.EhCacheCacheManager;

import com.pub.CacheManagerUtil;

import spring.db.Inter.CacheService;
import spring.db.tables.classes.ParseFailLog;

public class CacheServiceImpl implements CacheService {

	@Override
	public ParseFailLog query(int pk) {
		
		ParseFailLog result = null;
		String key = "ParseFailLog" + pk;
		Cache cache = CacheManagerUtil.getInstance().getCacheManager().getCache("demo1");
		Element element = cache.get(key);
		if(element != null){
			result = (ParseFailLog)element.getValue();
		}else{
			result = doJDBCQuery(pk);
			element = new Element(key, result);
			cache.put(element);
		}
		
		return result;
	}

	/**
	 * 杩欓噷鍋氱湡姝ｇ殑鏌ヨ鎿嶄綔
	 * @param pk
	 * @return
	 */
	private ParseFailLog doJDBCQuery(int pk) {
		ParseFailLog log = new ParseFailLog();
		log.setId(pk);
		log.setFieldName("http://" + (new Random().nextLong() *1000));
		return log;
	}

	@Override
	public ParseFailLog save(ParseFailLog value) {
		ParseFailLog log = doSave(value); //濡傛灉涓婚敭鏄嚜鍔ㄧ敓鎴愭暟鎹簱doSave涔嬪墠娌′富閿紝鍦╠oSave涔嬪悗杩斿洖涓婚敭鎵嶈兘鎿嶄綔缂撳瓨
		String key =  "ParseFailLog" + log.getId(); 
		Cache cache = CacheManagerUtil.getInstance().getCacheManager().getCache("demo1");
		Element element = new Element(key, log);
		cache.put(element);
		return log;
	}

	/**
	 * 鏁版嵁搴撶墿鐞嗘搷浣�
	 * @param value
	 * @return
	 */
	private ParseFailLog doSave(ParseFailLog value) {
		value.setId(new Random().nextInt(10000));
		return value;
	}

	@Override
	public void update(ParseFailLog value) {
		doUpdate(value);
		/*缂撳瓨澶勭悊*/
		String key =  "ParseFailLog" + value.getId(); 
		Cache cache = CacheManagerUtil.getInstance().getCacheManager().getCache("demo1");
		Element element = new Element(key, value);
		cache.put(element);
	}

	private void doUpdate(ParseFailLog value) {
		System.out.println("鏁版嵁搴撶墿鐞嗘洿鏂版搷浣滐紒");
	}

	@Override
	public void delete(int pk) {
		doDelete(pk);
		String key = "ParseFailLog" + pk;
		Cache cache = CacheManagerUtil.getInstance().getCacheManager().getCache("demo1");
		cache.remove(key);
	}

	/**
	 * 鏁版嵁搴撶墿鐞嗗垹闄�
	 * @param pk
	 */
	private void doDelete(int pk) {
		System.out.println("鐗╃悊鍒犻櫎锛乨oSomeThing");
	}

	
}

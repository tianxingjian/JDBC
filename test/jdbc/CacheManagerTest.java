package jdbc;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

import org.junit.Test;

import com.pub.CacheManagerUtil;

public class CacheManagerTest {

	@Test
	public void test() {
		CacheManager manager = CacheManagerUtil.getInstance().getCacheManager();
		Cache cache = manager.getCache("demo1");
	}

}

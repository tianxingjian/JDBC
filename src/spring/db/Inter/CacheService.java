package spring.db.Inter;

import spring.db.tables.classes.ParseFailLog;

public interface CacheService {
	ParseFailLog query(int pk);
	ParseFailLog save(ParseFailLog value);
	void update(ParseFailLog value);
	void delete(int pk);
}

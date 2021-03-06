package com.github.bjlhx15.boot2cache.lettucepool.services.impl;

import com.github.bjlhx15.boot2cache.lettucepool.dao.BookDao;
import com.github.bjlhx15.boot2cache.lettucepool.entity.Book;
import com.github.bjlhx15.boot2cache.lettucepool.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@CacheConfig(cacheNames = "book")
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookDao dao;

	/**
	 * condition满足缓存条件的数据才会放入缓存，condition在调用方法之前和之后都会判断
	 * unless用于否决缓存更新的，不像condition，该表达只在方法执行之后判断，此时可以拿到返回值result进行判断了
	 */
	@Override
	@Cacheable(key = "#id", unless = "#result == null")
	public Book query(String id) {
		return this.dao.query();
	}

	@Override
	@CachePut(key = "#id")
	public Book update(String id) {
		return this.dao.query();
	}

	@Override
	@CacheEvict(key = "#id")
	public int delete(String id) {
		return 1;
	}

	@Override
	@CacheEvict(value="book", allEntries=true)
	public int deleteAll(String id) {
		return 1;
	}

}

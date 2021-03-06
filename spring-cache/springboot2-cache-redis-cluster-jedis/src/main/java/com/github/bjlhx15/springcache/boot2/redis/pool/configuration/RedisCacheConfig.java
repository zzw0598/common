package com.github.bjlhx15.springcache.boot2.redis.pool.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;

//@Configuration
//@EnableAutoConfiguration
public class RedisCacheConfig extends CachingConfigurerSupport {

	@Value("${spring.redis.host}")
	private String host;

	@Value("${spring.redis.port}")
	private int port;

	@Value("${spring.redis.timeout}")
	private int timeout;

	@Value("${spring.redis.database}")
	private int database;

	@Value("${spring.redis.password}")
	private String password;

	/**
	 * 连接redis的工厂类
	 *
	 * @return
	 */
//	@Bean
//	public JedisConnectionFactory jedisConnectionFactory() {
//		JedisConnectionFactory factory = new JedisConnectionFactory();
//		factory.setHostName(this.host);
//		factory.setPort(this.port);
//		factory.setTimeout(this.timeout);
//		factory.setPassword(this.password);
//		factory.setDatabase(this.database);
//		return factory;
//	}
//
//	@Bean
//	public LettuceConnectionFactory lettuceConnectionFactory() {
//		JedisConnectionFactory factory = new JedisConnectionFactory();
//		factory.setHostName(this.host);
//		factory.setPort(this.port);
//		factory.setTimeout(this.timeout);
//		factory.setPassword(this.password);
//		factory.setDatabase(this.database);
//		return factory;
//	}

	/**
	 * 配置RedisTemplate 设置添加序列化器 key 使用string序列化器 value 使用Json序列化器
	 * 还有一种简答的设置方式，改变defaultSerializer对象的实现。
	 *
	 * @return
	 */
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate() {
//		// StringRedisTemplate的构造方法中默认设置了stringSerializer
//		RedisTemplate<String, Object> template = new RedisTemplate<>();
//		// set key serializer
//		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//		template.setKeySerializer(stringRedisSerializer);
//		template.setHashKeySerializer(stringRedisSerializer);
//
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//
//		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
//		// set value serializer
//		template.setDefaultSerializer(jackson2JsonRedisSerializer);
//
//		template.setConnectionFactory(this.jedisConnectionFactory());
//		template.afterPropertiesSet();
//		return template;
//	}
}

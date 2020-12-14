//package com.ryan.www.cache;
//
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
//import com.fasterxml.jackson.annotation.PropertyAccessor;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ryan.www.message.MessageReceiver;
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.cache.RedisCacheManager;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.listener.PatternTopic;
//import org.springframework.data.redis.listener.RedisMessageListenerContainer;
//import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.util.HashMap;
//
///**
// * Created by Ryan on 2018/11/22.
// */
//@Configuration
//@EnableCaching
//public class RedisConfig extends CachingConfigurerSupport {
//    @Value("47.100.17.93")
//    private String host;
//    @Value("6379")
//    private int port;
//    @Value("0")
//    private int database;
//
//
//    @Bean
//    public RedisTemplate hashRedisTemplate(){
//        RedisTemplate<String, HashMap<String, Object>> mapRedisTemplate = new RedisTemplate<>();
//        mapRedisTemplate.setConnectionFactory(redisConnectFactory());
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//        mapRedisTemplate.setKeySerializer(stringRedisSerializer);
//        mapRedisTemplate.setValueSerializer(stringRedisSerializer);
//        mapRedisTemplate.setHashKeySerializer(stringRedisSerializer);
//        mapRedisTemplate.setHashValueSerializer(stringRedisSerializer);
//        return mapRedisTemplate;
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate( ) {
//        //设置序列化
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        // 配置redisTemplate
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
//        redisTemplate.setConnectionFactory(redisConnectFactory());
//        RedisSerializer stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer); // key序列化
//        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer); // value序列化
//        redisTemplate.setHashKeySerializer(stringSerializer); // Hash key序列化
//        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer); // Hash value序列化
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//
//    @Bean
//    public RedisConnectionFactory redisConnectFactory(){
//        RedisStandaloneConfiguration config=new RedisStandaloneConfiguration();
//        config.setDatabase(database);
//        config.setHostName(host);
//        config.setPort(port);
//        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(config);
//        return connectionFactory;
//    }
//
//    @Bean
//    public CacheManager cacheManager(){
//        RedisCacheManager cacheManager = RedisCacheManager.builder(redisConnectFactory()).build();
//        return cacheManager;
//    }
//
//    @Bean
//    public RedisMessageListenerContainer container(MessageListenerAdapter listenerAdapter){
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(redisConnectFactory());
//        //订阅了一个叫chat 的通道
//        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
//        container.addMessageListener(listenerAdapter, new PatternTopic("wechat"));
//        //这个container 可以添加多个 messageListener
//        return container;
//
//    }
//
//    @Bean
//    public MessageListenerAdapter listenerAdapter(MessageReceiver receiver) {
//        //这个地方 是给messageListenerAdapter 传入一个消息接受的处理器，利用反射的方法调用“receiveMessage”
//        //也有好几个重载方法，这边默认调用处理器的方法 叫handleMessage 可以自己到源码里面看
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }
//
//    @Bean
//    public MessageListenerAdapter wechatAdapter(MessageReceiver receiver) {
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }
//
//    @Bean
//    public RedissonClient redissonClient(){
//        String format = "redis://%s:%s";
//        String redisAddress = String.format(format, host, port);
//        Config config = new Config();
//        config.useSingleServer()
//                .setAddress(redisAddress)
//                .setPassword(null);
//        return Redisson.create(config);
//    }
//    //当redisson版本较低时 会报很奇葩的错  简直了 shit
//    //org.springframework.boot.actuate.cache.CacheStatisticsProvider
//
//}

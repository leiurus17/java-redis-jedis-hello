package com.gowpar.com.gowpar.redis;

import java.util.List;

import redis.clients.jedis.Jedis;

public class RedisListJava {
	
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connected to server successfully");
		
		// Store data in Redis list
		jedis.lpush("tutorial-list", "Redis");
		jedis.lpush("tutorial-list", "MongoDB");
		jedis.lpush("tutorial-list", "MySQL");
		
		// Get the stored data and print it
		List<String> list = jedis.lrange("tutorial-list", 0, 5);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Stored string in Redis::" + list.get(i));
		}
	}

}

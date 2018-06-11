package com.gowpar.com.gowpar.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {

	public static void main(String[] args) {
		
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("localhost");
		
		System.out.println("Connected to server successful");
		
		// Store data in Redis list
		// Get the stored data and print it
		Set<String> list = jedis.keys("*");
		
		for(String listValue : list) {
			System.out.println(listValue);
		}
	}
}

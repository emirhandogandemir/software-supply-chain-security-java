package com.securedevops.secure;

import org.springframework.context.annotation.Bean;

public class RedisConfig {

    private static final String REDIS_HOSTNAME = "localhost";
    private static final int REDIS_PORT = 6379;
    private static final String REDIS_PASSWORD = "password";
    private static final int REDIS_DATABASE = 0;

    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration(REDIS_HOSTNAME, REDIS_PORT);
        redisStandaloneConfiguration.setPassword(REDIS_PASSWORD);
        redisStandaloneConfiguration.setDatabase(REDIS_DATABASE);
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    private static class JedisConnectionFactory {
        public JedisConnectionFactory(RedisStandaloneConfiguration redisStandaloneConfiguration) {

        }
    }

    private static class RedisStandaloneConfiguration {
        public RedisStandaloneConfiguration(String redisHostname, int redisPort) {
            
        }

        public void setPassword(String redisPassword) {

        }

        public void setDatabase(int redisDatabase) {

        }
    }
}

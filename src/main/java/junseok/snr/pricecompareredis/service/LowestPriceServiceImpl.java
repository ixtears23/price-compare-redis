package junseok.snr.pricecompareredis.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@RequiredArgsConstructor
@Service
public class LowestPriceServiceImpl implements LowestPriceService {
    private final RedisTemplate redisTemplate;

    @Override
    public Set getZetValue(String key) {
        return redisTemplate.opsForZSet().rangeWithScores(key, 0, 9);
    }
}

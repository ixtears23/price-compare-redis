package junseok.snr.pricecompareredis.service;

import java.util.Set;

public interface LowestPriceService {
    Set getZetValue(String key);
}

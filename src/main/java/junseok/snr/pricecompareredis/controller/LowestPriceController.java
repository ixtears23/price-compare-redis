package junseok.snr.pricecompareredis.controller;

import junseok.snr.pricecompareredis.service.LowestPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class LowestPriceController {
    private final LowestPriceService lowestPriceService;

    @GetMapping("/get-zset-value")
    public Set getZsetValue(String key) {
        return lowestPriceService.getZetValue(key);
    }

}

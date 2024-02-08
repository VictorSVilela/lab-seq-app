package dev.victorvilela.labseq.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import dev.victorvilela.labseq.exceptions.NegativeNumberException;

@Service
public class LabseqService {
    private Map<Long, Long> cache = new HashMap<>();

    public Long getLabSeqValue(long n) {
        if (n < 0) {
            throw new NegativeNumberException("Index must be a non-negative integer.");
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result;
        if (n == 0) {
            result = 0;
        } else if (n == 1 || n == 3) {
            result = 1;
        } else if (n == 2) {
            result = 0;
        } else {
            result = getLabSeqValue(n - 4) + getLabSeqValue(n - 3);
        }

        cache.put(n, result);
        return result;
    }

}

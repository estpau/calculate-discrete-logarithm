package com.discrete.service;

import com.discrete.domain.DiscreteLogMetadata;
import com.discrete.util.DiscreteLogUtil;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class IndexCalculusAlgorithm implements DiscreteLogCalculator {

    private final DiscreteLogUtil discreteLogUtil;


    public IndexCalculusAlgorithm(DiscreteLogUtil discreteLogUtil) {
        this.discreteLogUtil = discreteLogUtil;
    }

    @Override
    public DiscreteLogMetadata calculateDiscreteLog(BigInteger generator, BigInteger base, BigInteger prime) {
        return null;
    }
}

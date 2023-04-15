package com.discrete.service;

import com.discrete.domain.DiscreteLogMetadata;
import com.discrete.util.DiscreteLogUtil;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

@Component
public class ExhaustiveSearchAlgorithm implements DiscreteLogCalculator {

    private final DiscreteLogUtil discreteLogUtil;

    public ExhaustiveSearchAlgorithm(DiscreteLogUtil discreteLogUtil) {
        this.discreteLogUtil = discreteLogUtil;
    }

    @Override
    public DiscreteLogMetadata calculateDiscreteLog(BigInteger generator, BigInteger base, BigInteger prime) {
        long start = System.currentTimeMillis();
        BigInteger finalNum = BigInteger.ZERO;
        while(!discreteLogUtil.verify(generator, base, prime, finalNum)){
            finalNum = finalNum.add(BigInteger.ONE);
        }

       return  DiscreteLogMetadata.builder().algorithmName("Exhaustive Search").numberOfSecondsTaken((System.currentTimeMillis() - (double) start)/1000).solution(finalNum).solutionFound(Boolean.TRUE).build();
    }
}

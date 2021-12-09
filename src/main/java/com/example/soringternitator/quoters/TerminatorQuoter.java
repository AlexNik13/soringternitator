package com.example.soringternitator.quoters;

import lombok.Data;

import javax.annotation.PostConstruct;

@Data
@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String massage;

    @PostConstruct
    public void innit(){
        System.out.println("Phase 2: ");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1: ");
    }

    @Override
    @PostProxy
    public void saeQuot() {
        System.out.println("Phase 3: ");

        for (int i = 0; i < repeat; i++) {
            System.out.println("massage: " + massage);
        }
    }
}
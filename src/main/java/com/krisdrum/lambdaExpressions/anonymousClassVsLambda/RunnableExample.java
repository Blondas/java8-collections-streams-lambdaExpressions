package com.krisdrum.lambdaExpressions.anonymousClassVsLambda;

public class RunnableExample {
    Runnable r = new Runnable() {
        @Override
        public void run() {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        }
    };

    Runnable r2 = () -> {
        int i = 0;
        while (i++ < 10) {
            System.out.println("It works!");
        }
    };


}


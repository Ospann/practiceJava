package lab2.part1;

import java.util.logging.Logger;

/**
 * Task #1
 * Description: Напишите программу на Java, чтобы найти значение указанного выражения и объясняйте результаты
 * a) 101 + 0) / 3
 * b) 3.0e-6 * 10000000.1 
 * c) true && true 
 * d) false && true 
 * e) (false && false) || (true && true) 
 * f) (false || false) && (true && true)
 */
public class Expressions {
    private static final Logger logger = Logger.getLogger(Expressions.class.getName());
    public static void main(String[] args) {
        // a) (101 + 0) / 3
        double resultA = (101 + 0) / 3.0;
       logger.info("a) Result: " + resultA);

        // b) 3.0e-6 * 10000000.1
        double resultB = 3.0e-6 * 10000000.1;
       logger.info("b) Result: " + resultB);

        // c) true && true
        boolean resultC = true && true;
       logger.info("c) Result: " + resultC);

        // d) false && true
        boolean resultD = false && true;
       logger.info("d) Result: " + resultD);

        // e) (false && false) || (true && true)
        boolean resultE = (false && false) || (true && true);
       logger.info("e) Result: " + resultE);

        // f) (false || false) && (true && true)
        boolean resultF = (false || false) && (true && true);
       logger.info("f) Result: " + resultF);
    }
}

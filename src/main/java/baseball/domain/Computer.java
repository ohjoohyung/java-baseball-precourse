package baseball.domain;

import utils.RandomUtils;

import java.util.HashSet;
import java.util.Set;

public class Computer {
    private final int NUMBERS_LENGTH = 3;
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private StringBuilder computerNumbers;
    private Set<Integer> numbersSet;

    public Computer() {
        numbersSet = new HashSet<>();
    }

    public String createRandomComputerNumbers() {
        computerNumbers = new StringBuilder();
        while (numbersSet.size() < NUMBERS_LENGTH) {
            numbersSet.add(RandomUtils.nextInt(MIN_NUMBER, MAX_NUMBER));
        }
        for (Integer number : numbersSet) {
            computerNumbers.append(number);
        }
        numbersSet.clear();
        return computerNumbers.toString();
    }


}
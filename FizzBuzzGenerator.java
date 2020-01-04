//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
    public FizzBuzzGenerator() {
    }

    public boolean divisibleBy(int numerator, int Denominator) {
        int answer = 0;
        return numerator % Denominator == 0;
    }

    public List<String> FizzBuzz(int startNumber, int endNumber) {
        List<String> fizzBuzzList = new ArrayList();

        for(int i = startNumber; i <= endNumber; ++i) {
            if (this.divisibleBy(i, 3) && this.divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz"); {
                if (this.divisibleBy(i, 3)) {
                    fizzBuzzList.add("Fizz");
                } else if (this.divisibleBy(i, 5)) {
                    fizzBuzzList.add("Buzz");
                } else {
                    fizzBuzzList.add(Integer.toString(i));
                }
            }
        }
        return fizzBuzzList;
    }
}

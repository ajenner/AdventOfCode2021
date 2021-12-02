package Day1;

import java.util.ArrayList;

public class DepthTracker {
    public static int question1(ArrayList<Integer> input) {
        int count = 0;
        for (int i = 0; i < input.size()-1; i++) {
            if (input.get(i) < input.get(i+1)) {
                count++;
            }
        }
        return count;
    }

    public static int question2(ArrayList<Integer> input) {
        int count = 0;
        for (int i = 0; i < input.size()-3; i++) {
            int window1 = input.get(i) + input.get(i+1) + input.get(i+2);
            int window2 = input.get(i+1) + input.get(i+2) + input.get(i+3);
            if (window1 < window2) {
                count++;
            }
        }
        return count;
    }
}

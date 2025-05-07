package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            return args != null && !args.isEmpty() && args.stream()
                    .allMatch(n ->
                            n != null && !n.isEmpty() && !n.equals(" ")
                                    && (Integer.parseInt(n) > 0
                                    || Double.parseDouble(n) > 0
                                    || Long.parseLong(n) > 0));
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

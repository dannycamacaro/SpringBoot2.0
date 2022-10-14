package com.camamonte.configurebean;

public interface Operation {
    int apply(int lhs, int rhs);
    boolean handles(char op);
}

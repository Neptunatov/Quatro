package ru.netology.sqr;

public class SQRService {
    public int calculate(int upRange, int lowRange) {
        int lot = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowRange && i * i <= upRange) {
                lot++;
            }
        }
        return lot;
    }
}

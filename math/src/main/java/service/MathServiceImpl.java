package service;

public class MathServiceImpl implements MathService {
    @Override
    public int sumOf(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}

package demo;

import service.MathServiceImpl;

public class Main {
    public static void main(String[] args){
        MathServiceImpl service = new MathServiceImpl();
        System.out.println(service.sumOf(3, 5));
    }
}

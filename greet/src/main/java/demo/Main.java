package demo;

import entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.MemberService;
import service.MemberServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        MemberServiceImpl service = new MemberServiceImpl();
        MemberService service = MemberServiceImpl.getInstance();
        System.out.println(service.greet(2));
        System.out.println(service.getAll());

        ArrayList<Member> list = service.getAll();
        for (Member mem : list) {
            System.out.println(mem.getId() + "," + mem.getName() + "," + mem.getEmail());
        }
    }

}

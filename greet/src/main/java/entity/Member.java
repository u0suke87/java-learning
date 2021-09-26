package entity;

import lombok.Getter;
import lombok.Setter;

public class Member {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    public Member(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

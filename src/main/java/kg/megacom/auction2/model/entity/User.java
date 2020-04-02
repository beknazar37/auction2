package kg.megacom.auction2.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String name;
    private String login;
    private String password;
}

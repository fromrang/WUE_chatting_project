//package com.example.demo;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import org.apache.ibatis.mapping.FetchType;
//import org.springframework.messaging.Message;
//
//@Entity
//@Table(name = "conversation")
//@Getter
//@Setter
//public class Conversation extends BaseTimeEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "conversation_id")
//    private Integer id;
//
//    @OneToMany(mappedBy = "conversation" , cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Message> messages = new ArrayList<>();
//
//    private String text;
//
//    @Column(name = "image_name")
//    private String imageName;
//
//    @Column(name = "image_url")
//    private String imageUrl;
//
//
//    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinTable(
//            name = "conversation_user",
//            joinColumns = @JoinColumn(name = "conversation_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id")
//    )
//    private Set<User> users = new HashSet<>();
//
//    public Conversation() {
//    }
//
//    public void addUser(User user){
//        this.users.add(user);
//    }
//
//}
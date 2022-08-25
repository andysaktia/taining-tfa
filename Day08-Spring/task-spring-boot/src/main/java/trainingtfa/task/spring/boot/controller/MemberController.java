package trainingtfa.task.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trainingtfa.task.spring.boot.entity.Member;
import trainingtfa.task.spring.boot.repository.MemberRepository;

@RestController
public class MemberController {
    @Autowired
    MemberRepository repo;
    @GetMapping("/")
    public String index(@RequestParam(name = "name", required = false) String name){
        if(name == null){
            return "Hello World";
        }
        return "Hello " + name;
    }

    @GetMapping("/v1/message/{id}")
    public String index(@PathVariable("id") int id){
        return "ID: " + id;
     }
    @PostMapping("/v1/message/")
    public Member save(@RequestBody CreateMemberRequest request){
//        System.out.println(request.getName());
        Member message = new Member();
        message.setMessage(request.getMessage());
        Member createdMember = repo.save(message);
        return createdMember;


    }

}

package com.example.Service2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/customers")
@RestController
public class Service2Controller 
{
    private List<Service2> Services = Arrays.asList(
            new Service2(1, "Joe Bloggs","male", 23, 005 ),
            new Service2(2, "Joe Bloggs","female", 34, 006),
            new Service2(3, "Joe Bloggs","male", 42, 007));
          //  new Service2(2, "Jane Doe"));
    
//     private int cid;
//     private String cname;
//     private String gender;
//     private int age;
//     private int rno;



    @GetMapping
    public List<Service2> getAllServices() {
        return Services;
    }
    
    @GetMapping("/{cid}")
    public Service2 getServiceBycid(@PathVariable int cid) {
        return Services.stream()
                        .filter(Service -> Service.getcid() == cid)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/{cname}")
    public Service2 getServiceBycname(@PathVariable String cname) {
        return Services.stream()
                        .filter(Service -> Service.getcname() == cname)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/{gender}")
    public Service2 getServiceBygender(@PathVariable String gender) {
        return Services.stream()
                        .filter(Service -> Service.getgender() == gender)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    @GetMapping("/{age}")
    public Service2 getServiceByage(@PathVariable int age) {
        return Services.stream()
                        .filter(Service -> Service.getage() == age)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    @GetMapping("/{rno}")
    public Service2 getServiceByrno(@PathVariable int rno) {
        return Services.stream()
                        .filter(Service -> Service.getrno() == rno)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    // @GetMapping("/{ele6}")
    // public Service2 getServiceByele(@PathVariable String ele6) {
    //     return Services.stream()
    //                     .filter(Service -> Service.getele6() == ele6)
    //                     .findFirst()
    //                     .orElseThrow(IllegalArgumentException::new);
    // }
}
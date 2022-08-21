package com.example.Service1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RequestMapping("/hotels")
@RestController
public class Service1Controller 
{
    private List<Service1> Services = Arrays.asList(
            new Service1(1, "Joe Bloggs", 22, 005),
            new Service1(2, "MF", 23, 006),
            new Service1(3, "Joe", 24, 007)
            );
          //  new Service1(2, "Jane Doe"));
    
    @GetMapping
    public List<Service1> getAllServices() {
        return Services;
    }
    
    @GetMapping("/{hid}")
    public Service1 getServiceByhid(@PathVariable int hid) {
        return Services.stream()
                        .filter(Service -> Service.gethid() == hid)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/{hname}")
    public Service1 getServiceByhname(@PathVariable String hname) {
        return Services.stream()
                        .filter(Service -> Service.gethname() == hname)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }

    @GetMapping("/{date}")
    public Service1 getServiceBydate(@PathVariable int date) {
        return Services.stream()
                        .filter(Service -> Service.getdate() == date)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    @GetMapping("/{rno}")
    public Service1 getServiceByrno(@PathVariable int rno) {
        return Services.stream()
                        .filter(Service -> Service.getrno() == rno)
                        .findFirst()
                        .orElseThrow(IllegalArgumentException::new);
    }
    // @GetMapping("/{ele5}")
    // public Service1 getServiceByele5(@PathVariable String ele5) {
    //     return Services.stream()
    //                     .filter(Service -> Service.getele5() == ele5)
    //                     .findFirst()
    //                     .orElseThrow(IllegalArgumentException::new);
    // }
    // @GetMapping("/{ele6}")
    // public Service1 getServiceByele(@PathVariable String ele6) {
    //     return Services.stream()
    //                     .filter(Service -> Service.getele6() == ele6)
    //                     .findFirst()
    //                     .orElseThrow(IllegalArgumentException::new);
    // }
}
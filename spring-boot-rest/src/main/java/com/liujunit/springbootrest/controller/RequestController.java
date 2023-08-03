package com.liujunit.springbootrest.controller;

import com.liujunit.springbootrest.vo.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 各种参数传递
 */
@RestController
public class RequestController {


    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    /**
     * url取值
     * @param name
     * @return
     */
    @GetMapping("/param/{name}")
    public String type1(@PathVariable String name) {
        return name;
    }

    /**
     * url末尾取值
     * @param name
     * @return
     */
    @GetMapping("/type2")
    public String type2(@RequestParam String name) {
        return name;
    }

    /**
     * json传值
     * @param student
     * @return
     */
    @PostMapping("/type3")
    public Student type3(@RequestBody Student student) {
        return student;
    }

    /**
     *
     * @param names
     * @return
     */
    @PostMapping("/type4")
    public List<String> type4(@RequestBody List<String> names) {
        return names;
    }

    @PostMapping("/type5")
    public String type5(@RequestParam MultipartFile file) throws IOException {
        return String.valueOf(file.getBytes().length);
    }

}

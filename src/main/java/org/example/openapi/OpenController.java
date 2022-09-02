package org.example.openapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinyue at 2022/5/20 11:41 上午
 */
@RestController
@RequestMapping("")
public class OpenController {

    @GetMapping
    public String genId() {
        return "success";
    }
}

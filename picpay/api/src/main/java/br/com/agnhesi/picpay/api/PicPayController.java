package br.com.agnhesi.picpay.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PicPayController {


    @RequestMapping("/")
    public String Hello() {
        return ("PicPayController..");
    }
}

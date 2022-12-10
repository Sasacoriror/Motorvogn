package com.example.motorvogn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    public final List<Motorvogn> motorvognRegister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagre(Motorvogn bil){
        motorvognRegister.add(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return motorvognRegister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        motorvognRegister.clear();
    }
}

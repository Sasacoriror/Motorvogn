package com.example.motorvogn;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    @Autowired
    private MotorvognRepository rep;


    @GetMapping("/hentBiler")
    public List<Bil> hentBiler(HttpServletResponse response) throws IOException {
        List<Bil> alleBiler = rep.hentAlleBiler();
        if (alleBiler == null){
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Feil i DB - prøv igjen");
        }
        return alleBiler;
    }

    @PostMapping("/lagre")
    public void lagre(Motorvogn bil){
       rep.lagreMotorvogn(bil);
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return rep.hentAlleMotorvogn();
    }

    @GetMapping("/hentEnMotorvogn")
    public Motorvogn hentEnMotorvogn(int id){
        return rep.hentEnMotorvogn(id);
    }

    @PostMapping("/endre")
    public void endre(Motorvogn motorvogn){
        rep.endreEnMotorvogn(motorvogn);
    }

    @GetMapping("/slettEnMotorvogn")
    public void slettEnMotorvogn(String personnr){
        rep.slettEnMotorvogn(personnr);
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlleMotorvogner();
    }
}

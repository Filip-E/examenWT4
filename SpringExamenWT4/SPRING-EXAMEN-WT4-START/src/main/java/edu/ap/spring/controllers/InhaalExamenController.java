package edu.ap.spring.controllers;

import edu.ap.spring.model.InhaalExamen;
import edu.ap.spring.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
public class InhaalExamenController {

    @Autowired
    private RedisService service;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public void addInhaalexamen(
            @RequestParam("student") String studentNaam,
            @RequestParam("exam") String examen,
            @RequestParam("reason") String reden){

        InhaalExamen inhaalExamen = new InhaalExamen(studentNaam,examen,reden);

        String inhaalExamenString = String.format("%s:%s:%s:%s", inhaalExamen.getStudent(), inhaalExamen.getExam(),
                inhaalExamen.getReason(), inhaalExamen.getDate());

        //System.out.println(service.getKey(inhaalExamenString));
        if (inhaalExamenString != service.getKey(inhaalExamenString) ){

            /*System.out.printf("add: %s %s %s %s %n", inhaalExamen.getStudent(), inhaalExamen.getExam(),
                    inhaalExamen.getReason(), inhaalExamen.getDate());
            */
            service.setKey(inhaalExamenString,inhaalExamenString);
        }
        //System.out.println("print: " + service.keys(inhaalExamen.getStudent() + ":*").toString());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getInhaalexamensFromStudent(@RequestParam("student") String studentNaam){
        String html = "<HTML><BODY><ul>";

        Set<String> inhaalexamens = service.keys(studentNaam + ":*");
        /*
        List<String> inhaalexamensSorted = new ArrayList<String>(inhaalexamens);
        Collections.sort(inhaalexamensSorted);
        */
        for (String i : inhaalexamens){
            html += "<li>";
            html += i;
            html += "</li>";
        }

        html += "</ul></body></html>";
        return html;
    }
}

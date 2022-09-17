package com.example.demo.controller;

import com.example.demo.domain.Coche;
import com.example.demo.domain.Exposicion;
import com.example.demo.domain.Propietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class ConcesionarioController {

    //Listar todos los coches.
    @GetMapping("/coches")
    public String mostrarGetCocheList() {
        ArrayList<String> totalCoches = new ArrayList<>();
        for (Coche coche : getCocheList().values()) {
            totalCoches.add(coche.toString());
        }
        return totalCoches.toString();
    }

    //Listar el coche con id = 4.
    @GetMapping("/coche/{id}")
    public String getCocheById(@PathVariable Integer id) {
        return "Coche: " + getCocheList().get(id).toString();
    }

    // Listar el propietario del coche con id = 4.
    @GetMapping("/propietario/{idCoche}")
    public String getPropietarioByIdCoche(@PathVariable Integer idCoche) {
        return "Coche: " + getCocheList().get(idCoche).getPropietario().toString();
    }

    // Listar las exposiciones.
    @GetMapping("/exposiciones")
    public String mostrarGetExposiciones() {
        ArrayList<String> totalExposiciones = new ArrayList<>();
        for (Exposicion exposicion : getExposicionList().values()) {
            totalExposiciones.add(exposicion.toString());
        }
        return totalExposiciones.toString();
    }

    // Listar los coches de la exposición numero 8.
    @GetMapping("/coches/{idExposicion}")
    public String getCochesByIdExposicion(@PathVariable Integer idExposicion) {
        ArrayList<String> listaCoches = new ArrayList<>();
        for (Coche coche : getCocheList().values()) {
            if (coche.getExposicion().getNumero() == idExposicion) {
                listaCoches.add(coche.toString());
            }
        } return listaCoches.toString();
    }

    // Listar los datos del coche 4 de la exposición numero 8.
    @GetMapping("/exposicion/{idExposicion}/coche/{idCoche}")
    public String getCocheByIdCocheByIdExposicion(@PathVariable Integer idCoche, @PathVariable Integer idExposicion) {
        ArrayList<Coche> listaCochesByExpo = new ArrayList<>();
        for (Coche coche : getCocheList().values()) {
            if (coche.getExposicion().getNumero() == idExposicion) {
                listaCochesByExpo.add(coche);
            }
        } return "Coche: " + listaCochesByExpo.get(idCoche).toString();
    }

    private HashMap<Integer, Coche> getCocheList() {
        ArrayList<Exposicion> totalExposiciones = new ArrayList<>(getExposicionList().values());
        Propietario propietario1 = new Propietario("58551445b", "Bruno", "calle huertas", "678936453");
        HashMap<Integer, Coche> coches = new HashMap<>();
        coches.put(1, new Coche(1, "seat", "leon", "2345jhg", totalExposiciones.get(1)));
        coches.put(2, new Coche(2, "peugeot", "3008", "7865ikg", totalExposiciones.get(1)));
        coches.put(3, new Coche(3, "nissan", "micra", "7235ilg", totalExposiciones.get(1)));
        coches.put(4, new Coche(4, "fiat", "500", "7465kkg", propietario1, totalExposiciones.get(1)));
        coches.put(5, new Coche(5, "peugeot", "2008", "7235ikg", totalExposiciones.get(1)));
        return coches;
    }
    private HashMap<Integer, Exposicion> getExposicionList() {
        Exposicion exposicion1 = new Exposicion(1, "calle trinidad 9", "672653427");
        Exposicion exposicion8 = new Exposicion(8, "calle salida 20", "678937654");
        HashMap<Integer, Exposicion> exposiciones = new HashMap<>();
        exposiciones.put(1, exposicion1);
        exposiciones.put(2, exposicion8);
        return exposiciones;
    }


}

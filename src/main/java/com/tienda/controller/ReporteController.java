package com.tienda.controller;

import com.tienda.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    ReporteService reporteService;

    @GetMapping("/principal")
    public String principal(Model model) {
        return "/reportes/principal";
    }

    @GetMapping("/usuariosV")
    public ResponseEntity<Resource> usuariosV(@RequestParam String tipo) throws IOException {
        return reporteService.generaReporte("usuariosV", null, tipo);
    }

    @GetMapping("/productosV")
    public ResponseEntity<Resource> productosV(@RequestParam String tipo) throws IOException {
        return reporteService.generaReporte("productosV", null, tipo);
    }
}

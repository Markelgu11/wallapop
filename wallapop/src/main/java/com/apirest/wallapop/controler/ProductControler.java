package com.apirest.wallapop.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
//import com.apirest.wallapop.DTO.*;
import com.apirest.wallapop.model.Producto;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/producto")
public class ProductControler {
	
	private List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto(1, null, null, null, null, null, 0)
            
    ));
	@GetMapping
    public ResponseEntity<List<Producto>> getAll() {
        return ResponseEntity.ok(productos);
    }

}

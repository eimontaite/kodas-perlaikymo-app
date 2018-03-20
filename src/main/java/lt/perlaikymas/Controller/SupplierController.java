package lt.perlaikymas.Controller;


import io.swagger.annotations.Api;
import lt.perlaikymas.Model.Supplier;
import lt.perlaikymas.Service.SupplierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@Api(value = "Supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/api/supplier")
    @ResponseStatus(HttpStatus.CREATED)
    public Supplier addSupplier(@RequestBody final Supplier supplier){
        return supplierService.addSupplier(supplier);
    }
    @GetMapping("/api/supplier/{supplierId}")
    @ResponseStatus(HttpStatus.OK)
    public Supplier getBook(@PathVariable long supplierId){
        return supplierService.getSupplier(supplierId);
    }

    @PutMapping("/api/supplier/{supplierId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBook(@PathVariable long supplierId, @RequestBody Supplier supplier){
    	supplierService.updateSupplier(supplierId, supplier);
    }

    @GetMapping("/api/supplier")
    @ResponseStatus(HttpStatus.OK)
    public List<Supplier> getSupplier(){
        return supplierService.getAll();
    }

    @DeleteMapping("/api/supplier/{supplierId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeSupplier(@PathVariable long supplierId){
    	supplierService.removeSupplier(supplierId);
    }

}

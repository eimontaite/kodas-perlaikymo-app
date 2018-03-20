package lt.perlaikymas.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt.perlaikymas.Model.Supplier;
import lt.perlaikymas.Model.Util.Util;
import lt.perlaikymas.Model.Util.UtilCreate;
import lt.perlaikymas.Service.UtilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@Api(value = "Util")
public class UtilController {

    @Autowired
    private UtilService utilService;

    @PostMapping("/api/util")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "New util")
    public void addUtil(Util util){
        utilService.addUtil(util);
    }

    @GetMapping("/api/util/{utilId}")
    @ResponseStatus(HttpStatus.OK)
    public Util getService(@PathVariable long utilId){
        return utilService.getUtil(utilId);
    }

    @DeleteMapping("/api/util/{utilId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeUtil(@PathVariable long utilId){
    	utilService.removeUtil(utilId);
    }
    @GetMapping("/api/util")
    @ResponseStatus(HttpStatus.OK)
    public List<Util> getAll(){
        return utilService.getAll();
    }
    @GetMapping("/api/util/{utilId}/supplier")
    @ResponseStatus(HttpStatus.OK)
    public Set<Supplier> getUtilSuppliers(@PathVariable long utilId){
        return utilService.getUtilSuppliers(utilId);
    }

    @PostMapping("/api/util/{utilId}/supplier")
    @ResponseStatus(HttpStatus.CREATED)
    public void addNewSupplierToService(@PathVariable long utilId, @RequestBody Supplier supplier){
    	utilService.addNewSupplierToUtil(utilId, supplier);
    }

    @PostMapping("/api/util/{utilId}/supplier/{supplierId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSupplierToUtil(@PathVariable long utilId, @PathVariable long supplierId){
        utilService.addSupplierToUtil(utilId, supplierId);
    }

    @DeleteMapping("/api/util/{utilId}/supplier/{supplierId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeSupplierFromUtil(@PathVariable long utilId, @PathVariable long supplierId){
    	utilService.removeSupplierFromUtil(utilId, supplierId);
    }
    }


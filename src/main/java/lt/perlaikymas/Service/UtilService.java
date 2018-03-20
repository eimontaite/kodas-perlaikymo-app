package lt.perlaikymas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.perlaikymas.Model.Supplier;
import lt.perlaikymas.Model.Util.*;
import lt.perlaikymas.Repository.JpaSupplierRepository;
import lt.perlaikymas.Repository.JpaUtilRepository;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class UtilService {

	@Autowired
	private JpaUtilRepository jpaUtilRepository;

	@Autowired
	private JpaSupplierRepository jpaSupplierRepository;

	@Autowired
	private SupplierService supplierService;

    public Util addUtil(Util util) {
        return jpaUtilRepository.save(util);
    }

	public Util getUtil(long utilId) {
		return jpaUtilRepository.findOne(utilId);
	}

	public void removeUtil(long utilId) {
		jpaUtilRepository.delete(utilId);
	}

	public List<Util> getAll() {
		return jpaUtilRepository.findAll();
	}

	public Set<Supplier> getUtilSuppliers(long utilId) {
		return jpaUtilRepository.findOne(utilId).getSupplier();
	}

	public void addSupplierToUtil(long utilId, long supplierId) {
		Supplier supplier = jpaSupplierRepository.findOne(supplierId);
		jpaUtilRepository.findOne(utilId).getSupplier().add(supplier);
	}

	public void addNewSupplierToUtil(long utilId, Supplier supplier) {
		supplier = supplierService.addSupplier(supplier);
		jpaUtilRepository.findOne(utilId).getSupplier().add(supplier);
	}

	public void removeSupplierFromUtil(long utilId, long supplierId) {
		jpaUtilRepository.findOne(utilId).getSupplier().remove(jpaSupplierRepository.findOne(supplierId));
	}
}

package lt.perlaikymas.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.perlaikymas.Model.Supplier;
import lt.perlaikymas.Repository.JpaSupplierRepository;

import java.util.List;

@Service
@Transactional
public class SupplierService {

    @Autowired
    private JpaSupplierRepository jpaSupplierRepository;

    public Supplier addSupplier(Supplier supplier) {
        return jpaSupplierRepository.save(supplier);
    }

    public Supplier getSupplier(long supplierId) {
        return jpaSupplierRepository.findOne(supplierId);
    }

    public List<Supplier> getAll() {
        return jpaSupplierRepository.findAll();
    }

    public void removeSupplier(long supplierId) {
    	jpaSupplierRepository.delete(supplierId);
    }

    public void updateSupplier(long supplierId, Supplier supplier) {
        Supplier dbSupplier = jpaSupplierRepository.findOne(supplierId);
        dbSupplier.setTitle(supplier.getTitle());
        dbSupplier.setCity(supplier.getCity());
        dbSupplier.setCompanyCode(supplier.getCompanyCode());
        dbSupplier.setRating(supplier.getRating());

    }
}

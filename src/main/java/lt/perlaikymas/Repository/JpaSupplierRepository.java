package lt.perlaikymas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.perlaikymas.Model.Supplier;

public interface JpaSupplierRepository extends JpaRepository<Supplier, Long> {
}

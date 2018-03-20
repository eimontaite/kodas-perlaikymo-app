package lt.perlaikymas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.perlaikymas.Model.Util.Util;

public interface JpaUtilRepository extends JpaRepository<Util, Long> {
}

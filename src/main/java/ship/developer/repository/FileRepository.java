package ship.developer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ship.developer.model.FileModel;

public interface FileRepository extends JpaRepository<FileModel, Long> {
}

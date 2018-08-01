package ship.developer.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "FileSystem", schema = "SplatTest")
public class FileModel {

    private int id;
    private String name;
    private FileModel parent;
    private List<FileModel> children;
    private boolean isDir;

    public FileModel(int id, String name, FileModel parent, List<FileModel> children, boolean isDir) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.children = children;
        this.isDir = isDir;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    public FileModel getParent() {
        return parent;
    }

    public void setParent(FileModel parent) {
        this.parent = parent;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
    public List<FileModel> getChildren() {
        return children;
    }

    public void setChildren(List<FileModel> children) {
        this.children = children;
    }

    @Column(name = "is_directory", nullable = false)
    public boolean isDir() {
        return isDir;
    }

    public void setDir(boolean dir) {
        isDir = dir;
    }
}

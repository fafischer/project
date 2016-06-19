package tools.te2m.services.project.boundary;

public class EntityRefVO {
    
    private Long id;
    
    private String name;
    
    private String description;
    
    // @TODO Define and implement HATEOAS compliant link handling

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
    
}

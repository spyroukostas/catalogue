package gr.athenarc.catalogue.ui.domain;

import java.util.List;

public class Chapter {

    private String id;
    private String name;
    private String description;
    private List<String> sections;
    private String subType;
    private int order;

    public Chapter() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<String> getSections() {
        return sections;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

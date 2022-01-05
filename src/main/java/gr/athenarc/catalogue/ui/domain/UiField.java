package gr.athenarc.catalogue.ui.domain;

public class UiField {

    String id;
    String name;
    String parentId;
    String parent;
    StyledString label;
    String accessPath;
    TypeInfo typeInfo = new TypeInfo();
    boolean includedInSnippet;
    Form form;
    Display display;

    public UiField() {
        this.form = new Form();
        this.display = new Display();
    }

    public UiField(UiField field) {
        this.id = field.getId();
        this.name = field.getName();
        this.parentId = field.getParentId();
        this.parent = field.getParent();
        this.label = field.getLabel();
        this.accessPath = field.getAccessPath();
        this.typeInfo = field.getTypeInfo();
        this.form = field.getForm();
        this.display = field.getDisplay();
    }

    public TypeInfo getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(TypeInfo typeInfo) {
        this.typeInfo = typeInfo;
    }

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public StyledString getLabel() {
        return label;
    }

    public void setLabel(StyledString label) {
        this.label = label;
    }

    public String getAccessPath() {
        return accessPath;
    }

    public void setAccessPath(String accessPath) {
        this.accessPath = accessPath;
    }

    public boolean isIncludedInSnippet() {
        return includedInSnippet;
    }

    public void setIncludedInSnippet(boolean includedInSnippet) {
        this.includedInSnippet = includedInSnippet;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}

import java.util.ArrayList;
import java.util.List;

class PhysicalAssetClass {
    private List<PhysicalAssetClassProperty> classProperties = new ArrayList<>();
    private List<PhysicalAssetClass> aggregatedClasses = new ArrayList<>();
    private List<PhysicalAssetClassProperty> properties = new ArrayList<>();

    private static PhysicalAssetClass instance;

    private PhysicalAssetClass() {}

    public static PhysicalAssetClass getInstance() {
        if (instance == null) {
            instance = new PhysicalAssetClass();
        }
        return instance;
    }

    public void addClassProperty(PhysicalAssetClassProperty classProperty) {
        classProperties.add(classProperty);
    }

    public void addAggregatedClass(PhysicalAssetClass assetClass) {
        aggregatedClasses.add(assetClass);
    }

    public void addProperty(PhysicalAssetClassProperty property) {
        properties.add(property);
    }

    public List<PhysicalAssetClassProperty> getClassProperties() {
        return classProperties;
    }
}
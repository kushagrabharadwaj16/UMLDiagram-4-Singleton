import java.util.ArrayList;
import java.util.List;

class PhysicalAsset {
    private List<PhysicalAssetProperty> properties = new ArrayList<>();
    private List<PhysicalAsset> aggregatedAssets = new ArrayList<>();
    private List<PhysicalAssetProperty> values = new ArrayList<>();

    private static PhysicalAsset instance;

    private PhysicalAsset() {}

    public static PhysicalAsset getInstance() {
        if (instance == null) {
            instance = new PhysicalAsset();
        }
        return instance;
    }

    public void addProperty(PhysicalAssetProperty property) {
        properties.add(property);
    }

    public void addAggregatedAsset(PhysicalAsset asset) {
        aggregatedAssets.add(asset);
    }

    public void addValue(PhysicalAssetProperty value) {
        values.add(value);
    }

    public List<PhysicalAssetProperty> getProperties() {
        return properties;
    }
}
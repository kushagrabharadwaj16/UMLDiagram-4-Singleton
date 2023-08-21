import java.util.ArrayList;
import java.util.List;

class Equipment extends EquipmentClass {
    private List<EquipmentProperty> properties = new ArrayList<>();
    private List<Equipment> aggregatedEquipment = new ArrayList<>();
    private List<EquipmentProperty> values = new ArrayList<>();

    private static Equipment instance;

    private Equipment() {
        super();
    }

    public static Equipment getInstance() {
        if (instance == null) {
            instance = new Equipment();
        }
        return instance;
    }

    public void addProperty(EquipmentProperty property) {
        properties.add(property);
    }

    public void addAggregatedEquipment(Equipment equipment) {
        aggregatedEquipment.add(equipment);
    }

    public void addValue(EquipmentProperty value) {
        values.add(value);
    }

    public List<EquipmentProperty> getProperties() {
        return properties;
    }
}
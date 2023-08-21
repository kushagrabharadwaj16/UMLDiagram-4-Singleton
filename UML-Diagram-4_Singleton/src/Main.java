import java.util.List;

public class Main {
    public static void main(String[] args) {
        Equipment equipment = Equipment.getInstance();
        equipment.addProperty(new EquipmentProperty("Weight", "150 kg"));
        equipment.addProperty(new EquipmentProperty("Color", "Black"));

        EquipmentClass equipmentClass = EquipmentClass.getInstance();
        equipmentClass.addClassProperty(new EquipmentClassProperty("Model", "XYZ3456"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufacturer", "PYZA Inc."));

        PhysicalAsset physicalAsset = PhysicalAsset.getInstance();
        physicalAsset.addProperty(new PhysicalAssetProperty("Weight", "300 kg"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Color", "White"));

        PhysicalAssetClass physicalAssetClass = PhysicalAssetClass.getInstance();
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Model", "456GHJ"));
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Manufacturer", "CDBZ Corp."));

        EquipmentAssetMapping mapping1 = new EquipmentAssetMapping(physicalAsset, equipment);
        EquipmentAssetMapping mapping2 = new EquipmentAssetMapping(physicalAsset, equipmentClass);

        RoleBasedEquipment roleBasedEquipment = new RoleBasedEquipment("Role X");

        System.out.println("Equipment Properties:");
        List<EquipmentProperty> equipmentProperties = equipment.getProperties();
        for (EquipmentProperty property : equipmentProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }

        System.out.println("\nPhysical Asset Properties:");
        List<PhysicalAssetProperty> physicalAssetProperties = physicalAsset.getProperties();
        for (PhysicalAssetProperty property : physicalAssetProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }

        System.out.println("\nEquipment Class Properties:");
        List<EquipmentClassProperty> equipmentClassProperties = equipmentClass.getClassProperties();
        for (EquipmentClassProperty classProperty : equipmentClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }

        System.out.println("\nPhysical Asset Class Properties:");
        List<PhysicalAssetClassProperty> physicalAssetClassProperties = physicalAssetClass.getClassProperties();
        for (PhysicalAssetClassProperty classProperty : physicalAssetClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }
    }
}
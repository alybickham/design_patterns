package factory;

public class TinyHomePlan extends HousePlan {
    public TinyHomePlan(){
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials(){
        super.materials.add("Lumber");
        super.materials.add("Insulation");
        super.materials.add("Metal Roofing");
        super.materials.add("Hardware");
    }

    protected void setFeatures(){
        super.features.add("Natural Light");
        super.features.add("Creative Storage");
        super.features.add("Multipurpose areas");
        super.features.add("Multi-use applications");
    }

    public String toString(){
        return ("Tiny House\n" + super.toString());
    }

}

package factory;
import java.util.ArrayList;

public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    protected void setMaterials(){
        super.materials.add("Log Siding");
        super.materials.add("Board and Battern Siding");
        super.materials.add("White Pine");
    }

    protected void setFeatures(){
        features.add("Timbered Roof");
        super.features.add("High Insulation");
        super.features.add("Rustic Effect");
    }

    public String toString(){
        return ("Log Cabin\n"+ super.toString());
    }

}

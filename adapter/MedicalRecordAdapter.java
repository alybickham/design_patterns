import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record;
    // Health Record -> Medical Record

    MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName(){
        String [] fullName = record.getName().split(" ");
        return fullName[0];
    }

    public String getLastName(){
        String [] fullName = record.getName().split(" ");
        return fullName[1];
    }

    public Date getBirthday(){
        return record.getBirthdate();
    }

    public Gender getGender(){
        if (record.getGender().toLowerCase().equals("male")) {
            return Gender.MALE;
        }
        return Gender.MALE;
    }
    // Health Record -> Medical Record
    public void addVisit(Date date, boolean well, String description){
        String item = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        item += "Visit: " + simpleDateFormat.format(date) + "\n";
        item += "Well visit: " + well + "\n";
        item += "Comments: " + description +  "\n";

        record.getHistory().add(item);
    }

    //TO DOCHECK
    public ArrayList<Visit> getVisitHistory(){
        ArrayList<Visit> ret = new ArrayList<Visit>();
        for (String item : record.getHistory()) {
            String [] visitItems = item.trim().split("\n");
            
            int dayStringOffSet = 5;
            String dateNumsString = visitItems[0].substring(visitItems[0].indexOf(":")+dayStringOffSet).trim();
            String[] dateNums = dateNumsString.split(",");
            Date date = makeDate(Integer.parseInt(dateNums[2].trim()),
            Integer.parseInt(dateNums[1].trim()),
            Integer.parseInt(dateNums[0].trim()));

            String wellVisitString = visitItems[1].substring(visitItems[1].indexOf(":")+1).trim();
            boolean well = wellVisitString.toLowerCase().equals("true");

            String description = visitItems[2].substring(visitItems[2].indexOf(":")+1);

            ret.add(new Visit(date, well, description));
        }
        return ret;
    }

    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(record.getBirthdate());
    }

    private String getFormattedGender(){
        String genderText = record.getGender().toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }

    public String toString(){
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(getVisitHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : getVisitHistory()) {
                result += visit.toString() + "\n";
            }
        }

        return result;
    }



}

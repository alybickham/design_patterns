import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Adapats a Health Record to a Medical Record
 */
public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record;

    /**
     * Creates an adaptor to be used to access Health Record information in the same way Medical Records are accessed
     * @param record The health record that can be accessed using this adaptor
     */
    MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    /**
     * Retrieves the patient's first name
     * @return The first name of the patient
     */
    public String getFirstName(){
        String [] fullName = record.getName().split(" ");
        return fullName[0];
    }

    /**
     * Retrieves the patient's last name
     * @return The last name of the patient
     */
    public String getLastName(){
        String [] fullName = record.getName().split(" ");
        return fullName[1];
    }

    /**
     * Retrieves the patient's birthday
     * @return The date of the patient's birthday
     */
    public Date getBirthday(){
        return record.getBirthdate();
    }

    /**
     * Retrieves the patient's gender
     * @return The gender of the patient
     */
    public Gender getGender(){
        if (record.getGender().toLowerCase().equals("male")) {
            return Gender.MALE;
        }
        return Gender.MALE;
    }
    /**
     * Add's a visit to the patient's medical history
     * @param date The date of the visit
     * @param well Relays whether the visit was a wellness visit (true) or a sick vist (false)
     * @param description Relavant comments for the visit
     */
    public void addVisit(Date date, boolean well, String description){
        String item = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        item += "Visit: " + simpleDateFormat.format(date) + "\n";
        item += "Well visit: " + well + "\n";
        item += "Comments: " + description +  "\n";

        record.getHistory().add(item);
    }

    /**
     * Retrives the patient's visits as an ArrayList of Visits by going through the patients visit history
     * @return The patient's visits history as an ArrayList of Visits
     */
    public ArrayList<Visit> getVisitHistory(){
        ArrayList<Visit> ret = new ArrayList<Visit>();
        for (String item : record.getHistory()) {
            String [] visitItems = item.trim().split("\n");
            
            int dayStringOffSet = 4;
            String dateNumsString = visitItems[0].substring(visitItems[0].indexOf(":")+1+dayStringOffSet);
            String[] dateNums = dateNumsString.split(",");
            Date date = makeDate(Integer.parseInt(dateNums[2].trim()),
                                    Integer.parseInt(dateNums[1].trim()),
                                    Integer.parseInt(dateNums[0].trim()));

            String wellVisitString = visitItems[1].substring(visitItems[1].indexOf(":")+1).trim();
            boolean well = wellVisitString.toLowerCase().equals("true");

            String description = visitItems[2].substring(visitItems[2].indexOf(":")+1).trim();

            ret.add(new Visit(date, well, description));
        }
        return ret;
    }

    /**
     * Provides the date
     * @param year The year of the target date
     * @param month The month of the target date
     * @param day The day of the target date
     * @return The date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    /**
     * Formats the date
     * @return A String representation of the formatted date
     */
    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(record.getBirthdate());
    }

    /**
     * Formats the gender
     * @return A String representation of the formatted gender
     */
    private String getFormattedGender(){
        String genderText = record.getGender().toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }

    /**
     * Provides a formatted version of the patient's medical record
     * @return A String representation of the patient's medical record
     */
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

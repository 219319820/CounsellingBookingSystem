package za.ac.cput.factory;

/**Factory for CounsellingBackground
Author :Justin Nkuna(219319820)
Date:11 June 2021
 */

import za.ac.cput.entity.CounsellingBackground;

public class CounselingBackgroundFactory {

    public static CounsellingBackground createCounselingBackground(int counselingBackgroundId, String counsellorFirstName, String counsellorLastName,
                                                                   int counsellorPhoneNumber, String counsellingDate, String counsellingDuration, String treatmentTaken)


    {

        CounsellingBackground background  = new CounsellingBackground.Builder()
                .setCounselingBackgroundId(counselingBackgroundId)
                .setCounsellorFirstName(counsellorFirstName)
                .setCounsellorLastName(counsellorLastName)
                .setCounsellorPhoneNumber(counsellorPhoneNumber)
                .setCounsellingDate(counsellingDate)
                .setCounsellingDuration(counsellingDuration)
                .setTreatmentTaken(treatmentTaken).build();



        return background;


    }


}

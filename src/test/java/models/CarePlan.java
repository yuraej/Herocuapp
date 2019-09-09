package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarePlan {
    String healthDirectiveOther;
    String location;
    String toiletScheduleDescription;
    String preparingMealsProblemManagingTips;
    String lightHouseworkProblemManagingTips;
    String caregiverFamilyTransportsName;
}

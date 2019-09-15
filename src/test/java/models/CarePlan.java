package models;

import lombok.*;

@AllArgsConstructor
@Builder
@Data
public class CarePlan {
    private String healthDirectiveOther;
    private String location;
    private String toiletScheduleDescription;
    private String preparingMealsProblemManagingTips;
    private String lightHouseworkProblemManagingTips;
    private String performedByOthersName;
    private String caregiverFamilyTransportsName;
    private String financesPerformedByOthersName;
    private String shoppingProblemManagingTips;
    private String equipmentUsedOtherTips;
    private String painLocationComment;
    private String painSourceComment;
    private String painTriggeredByComment;
    private String woundCareBy;
    private String injectionsBy;
    private String otherEquipmentName;
    private String equipmentCaredForBy;

    private String culturalConsiderationsCultural;
    private String caregiverAndConsumerStrengths;
    private String importantHealthMedicalConsiderations;
    private String healthDirectiveComments;
    private String bedPositioningComments;
    private String movingTransferringComments;
    private String walkingAmbulationComments;
    private String gettingDressedComments;
    private String eatingDrinkingComments;
    private String toiletUseComments;
    private String bathingShoweringComments;
    private String brushingProblemManagementTips;
    private String brushingComments;
    private String preparingMealsComments;
    private String lightHouseworkComments;
    private String transportationComments;
    private String financesComments;
    private String phoneUseComments;
    private String shoppingComments;
    private String equipmentUsedTipsForManagingComment;
    private String medicationPrepOrganizationComments;
    private String visionComments;
    private String hearingComments;
    private String communicationComments;
    private String treatmentNotesComments;
    private String equipmentManagementNotesComments;
    private String UTAComments;
    private String dischargePlanNotesComments;
}

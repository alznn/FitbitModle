/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import com.google.gson.Gson;

/**
 *
 * @author hp
 */
public class ParserFriends {

    public static void decode_friends(String response) {
        Gson gson = new Gson();
        FriendsModel frdata = gson.fromJson(response, FriendsModel.class);

        System.out.println("\n\n\n Size: = " + frdata.friends.size());
        for (int i = 0; i < frdata.friends.size(); i++) {
            System.out.println("\n\n\n : = " + i);
            System.out.println("\nage: " + frdata.friends.get(i).users.getAge());
            System.out.println("\navatar: " + frdata.friends.get(i).users.getAvatar());
            System.out.println("\navatar150: " + frdata.friends.get(i).users.getAvatar150());
            System.out.println("\navatar640: " + frdata.friends.get(i).users.getAvatar640());
            System.out.println("\naverageDailySteps: " + frdata.friends.get(i).users.getAverageDailySteps());
            System.out.println("\ncity: " + frdata.friends.get(i).users.getCity());
            System.out.println("\nclockTimeDisplayFormat: " + frdata.friends.get(i).users.getClockTimeDisplayFormat());
            System.out.println("\norporate: " + frdata.friends.get(i).users.getCorporate());

            System.out.println("\ndateOfBirth: " + frdata.friends.get(i).users.getDateOfBirth());
            System.out.println("\ndisplayName: " + frdata.friends.get(i).users.getDisplayName());
            System.out.println("\nencodedId: " + frdata.friends.get(i).users.getEncodedId());
            System.out.println("\nfriend: " + frdata.friends.get(i).users.getFriend());
            System.out.println("\nfullName: " + frdata.friends.get(i).users.getFullName());
            System.out.println("\ngender: " + frdata.friends.get(i).users.getGender());
            System.out.println("\nheight: " + frdata.friends.get(i).users.getHeight());

            System.out.println("\nlocale: " + frdata.friends.get(i).users.getLocale());
            System.out.println("\nmemberSince: " + frdata.friends.get(i).users.getMemberSince());
            System.out.println("\nstate: " + frdata.friends.get(i).users.getState());
            System.out.println("\nstrideLengthRunning: " + frdata.friends.get(i).users.getStrideLengthRunning());
            System.out.println("\nstrideLengthWalking: " + frdata.friends.get(i).users.getStrideLengthWalking());
            System.out.println("\ntimezone: " + frdata.friends.get(i).users.getTimezone());
            System.out.println("\nweight: " + frdata.friends.get(i).users.getWeight());
            for (int j = 0; j < frdata.friends.get(i).users.topBadges.size(); j++) {
                System.out.println("\nbadgeGradientEndColor: " + frdata.friends.get(i).users.topBadges.get(j).getBadgeGradientEndColor());
                System.out.println("\nbadgeGradientStartColor: " + frdata.friends.get(i).users.topBadges.get(j).getBadgeGradientStartColor());
                System.out.println("\nbadgeType: " + frdata.friends.get(i).users.topBadges.get(j).getBadgeType());
                System.out.println("\ncategory: " + frdata.friends.get(i).users.topBadges.get(j).getCategory());
                System.out.println("\ndateTime " + frdata.friends.get(i).users.topBadges.get(j).getDateTime());
                System.out.println("\ndescription: " + frdata.friends.get(i).users.topBadges.get(j).getDescription());
                System.out.println("\nearnedMessage: " + frdata.friends.get(i).users.topBadges.get(j).getEarnedMessage());
                System.out.println("\nencodedId: " + frdata.friends.get(i).users.topBadges.get(j).getEncodedId());
                System.out.println("\nimage100px: " + frdata.friends.get(i).users.topBadges.get(j).getImage100px());
                System.out.println("\nimage100px: " + frdata.friends.get(i).users.topBadges.get(j).getImage125px());
                System.out.println("\nimage300px: " + frdata.friends.get(i).users.topBadges.get(j).getImage300px());
                System.out.println("\nimage50px: " + frdata.friends.get(i).users.topBadges.get(j).getImage50px());
                System.out.println("\nimage75px: " + frdata.friends.get(i).users.topBadges.get(j).getImage75px());
                System.out.println("\nmarketingDescription" + frdata.friends.get(i).users.topBadges.get(j).getMarketingDescription());
                System.out.println("\nmobileDescription" + frdata.friends.get(i).users.topBadges.get(j).getMobileDescription());
                System.out.println("\nname" + frdata.friends.get(i).users.topBadges.get(j).getName());
                System.out.println("\nShareImage640px" + frdata.friends.get(i).users.topBadges.get(j).getShareImage640px());
                System.out.println("\n shareText" + frdata.friends.get(i).users.topBadges.get(j).getShareText());
                System.out.println("\n shortDescription" + frdata.friends.get(i).users.topBadges.get(j).getShortDescription());
                System.out.println("\n shortName" + frdata.friends.get(i).users.topBadges.get(j).getShortName());
                System.out.println("\n imesAchieved" + frdata.friends.get(i).users.topBadges.get(j).getImesAchieved());
                System.out.println("\n Value" + frdata.friends.get(i).users.topBadges.get(j).getValue());
            }
        }
    }
}

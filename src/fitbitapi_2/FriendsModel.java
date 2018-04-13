/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitbitapi_2;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author hp
 */
public class FriendsModel {

    @SerializedName("friends")
    public List<friends> friends;

    public class friends implements Serializable {
        @SerializedName("user")
        public user users;
    }

    public class user implements Serializable {

        @SerializedName("age")
        public String age;
        @SerializedName("avatar")
        public String avatar;
        @SerializedName("avatar150")
        public String avatar150;
        @SerializedName("avatar640")
        public String avatar640;
        @SerializedName("averageDailySteps")
        public String averageDailySteps;
        @SerializedName("city")
        public String city;
        @SerializedName("clockTimeDisplayFormat")
        public String clockTimeDisplayFormat;
        @SerializedName("corporate")
        public String corporate;
        @SerializedName("dateOfBirth")
        public String dateOfBirth;
        @SerializedName("displayName")
        public String displayName;
        @SerializedName("encodedId")
        public String encodedId;
        @SerializedName("feature")
        public List<feature> feature;
        @SerializedName("friend")
        public String friend;
        @SerializedName("fullName")
        public String fullName;
        @SerializedName("gender")
        public String gender;
        @SerializedName("height")
        public String height;
        @SerializedName("locale")
        public String locale;
        @SerializedName("memberSince")
        public String memberSince;
        @SerializedName("state")
        public String state;
        @SerializedName("strideLengthRunning")
        public String strideLengthRunning;
        @SerializedName("strideLengthWalking")
        public String strideLengthWalking;
        @SerializedName("timezone")
        public String timezone;
        @SerializedName("topBadges")
        public List<topBadges> topBadges;
        @SerializedName("weight")
        public String weight;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar150() {
            return avatar150;
        }

        public void setAvatar150(String avatar150) {
            this.avatar150 = avatar150;
        }

        public String getAvatar640() {
            return avatar640;
        }

        public void setAvatar640(String avatar640) {
            this.avatar640 = avatar640;
        }

        public String getAverageDailySteps() {
            return averageDailySteps;
        }

        public void setAverageDailySteps(String averageDailySteps) {
            this.averageDailySteps = averageDailySteps;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getClockTimeDisplayFormat() {
            return clockTimeDisplayFormat;
        }

        public void setClockTimeDisplayFormat(String clockTimeDisplayFormat) {
            this.clockTimeDisplayFormat = clockTimeDisplayFormat;
        }

        public String getCorporate() {
            return corporate;
        }

        public void setCorporate(String corporate) {
            this.corporate = corporate;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getEncodedId() {
            return encodedId;
        }

        public void setEncodedId(String encodedId) {
            this.encodedId = encodedId;
        }

        public String getFriend() {
            return friend;
        }

        public void setFriend(String friend) {
            this.friend = friend;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public String getMemberSince() {
            return memberSince;
        }

        public void setMemberSince(String memberSince) {
            this.memberSince = memberSince;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStrideLengthRunning() {
            return strideLengthRunning;
        }

        public void setStrideLengthRunning(String strideLengthRunning) {
            this.strideLengthRunning = strideLengthRunning;
        }

        public String getStrideLengthWalking() {
            return strideLengthWalking;
        }

        public void setStrideLengthWalking(String strideLengthWalking) {
            this.strideLengthWalking = strideLengthWalking;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }

    public class feature implements Serializable {}

    public class cheers implements Serializable {}

    public class topBadges implements Serializable {
        @SerializedName("cheers")
        public List<cheers> cheers;
        @SerializedName("badgeGradientEndColor")
        public String badgeGradientEndColor;
        @SerializedName("badgeGradientStartColor")
        public String badgeGradientStartColor;
        @SerializedName("badgeType")
        public String badgeType;
        @SerializedName("category")
        public String category;
        @SerializedName("dateTime")
        public String dateTime;
        @SerializedName("description")
        public String description;
        @SerializedName("earnedMessage")
        public String earnedMessage;
        @SerializedName("encodedId")
        public String encodedId;
        @SerializedName("image100px")
        public String image100px;
        @SerializedName("image125px")
        public String image125px;
        @SerializedName("image300px")
        public String image300px;
        @SerializedName("image50px")
        public String image50px;
        @SerializedName("image75px")
        public String image75px;
        @SerializedName("marketingDescription")
        public String marketingDescription;
        @SerializedName("mobileDescription")
        public String mobileDescription;
        @SerializedName("name")
        public String name;
        @SerializedName("shareImage640px")
        public String shareImage640px;
        @SerializedName("shareText")
        public String shareText;
        @SerializedName("shortDescription")
        public String shortDescription;
        @SerializedName("shortName")
        public String shortName;
        @SerializedName("imesAchieved")
        public String imesAchieved;
        @SerializedName("value")
        public String value;

        public String getBadgeGradientEndColor() {
            return badgeGradientEndColor;
        }

        public void setBadgeGradientEndColor(String badgeGradientEndColor) {
            this.badgeGradientEndColor = badgeGradientEndColor;
        }

        public String getBadgeGradientStartColor() {
            return badgeGradientStartColor;
        }

        public void setBadgeGradientStartColor(String badgeGradientStartColor) {
            this.badgeGradientStartColor = badgeGradientStartColor;
        }

        public String getBadgeType() {
            return badgeType;
        }

        public void setBadgeType(String badgeType) {
            this.badgeType = badgeType;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getEarnedMessage() {
            return earnedMessage;
        }

        public void setEarnedMessage(String earnedMessage) {
            this.earnedMessage = earnedMessage;
        }

        public String getEncodedId() {
            return encodedId;
        }

        public void setEncodedId(String encodedId) {
            this.encodedId = encodedId;
        }

        public String getImage100px() {
            return image100px;
        }

        public void setImage100px(String image100px) {
            this.image100px = image100px;
        }

        public String getImage125px() {
            return image125px;
        }

        public void setImage125px(String image125px) {
            this.image125px = image125px;
        }

        public String getImage300px() {
            return image300px;
        }

        public void setImage300px(String image300px) {
            this.image300px = image300px;
        }

        public String getImage50px() {
            return image50px;
        }

        public void setImage50px(String image50px) {
            this.image50px = image50px;
        }

        public String getImage75px() {
            return image75px;
        }

        public void setImage75px(String image75px) {
            this.image75px = image75px;
        }

        public String getMarketingDescription() {
            return marketingDescription;
        }

        public void setMarketingDescription(String marketingDescription) {
            this.marketingDescription = marketingDescription;
        }

        public String getMobileDescription() {
            return mobileDescription;
        }

        public void setMobileDescription(String mobileDescription) {
            this.mobileDescription = mobileDescription;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getShareImage640px() {
            return shareImage640px;
        }

        public void setShareImage640px(String shareImage640px) {
            this.shareImage640px = shareImage640px;
        }

        public String getShareText() {
            return shareText;
        }

        public void setShareText(String shareText) {
            this.shareText = shareText;
        }

        public String getShortDescription() {
            return shortDescription;
        }

        public void setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
        }

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getImesAchieved() {
            return imesAchieved;
        }

        public void setImesAchieved(String imesAchieved) {
            this.imesAchieved = imesAchieved;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}

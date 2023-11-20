package modlingTheData;

import com.google.gson.annotations.SerializedName;

public class InvalidCredentials {
    @SerializedName("InvalidUserName")
    public InvalidUserName invalidUserName;
    @SerializedName("InvalidPassword")
    public InvalidPassword invalidPassword;
}

package modlingTheData;


import com.google.gson.annotations.SerializedName;

public class Login {

    @SerializedName("ValidCredentials")

    public ValidCredentials validCredentials;
    @SerializedName("InvalidCredentials")
    public InvalidCredentials invalidCredentials;
}

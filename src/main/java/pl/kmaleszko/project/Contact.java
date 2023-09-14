package pl.kmaleszko.project;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class Contact {
  @NotBlank(message = "Name is required")
  private String fullName;
  @Digits(integer = 9, fraction = 0, message = "MobileNumber is required")
  private String mobileNumber;
  @NotBlank(message = "EmailAddress is required")
  private String emailAddress;
  @NotBlank(message = "EmailSubject is required")
  private String emailSubject;
  @NotBlank(message = "YourMessage is required")
  private String yourMessage;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public String getYourMessage() {
    return yourMessage;
  }

  public void setYourMessage(String yourMessage) {
    this.yourMessage = yourMessage;
  }

  @Override
  public String toString() {
    return "Contact{" +
        "fullName='" + fullName + '\'' +
        ", mobileNumber='" + mobileNumber + '\'' +
        ", emailAddress='" + emailAddress + '\'' +
        ", emailSubject='" + emailSubject + '\'' +
        ", yourMessage='" + yourMessage + '\'' +
        '}';
  }
}

package pl.kmaleszko.project;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class Contact {
  private String fullName;
  private String mobileNumber;
  private String emailAddress;
  private String emailSubject;
  private String yourMessage;

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

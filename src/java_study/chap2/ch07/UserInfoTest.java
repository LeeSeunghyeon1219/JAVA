package java_study.chap2.ch07;

public class UserInfoTest {

    public static void main(String[] args) {

        //Default 생성자 기능 사용함
        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userPassWord = "zxcvbn12345";
        userLee.userName = "Lee";
        userLee.phoneNumber = "01034556699";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());

        //만든 생성자 사용
        UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
        System.out.println(userKim.showUserInfo());
    }
}

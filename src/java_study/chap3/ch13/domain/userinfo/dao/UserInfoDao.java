package java_study.chap3.ch13.domain.userinfo.dao;
import java_study.chap3.ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
    //User에 대한 DB operation 할때 dao 에서 제공되어야 할 메서드를 선언한 인터페이스
    //mysql이면 mysql에 맞게, oracle이면 oracle에 맞게 구현
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}

package java_study.chap3.ch13.userinfo.web;

import java_study.chap3.ch13.domain.userinfo.dao.UserInfoDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java_study.chap3.ch13.domain.userinfo.UserInfo;
import java_study.chap3.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import java_study.chap3.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
    public static void main(String[]args) throws IOException{
        //UserInfoDao 인터페이스를 활용하는 클라이언트 프로그램
        //파일 타입이 오라클이면 오라클 버전으로 파일 버전이 mysql이면 mysql 버전으로 돌아가게 한다.
        //파일을 찾으면 같은 프로젝트에서 먼저 찾는다.
        FileInputStream fis=new FileInputStream("db.properties");

        Properties prop= new Properties();
        prop.load(fis);
        String dbType = prop.getProperty("DBTYPE");
        System.out.println("DB Type: "+dbType);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("강아지");
        userInfo.setPasswd("1111");

        UserInfoDao userInfoDao = null;

        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        }
        else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMySqlDao();
        }
        else{
            System.out.println("db support error");
            return;
        }
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);


    }
}

/*
인터페이스와 다형성
하나의 인터페이스를 여러 객체가 구현하게 되면 클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있음 ( 다형성)
ex) Sorting -> bubble sort/quick sort/heap sort가 있음
ex) UserInfoWeb이 있는데, 사용하기 위해 userInfoDao란 인터페이스를 만듬 / oracleDao, mysqlDao등을 구현해놓고,
    DB가 버그 패치같은 걸 하면 일일이 해야하기 때문에 기능 업그레이드 하기 힘들고 하기 때문에 솔루션 회사에서 버전관리를 어떻게 하느냐가 중요함

인터페이스를 활용한 dao 구현하기
DB에 회원 정보를 넣는 dao(data access object)를 여러 DB 제품이 지원될 수 있게 구현함
환경파일(db.properties) 에서 database의 종류에 대한 정보를 읽고 그 정보에 맞게 dao 인스턴스를 생성하여 실행될 수 있게 함


*/
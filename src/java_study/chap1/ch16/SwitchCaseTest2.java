package java_study.chap1.ch16;

public class SwitchCaseTest2 {

    public static void main(String[] args) {
        String medal = "Gold"; // Switch Case문은 문자도 가능하다!

        switch(medal) {

            case "Gold":
                System.out.println("금메달 입니다.");
                break;
            case "Silver":
                System.out.println("은메달 입니다.");
                break;
            case "Bronze":
                System.out.println("동메달 입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }
    }
}


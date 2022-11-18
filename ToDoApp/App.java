import User.AppUser;
import User.BaseUser;

public class App {
    public static void main(String[] args) {
        
    BaseUser baseUser = new AppUser("Abia","Naa","xxxx","augusta.addy@meltwater.org");
     
    System.out.println(baseUser.getId());
    }
}

package User;
public class AdminUser extends BaseUser {

    public AdminUser(String firstName, String middleName, String password, String email) {
        super(firstName, middleName, password, email);
        
    }

    //these show how the methods are being implemented from the BaseUser
    @Override
    void Login(String email, String password) {
       
        
    }

    @Override
    void Register() {
        
       
    }
    
}

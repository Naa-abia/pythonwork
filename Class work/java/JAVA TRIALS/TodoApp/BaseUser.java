import java.rmi.server.UID;
import java.util.Date;

/*Base user class is the parent of all the users 
 * This is the implementation for all the user-like class
 */

public abstract class BaseUser {

    // MARK: the id of the user
    private UID id;

    // the first name of the user
    private String firstName;

    // MARK: the last name of the user
    private String middleName;

    // MARK:the password of the user
    private String password;

    // MARK: the email address of the user
    private String email;

    // MARK: track the number of times user tries to login
    private int noOfLoginAttempt;

    // MARK : track the status of the user
    private boolean isBlocked;

    // MARK : date the user was created
    private Date dateCreated;

    // MARK : date the user logged in
    private Date lastLoginDate;

    // MARK : date the user logged out
    private Date lastLogoutDate;

    public UID getId() {
        return this.id;
    }

    // this is not needed because we dont want people using the set ID
    // public void setId(UID id) {
    // this.id = id;
    // }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // we dont want anyone to get the users password
    // public String getPassword() {
    // return this.password;
    // }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNoOfLoginAttempt() {
        return this.noOfLoginAttempt;
    }

    public void setNoOfLoginAttempt(int noOfLoginAttempt) {
        this.noOfLoginAttempt = noOfLoginAttempt;
    }

    public boolean isIsBlocked() {
        return this.isBlocked;
    }

    public boolean getIsBlocked() {
        return this.isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastLogoutDate() {
        return this.lastLogoutDate;
    }

    public void setLastLogoutDate(Date lastLogoutDate) {
        this.lastLogoutDate = lastLogoutDate;
    }

    // the way you want the object to look like is the toString method so it behaves
    // in a way we want it to .This is the visualization of the object.
    
    @Override
    public String toString() {
        return "{id:" + this.id + "}";
    }

    // abstract void Login ();

    // abstract void Register();

}

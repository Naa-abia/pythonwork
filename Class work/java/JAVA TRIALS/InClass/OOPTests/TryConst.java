public class TryConst {

  private String username;

  public TryConst(String password) {
  }

  public void setUsername(String username) {
    if (username.trim().length() > 5) {
      this.username = username;
    }
  }

  public String getUsername() {
    return username;
  }

  public TryConst() {

  }

  public TryConst(String password, String username) {
    this.username = username;
  }

  public static void main(String[] args) {
    new TryConst();

  }
}
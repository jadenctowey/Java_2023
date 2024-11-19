import java.util.ArrayList;
import java.util.List;

public class Account {
    private String username;
    private String password;
    private String accountType;
    private List<Content> favorites;

    public Account(String username, String password, String accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
        this.favorites = new ArrayList<Content>();
}

    public String getUsername() {
    return this.username;
}

    public void setUsername(String username) {
        this.username = username;
}

    public String getPassword() {
        return this.password;
}

    public void setPassword(String password) {
        this.password = password;
}

    public String getAccountType() {
        return this.accountType;
}

    public void setAccountType(String accountType) {
        this.accountType = accountType;
}

    public List<Content> getFavorites() {
        return this.favorites;
}

    public void favorite(Content content) {
        this.favorites.add(content);
}

    @Override
        public String toString() {
        return "Username: " + this.username + "\nAccount Type: " + this.accountType;
}
}
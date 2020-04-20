public class Server {
    User[] users = new User[999999999];
    public String search(String id){
        return users[User.hash(id)].certs();
    }
    public void certify(String id, int tool){
        users[User.hash(id)].certify(tool);
    }
    public void revoke(String id, int tool){
        users[User.hash(id)].revoke(tool);
    }
    public void addUser(String name, String id){
        int code = User.hash(id);
        users[code] = new User(name, id);
    }
}

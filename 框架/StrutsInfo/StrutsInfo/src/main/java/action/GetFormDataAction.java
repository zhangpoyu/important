package action;

import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;

public class GetFormDataAction extends ActionSupport{
    private Map<String,User> users;
    public Map<String,User> getUsers() {
        return users;
    }
    public void setUsers(Map<String,User> users) {
        this.users = users;
    }
    public String execute() {
        Set<String> keys = users.keySet();
        for(String key : keys) {
            System.out.println(key+"="+users.get(key));
        }
        return NONE;
    }
}

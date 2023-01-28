package com.driver;

import java.util.Date;
import java.util.List;

public class WhatsappService {


    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public boolean isNewUser(String mobile) {
        return whatsappRepository.isNewUser(mobile);
    }


    public String createUser(String name, String mobile) {

        whatsappRepository.createUser(name, mobile);
        return "SUCCESS";

    }

    public Group createGroup(List<User> users) {

        return whatsappRepository.createGroup(users);
    }

    public int createMessage(String content) {
        return whatsappRepository.createMessage(content);
    }

    public int sendMessage(Message message, User sender, Group group) {

        return whatsappRepository.sendMessage(message, sender, group);
    }

    public String changeAdmin(User approver, User user, Group group) {
        return whatsappRepository.changeAdmin(approver, user, group);
    }

}
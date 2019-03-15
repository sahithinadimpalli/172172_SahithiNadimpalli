package org.cg.root.messenger.service;

import java.util.ArrayList;
import java.util.List;

import org.cg.root.messenger.model.Message;

public class MessageService {
public  List<Message> getAllMessages(){ 
Message m1=new Message(1, "hello World", "sahithi");
Message m2=new Message(2,"hai sahithi","sahi");
List<Message> list=new ArrayList<>();
list.add(m1);
list.add(m2);
return list;
}
}

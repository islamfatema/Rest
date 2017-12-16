package com.rest.REST.service;

import java.util.ArrayList;
import java.util.List;

import com.rest.REST.model.Message;

public class MessageService {
public List<Message> getAllMessges(){
	Message m1=new Message(1L,"Hello World","chamok");
	Message m2=new Message(2L,"Hello Jersey","Danial");
	Message m3=new Message(3L,"Hello Friend","Tom");
	Message m4=new Message(4L,"Hello India","Bombay");
	Message m5=new Message(5L,"Hello NewYork","Queens");
	List<Message> list=new ArrayList<>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	list.add(m5);
	return list;
}
}

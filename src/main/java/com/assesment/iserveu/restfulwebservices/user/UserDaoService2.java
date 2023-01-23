package com.assesment.iserveu.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;




@Component
public class UserDaoService2 {
	private static int userscount=0;
private static List<User2>users = new ArrayList<>();
static
{
	users.add(new User2(++userscount,"Binaya","binaya619",7750036993l,"binayaprsamantaray@gmail.com","123456789"));
	users.add(new User2(++userscount,"Jagdish","jag619",9337524149l,"i.jagdish@gmail.com","123456789"));
	
}
public List<User2> findAll(){
	return users;
}

public User2 findOne(int id) {
	Predicate<? super User2> predicate = user -> user.getId().equals(id); 
	return users.stream().filter(predicate).findFirst().orElse(null);
}
public User2 save(User2 user) {
	user.setId(++userscount);
	users.add(user);
	return user;
}
public void deleteById(int id) {
	Predicate<? super User2> predicate = user -> user.getId().equals(id); 
	users.removeIf(predicate);
}

}

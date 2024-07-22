package com.Ayush.StonksTrading.Repository;



import com.Ayush.StonksTrading.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}

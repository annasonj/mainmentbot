//package com.example.mainmentbot.api;
//
//import java.util.List;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.mainmentbot.domain.User;
//import com.example.mainmentbot.domain.Role;
//import com.example.mainmentbot.service.UserService1;
//
//import lombok.Data;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api")
//public class UserResource {
//	
//	private final UserService1 userService = null;
//	
//	@GetMapping("/users")
//	public ResponseEntity<List<User>>getUsers(){
//		return ResponseEntity.ok().body(userService.getUsers());
//	}
//	
//	@PostMapping("/user/save")
//	public ResponseEntity<User>saveUser(@RequestBody User user){
//		return ResponseEntity.ok().body(userService.saveUser(user));
//	}
//	
//	@PostMapping("/role/save")
//	public ResponseEntity<Role>saveRole(@RequestBody Role role){
//		return ResponseEntity.ok().body(userService.saveRole(role));
//	}
//	
////	@PostMapping("/role/addtouser")
////	public ResponseEntity<?>addRoleToUser(@RequestBody RoleToUserForm form){
////		userService.addRoleToUser(form.getUsername(),form.getName());
////		return ResponseEntity.ok().build();
////	}
////	
//	
//
//
//
//}
//
//@Data
//
//class RoleToUserForm{
//	private String username;
//	private String name;
//}

package com.dev.otp.Alert.Controller;

import com.dev.otp.Alert.Model.UserEntity;
import com.dev.otp.Alert.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Ecom")
public class UserController {

    @Autowired
    UserService us;
   @PostMapping("/SaveUser")
    public ResponseEntity<String> SaveUserDB(@RequestBody UserEntity user)
   {
       return us.userSave(user);
   }


}

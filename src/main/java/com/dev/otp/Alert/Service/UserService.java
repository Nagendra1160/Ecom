package com.dev.otp.Alert.Service;

import com.dev.otp.Alert.Model.UserEntity;
import com.dev.otp.Alert.Repo.DBStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

@Service

public class UserService {
    @Autowired
    DBStore db;
    public ResponseEntity<String> userSave(UserEntity us) {
       try {
           db.save(us);
          return ResponseEntity.ok("User Saved");
       }
       catch(Exception e)
       {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving user");
       }

    }
}

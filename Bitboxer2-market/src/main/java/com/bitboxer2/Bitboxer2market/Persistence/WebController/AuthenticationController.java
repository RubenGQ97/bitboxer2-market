package com.bitboxer2.Bitboxer2market.Persistence.WebController;


import com.bitboxer2.Bitboxer2market.Security.JWTUtils;
import com.bitboxer2.Bitboxer2market.domain.Authenticacion.AuthenticacionRequest;
import com.bitboxer2.Bitboxer2market.domain.Authenticacion.AuthenticationResponse;
import com.bitboxer2.Bitboxer2market.domain.Service.BitboxerUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private BitboxerUserDetailsService bitboxerUserDetailsService;
    @Autowired
    private  JWTUtils jwtUtils;

    @PostMapping("authentication")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticacionRequest authenticacionRequest){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticacionRequest.getUserName(), authenticacionRequest.getPassword()));
            UserDetails userDetails = bitboxerUserDetailsService.loadUserByUsername(authenticacionRequest.getUserName());
            String jwToken = jwtUtils.generateToken(userDetails);

            return new ResponseEntity<>(new AuthenticationResponse(jwToken), HttpStatus.OK);
        }catch(BadCredentialsException e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }


    }
}

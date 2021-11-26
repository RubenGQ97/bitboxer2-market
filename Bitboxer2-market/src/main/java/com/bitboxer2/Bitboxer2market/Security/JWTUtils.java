package com.bitboxer2.Bitboxer2market.Security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtils {

    private static final String KEY= "pruebaclave";

    public String generateToken(UserDetails userDetails){
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+1000 *60 * 60 ))
                .signWith(SignatureAlgorithm.HS256,KEY).compact();
    }

    public boolean validadorToken(String token, UserDetails userDetails){
        return userDetails.getUsername().equals(extractuser(token)) && !isExpired(token);
    }


    public String extractuser(String token){
        return getClaims(token).getSubject();
    }

    public boolean isExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }


    private Claims getClaims(String token){
        return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody();
    }
}
